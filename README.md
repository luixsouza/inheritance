# Sistema de Conta Empresarial

Este projeto é uma aplicação em Java desenvolvida com o objetivo de praticar e compreender conceitos de **Herança** em Programação Orientada a Objetos (POO). A aplicação simula operações básicas de uma conta empresarial, utilizando a estrutura de classes e métodos para demonstrar o reaproveitamento e a extensão de funcionalidades.

## Objetivos de Aprendizado

- Compreender e aplicar o conceito de **Herança** em POO.
- Demonstrar como uma classe derivada pode reutilizar e estender métodos e atributos de uma classe base.
- Explorar a implementação de métodos específicos na classe derivada (`BusinessAccount`).

## Funcionalidades

- **Consultar saldo**: Ver o saldo atual da conta.
- **Realizar empréstimos**: Solicitar um empréstimo respeitando o limite disponível.
- **Realizar saques**: Retirar dinheiro da conta (se o saldo permitir).
- **Atualizar limite de empréstimo**: Alterar o limite de crédito da conta.

## Estrutura do Projeto

- **Classe Base (`Account`)**: Contém atributos e métodos básicos, como número da conta, titular e saldo.
- **Classe Derivada (`BusinessAccount`)**: Herda da classe base e adiciona funcionalidades específicas, como limite de empréstimos e taxa de transação.

## Tecnologias Utilizadas

- **Java SE**
- Programação Orientada a Objetos (POO)
- Scanner para entrada de dados
