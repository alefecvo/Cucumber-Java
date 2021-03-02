#language: pt

Funcionalidade: Realizar criação de conta

  @tag3
  Cenário: Realizar criação de conta passando dados via código
    Dado que estou no portal para cadastro
    Quando informar usuario "julio" senha "3030" via comando para cadastro
    E acionar botão salvar
    Então estarei com conta criada
