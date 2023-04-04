package br.com.cbz.steps;

import br.com.cbz.pagefactory.pages.TelaInicialPage;
import br.com.cbz.utils.Utils;
import io.cucumber.java.pt.*;
import org.junit.Assert;

public class TelaInicialStep {

    public TelaInicialPage telaInicialPage = new TelaInicialPage();

    @Dado("que eu visualizei o titulo do app")
    public void queEuVisualizeiOTituloDoApp() {
        if (Utils.getPlatform().equalsIgnoreCase("ANDROID")) {
            Assert.assertEquals("Pedicalc", telaInicialPage.getTextTxtTitulo());
        } else {
            Assert.assertEquals("Pedicalc", telaInicialPage.getTextTxtTituloIos());
        }
    }

    @Quando("eu visualizar o botão na tela")
    public void euVisualizarOBotãoNaTela() {
        telaInicialPage.getBtnDosesMedicamentos().isDisplayed();
    }

    @Entao("Devo clicar no botao")
    public void devoClicarNoBotao() {
        telaInicialPage.tapButtonDoseMedicamentos();
    }
}