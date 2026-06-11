# ExerciciosJava

Repositório de exercícios práticos em Java — desde conceitos introdutórios até pequenas aplicações de console que simulam cenários do mundo real.

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
        ├── calculadoraDescHardware.java    # Des desconto em compra de hardware
        └── CalculadoraBonusEscala.java     # Bônus por plantões e faltas
```

## Como executar

Compile e execute com o JDK 11+:

```bash
javac src/Exercicios/SimuladorVendaNoteBook.java -d out
java -cp out Exercicios.SimuladorVendaNoteBook
```

Substitua `SimuladorVendaNoteBook` pelo nome da classe desejada.

## Licença

Distribuído sob licença MIT. Veja [LICENSE](LICENSE) para mais informações.
