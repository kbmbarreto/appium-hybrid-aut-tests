package br.com.cbz.pagefactory.elements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;

@Data
public class TelaInicialElement {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    MobileElement txtTitulo;

    @iOSXCUITFindBy(accessibility = "teste")
    MobileElement txtTituloIos;

    @AndroidFindBy(id = "br.com.lambdateam.pedicalc:id/btn_doses")
    @iOSXCUITFindBy(accessibility = "teste2")
    MobileElement btnDosesMedicamentos;
}