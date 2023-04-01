# UFSCAR-Trabalho-POO-Modelo-Sistema-Bancario
Representação em java de um modelo resumido de um sistema bancário. Trabalho realizado na disciplina de Programação POO e Qualidade de Código no curso de pós graduação em desenvolvimento web da Ufscar

## Modelagem

``` mermaid
---
title: Modelo de Sistema Bancário
---
classDiagram
    class Banco {
        -UUID id
        -String numero
        -String cnpj
        -String nome
        +volumeDeDinheiro() BigDecimal
        +jurosAReceber() BigDecimal
    }

    class Agencia {
        -UUID id
        -String numero
        -String nome
        +volumeDeDinheiro() BigDecimal
        +jurosAReceber() BigDecimal
    }

    class Conta {
        <<Abstract>>
        -UUID id
        -String numero
        -BigDecimal saldo
    }

    class ContaCorrente {
        -BigDecimal limite
        -BigDecimal taxaDeJuro
    }

    class ContaPoupanca {
        -Short diaDeAniversario
        -BigDecimal taxaDeCorrecao
    }

    class ContaInvestimento {
        -LocalDate dataInicio
        -BigDecimal taxaDeRendimento

    }

    Banco "1" -- "1..*" Agencia
    Agencia "1" -- "0..*" Conta
    Conta <|-- ContaCorrente
    Conta <|-- ContaPoupanca
    Conta <|-- ContaInvestimento
```
