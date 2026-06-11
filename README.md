# ExerciciosJava

![Java](https://img.shields.io/badge/Java-11%2B-orange?logo=openjdk)
![License](https://img.shields.io/github/license/Gbotelho110/ExerciciosJava)
![Repo size](https://img.shields.io/github/repo-size/Gbotelho110/ExerciciosJava)

Repositório de exercícios práticos em Java — desde conceitos introdutórios até pequenas aplicações de console que simulam cenários do mundo real.

## Índice

- [Pré-requisitos](#pré-requisitos)
- [Estrutura](#estrutura)
- [Como executar](#como-executar)
- [Contribuindo](#contribuindo)
- [Licença](#licença)

## Pré-requisitos

- [JDK 11+](https://jdk.java.net/)
- (Opcional) IntelliJ IDEA

## Estrutura

```
src/
├── academydevdojomaratonajava/   # Exercícios do curso DevDojo Maratona Java
│   ├── DevDojo1.java                  # Hello World
│   ├── DevDojo2TipoPrimitivo.java     # Tipos primitivos e casting
│   ├── Aula03TipoPrimitivosExercicio.java  # Relatório com tipos primitivos
│   └── Aula04OperadoresAritimeticos.java   # Operadores aritméticos, relacionais e lógicos
│
├── DioJavaIA/                      # Exercícios DIO / IA
│   └── exercicios.java                 # Múltiplos exercícios (salário, idade, área, câmbio)
│
└── Exercicios/                     # Exercícios práticos autorais
        ├── sistemaVigilante.java           # Cálculo salarial de vigilante
        ├── SimuladorVendaNoteBook.java     # Simulador de venda de notebooks
        ├── GerenciamentoRiscoTrader.java   # Gerenciamento de risco para traders
        ├── EstruturasSequencial04.java     # Calculadora de salário por hora
        ├── calculadoraDescHardware.java    # Desconto em compra de hardware
        └── CalculadoraBonusEscala.java     # Bônus por plantões e faltas
```

## Como executar

Compile e execute com o JDK 11+:

```bash
javac src/Exercicios/SimuladorVendaNoteBook.java -d out
java -cp out Exercicios.SimuladorVendaNoteBook
```

Substitua `SimuladorVendaNoteBook` pelo nome da classe desejada.

## Contribuindo

Veja [CONTRIBUTING.md](CONTRIBUTING.md) para guia de contribuição e [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) para código de conduta.

## Licença

Distribuído sob licença MIT. Veja [LICENSE](LICENSE) para mais informações.
