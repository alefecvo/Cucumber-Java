#language: pt

Funcionalidade: Realizar login

  @tag1
  Cenário: Realizar login passando dados via código
    Dado que estou no portal
    Quando informar usuario "maria" senha "3939 via comando
    E acionar botão entrar
    Então estarei logado

  @tag2
  Cenário: Realizar login passando dados via tabela
    Dado que estou no portal
    Quando informar usuario senha via tabela
      | NOME  | SENHA |
      | alefe | 1234  |
    E acionar botão entrar
    Então estarei logado

  @tag3
  Esquema do Cenário: Realizar login passando dados via template
    Dado que estou no portal
    Quando informar usuario <usuario> senha <senha> via template
    E acionar botão entrar
    Então estarei logado
    Exemplos:
      | usuario   | senha  |
      | "marcelo" | "1212" |