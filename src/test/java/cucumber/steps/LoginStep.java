package cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.*;

public class LoginStep {
    @Dado("que estou no portal")
    public void queEstouNoPortal() {
        System.out.println("Dado que estou no portal AQUI");
    }

    @Quando("informar usuario (.+) senha (.+) via comando")
    public void informarUsuarioSenhaViaCodigo(String usuario, String senha) {
        System.out.println("Quando informar dados via código - Nome: " + usuario + " Senha: " + senha);
    }

    @Quando("informar usuario senha via tabela")
    public void informarUsuarioSenhaViaTabela(DataTable dataTable) {
        String nome = String.valueOf(dataTable.column(0).get(1));
        Long senha = Long.valueOf(dataTable.column(1).get(1));

        System.out.println("Quando informar dados via tabela - Nome: " + nome + " Senha: " + senha);
    }

    @Quando("informar usuario (.+) senha (.+) via template")
    public void informarUsuarioSenhaViaTemplate(String usuario, String senha) {
        System.out.println("Quando informar dados via template - Nome: " + usuario + " Senha: " + senha);
    }

    @E("acionar botão entrar")
    public void acionarBotaoEntrar() {
        System.out.println("E acionar botao entrar AQUI");
    }

    @Então("estarei logado")
    public void estareiLogado() {
        System.out.println("Então estarei logado AQUI");
    }
}
