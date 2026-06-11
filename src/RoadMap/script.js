// ─── SCROLL PROGRESS BAR ───
const bar = document.getElementById('progress-bar');
window.addEventListener('scroll', () => {
  const scrollTop = window.scrollY;
  const docH = document.documentElement.scrollHeight - window.innerHeight;
  bar.style.width = Math.min(100, (scrollTop / docH) * 100) + '%';
}, { passive: true });

// ─── INTERSECTION OBSERVER (section headers + timeline items) ───
const revealEls = document.querySelectorAll('.section-header, .module-card');
const observer = new IntersectionObserver((entries) => {
  entries.forEach(e => {
    if (e.isIntersecting) {
      setTimeout(() => e.target.classList.add('visible'), 80 * (e.target.dataset.delay || 0));
      observer.unobserve(e.target);
    }
  });
}, { threshold: 0.1 });

// ─── ROADMAP GRID CARDS ───
const roadmapObserver = new IntersectionObserver((entries) => {
  entries.forEach(e => {
    if (e.isIntersecting) {
      const cards = e.target.querySelectorAll('.month-card');
      cards.forEach((card, i) => {
        setTimeout(() => card.classList.add('visible'), i * 60);
      });
      roadmapObserver.unobserve(e.target);
    }
  });
}, { threshold: 0.05 });

const roadmapGrid = document.querySelector('.roadmap-grid');
if (roadmapGrid) roadmapObserver.observe(roadmapGrid);

// ─── STAGGERED REVEAL for module cards ───
const moduleObserver = new IntersectionObserver((entries) => {
  entries.forEach(e => {
    if (e.isIntersecting) {
      const cards = e.target.querySelectorAll('.module-card');
      cards.forEach((card, i) => {
        setTimeout(() => card.classList.add('visible'), i * 60);
      });
      moduleObserver.unobserve(e.target);
    }
  });
}, { threshold: 0.05 });

document.querySelectorAll('.module-card').forEach((el, i) => {
  el.dataset.delay = i;
});

revealEls.forEach(el => observer.observe(el));

const grid = document.querySelector('.modules-grid');
if (grid) moduleObserver.observe(grid);

// ─── DONE SYSTEM ───
const STORAGE_KEY = 'java_roadmap_done';

function loadDone() {
  try { return JSON.parse(localStorage.getItem(STORAGE_KEY)) || []; }
  catch { return []; }
}

function saveDone(arr) {
  try { localStorage.setItem(STORAGE_KEY, JSON.stringify(arr)); } catch {}
}

function updateProgress() {
  const done = loadDone();
  const total = 12;
  const count = done.length;
  const pct = Math.round((count / total) * 100);

  document.getElementById('progress-fill').style.width = pct + '%';
  document.getElementById('progress-pct').textContent = pct + '%';
  document.getElementById('done-count').textContent = count.toString().padStart(2, '0');
}

function toggleDone(card) {
  const month = card.dataset.month;
  const done = loadDone();
  const idx = done.indexOf(month);
  const statusEl = card.querySelector('.card-status');
  const hintEl = card.querySelector('.card-hint');

  if (idx === -1) {
    done.push(month);
    card.classList.add('done');
    statusEl.textContent = 'CONCLUÍDO';
    hintEl.textContent = '[ ✓ MÓDULO DESBLOQUEADO ]';
    showToast('✓ MÊS ' + month.padStart(2, '0') + ' CONCLUÍDO!');
  } else {
    done.splice(idx, 1);
    card.classList.remove('done');
    statusEl.textContent = 'PENDENTE';
    hintEl.textContent = '[ CLIQUE PARA MARCAR COMO CONCLUÍDO ]';
    showToast('↩ MÊS ' + month.padStart(2, '0') + ' REATIVADO');
  }

  saveDone(done);
  updateProgress();
}

function applyDoneState() {
  const done = loadDone();
  document.querySelectorAll('.month-card').forEach(card => {
    const month = card.dataset.month;
    if (done.includes(month)) {
      card.classList.add('done');
      card.querySelector('.card-status').textContent = 'CONCLUÍDO';
      card.querySelector('.card-hint').textContent = '[ ✓ MÓDULO DESBLOQUEADO ]';
    }
  });
  updateProgress();
}

// ─── TOAST ───
let toastTimer;
function showToast(msg) {
  const toast = document.getElementById('toast');
  toast.textContent = msg;
  toast.classList.add('show');
  clearTimeout(toastTimer);
  toastTimer = setTimeout(() => toast.classList.remove('show'), 2600);
}

// ─── INIT ───
applyDoneState();
