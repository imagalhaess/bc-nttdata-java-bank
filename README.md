
# Java Bank 1 [Em desenvolvimento]

Projeto desenvolvido como parte do **bootcamp da DIO em parceria com a NTTData**.  
Tem como objetivo colocar em prática os fundamentos da Programação Orientada a Objetos em Java, além de aplicar boas práticas como Clean Code, SOLID e versionamento com Git.

---

## Descrição

Este projeto simula carteiras financeiras (`Wallets`) e operações com dinheiro (`Money`), permitindo:

- Registro de transações (`MoneyAudity`)
- Investimentos com atualização de saldo
- Controle de histórico de cada movimentação
- Operações básicas com regras de negócio simples

---

## Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Git e GitHub com fluxo profissional
- IntelliJ IDEA como IDE principal
- Princípios de **Clean Code**
- Uso de coleções (`List<>`) e API de `Streams`

---

## Tecnologias utilizadas

| Tecnologia     | Descrição                        |
|----------------|----------------------------------|
| Java 17        | Linguagem principal               |
| Gradle         | Sistema de build (Kotlin DSL)     |
| IntelliJ IDEA  | Ambiente de desenvolvimento       |
| Git + GitHub   | Controle de versão                |
| Lombok         | Redução de código boilerplate     |

---

## Como rodar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/imagalhaess/java-bank1.git
   ```

2. Importe no IntelliJ IDEA como projeto Gradle

3. Rode a classe `Main.java` para simular operações

---

## Estrutura do projeto

```text
src/
└── main/
    └── java/
        └── br/com/dio/
            ├── model/         # Entidades principais (Wallet, Money, etc.)
            ├── exception/     # (Reservado para tratamento de exceções)
            └── repository/    # (Reservado para camadas de dados)
```

---

## Origem do projeto

Este projeto foi proposto como desafio prático dentro do **bootcamp de Java para iniciantes**, promovido pela [DIO](https://dio.me) em parceria com a **NTTData**.  
Ele foi adaptado e expandido por mim para fins de estudo aprofundado e aplicação de boas práticas no desenvolvimento orientado a objetos.

---

## Autoria

Desenvolvido por [Isabela M.](https://github.com/imagalhaess) como parte do seu processo de transição para a área de tecnologia, com foco em desenvolvimento backend e clean code ❤️
