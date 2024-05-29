# Desafio de Contador em Java

## Descrição

Este desafio consiste em criar um programa em Java que recebe dois parâmetros do usuário e realiza uma contagem de números baseada nesses parâmetros. O objetivo principal é validar os parâmetros e lançar uma exceção personalizada caso os valores sejam inválidos.

## Estrutura do Código

O código é composto por três partes principais:
1. A classe `Contador` com o método `main`.
2. O método `contar` que realiza a contagem.
3. A classe de exceção personalizada `ParametrosInvalidosException`.

## Funcionalidades

1. **Entrada de Dados**: O programa solicita ao usuário que insira dois números inteiros.
2. **Validação de Parâmetros**: O programa verifica se o segundo número é maior que o primeiro. Caso contrário, uma exceção personalizada `ParametrosInvalidosException` é lançada.
3. **Contagem**: Se os parâmetros forem válidos, o programa realiza uma contagem do primeiro número até o segundo, imprimindo cada número no console.

## Exceção Personalizada

A exceção `ParametrosInvalidosException` é utilizada para sinalizar que os parâmetros fornecidos pelo usuário são inválidos. Isso ajuda a manter o código mais limpo e facilita a identificação de erros específicos relacionados aos parâmetros.

## Conclusão

Este desafio aborda conceitos importantes em programação, como a manipulação de entrada de dados, controle de fluxo com condicionais, laços de repetição e tratamento de exceções personalizadas. Implementar este tipo de solução ajuda a desenvolver habilidades essenciais para lidar com situações onde a validação e o tratamento de erros são cruciais para o bom funcionamento do software.
