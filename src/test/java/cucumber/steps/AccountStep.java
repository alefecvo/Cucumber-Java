package cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AccountStep {
    @Dado("que estou no portal para cadastro")
    public void queEstouNoPortalParaCadastro() {
        System.out.println("Dado que estou no portal para cadastro AQUI");
    }

    @Quando("informar usuario (.+) senha (.+) via comando para cadastro")
    public void informarUsuarioSenhaViaCodigoParaCadastro(String usuario, String senha) {
        System.out.println("Quando informar dados via código para cadastro - Nome: " + usuario + " Senha: " + senha);
    }

    @E("acionar botão salvar")
    public void acionarBotaoSalvar() {
        System.out.println("E acionar botao salvar AQUI");
    }

    @Então("estarei com conta criada")
    public void estareiComContaCriada() {
        System.out.println("Então estarei com conta criada AQUI");
    }
}
