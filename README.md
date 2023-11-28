
# Conta Bancária

Este projeto simula o funcionamento de uma conta bancária, permitindo que clientes realizem saques em um caixa eletrônico. A implementação dos métodos é baseada nos cenários especificados utilizando a linguagem Gherkin e testes com o framework Cucumber.

  

## Estrutura do Projeto

- Conta.java: Contém a implementação dos métodos relacionados à conta bancária.

- Runner.java: Arquivo de configuração do Cucumber para execução dos testes.

## Funcionalidades Implementadas

### Cliente Especial com Saldo Negativo

- Dado um cliente especial com saldo de -200 reais.

- Quando for solicitado um saque no valor de 100 reais.

- Então deve efetuar o saque e atualizar o saldo da conta para -300 reais.

- E verificar se o cliente é especial.

### Cliente Comum com Saldo Negativo

- Dado um cliente comum com saldo atual de -200 reais.

- Quando solicitar um saque de 200 reais.

- Então não deve efetuar o saque e deve retornar a mensagem de Saldo Insuficiente.

## Como Executar o Projeto

- Clone o repositório para a sua máquina local.

- Abra o projeto em sua IDE de preferência.

- Execute a classe Runner.java para rodar os testes Cucumber.

## Resultados Esperados

Ao executar os testes, o console deve exibir informações sobre os cenários de teste, indicando se foram bem-sucedidos ou não. Certifique-se de que os resultados condizem com as expectativas.

  

## Exemplo de Saída no Console

...

1 Scenarios (1 passed)

3 Steps (3 passed)

0m0,428s

  

java.lang.ExceptionInInitializerError

...

  

Print de Execução

  

## Documentação

A documentação completa do projeto, incluindo a classe Conta.java e o arquivo de teste Cucumber, pode ser encontrada na pastas pastas src/main ou test/java e o doc esta na raiz doc.

Abra o arquivo doc/index.html em seu navegador para acessar a documentação.

  

- Autor: Douglas Machado - Matrícula: 151385

  

- Observação: Este projeto foi desenvolvido como parte de um exercício individual para a disciplina. Qualquer dúvida, entre em contato com o autor.