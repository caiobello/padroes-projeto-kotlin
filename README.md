# Padrões de Projeto no Código

Este repositório contém exemplos de código que demonstram a implementação de vários padrões de projeto em Kotlin. Abaixo, estão os padrões de projeto e uma breve descrição de cada um deles:

## Padrão de Projeto Adapter

O **Padrão de Projeto Adapter** é uma técnica que permite que objetos com interfaces incompatíveis trabalhem juntos. Ele age como um intermediário, adaptando a interface de uma classe para outra interface esperada pelo cliente. No código presente, você encontrará uma implementação do Adapter para converter moedas.

## Padrão de Projeto Builder

O **Padrão de Projeto Builder** é utilizado para criar objetos complexos passo a passo, separando o processo de construção da representação final do objeto. Isso melhora a legibilidade e a flexibilidade do código, especialmente ao criar objetos com muitos parâmetros ou configurações diferentes. O exemplo demonstra a construção de pedidos personalizados.

## Funções de Extensão

As **Funções de Extensão** são um recurso poderoso que permite adicionar métodos a classes existentes sem modificar o código-fonte original. Elas facilitam a criação de novas funcionalidades para tipos de dados existentes. Neste código, há um exemplo de função de extensão que gera "slugs" para títulos e autores de livros.

## Padrão de Projeto Singleton

O **Padrão de Projeto Singleton** assegura que exista apenas uma instância de uma classe e fornece um ponto centralizado para acessá-la. Isso é útil para manter uma única ocorrência de uma classe responsável pelo controle de recursos compartilhados. No código apresentado, há uma implementação de um gerenciador de usuários como um Singleton.
