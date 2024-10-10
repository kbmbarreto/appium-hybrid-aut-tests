package br.com.cbz.pagefactory.pages;

import br.com.cbz.pagefactory.elements.TelaInicialElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static br.com.cbz.pagefactory.pages.BasePage.getText;
import static br.com.cbz.pagefactory.pages.BasePage.tap;
import static br.com.cbz.utils.Utils.getDriver;

public class TelaInicialPage extends TelaInicialElement {

    public TelaInicialPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    public String getTextTxtTitulo() {
        return getText(getTxtTitulo());
    }

    public String getTextTxtTituloIos() {
        return getText(getTxtTituloIos());
    }

    public void tapButtonDoseMedicamentos() {
        tap(getBtnDosesMedicamentos());
    }
}