## Criação MobileElement

Após realizar a [captura dos locators](/docs/captura-localizadores.md) agora chegou a hora de transformarmos estes locators em MobileElements para assim podermos manipula-los dentros de nossa automação. 
Utilizamos o package [elements](/src/test/java/br/com/navpro/pagefactory/elements) para criar os MobileElements.

****

#### Nome da Classe
Afim de padronizar a criação, utilizaremos o nome da classe igual ao nome da tela que está sendo mapeada, assim realizando uma divisão por telas. Por fim, a classe deverá sempre extender a **BasePage.java** para podermos utilizar alguns métodos auxiliares.
**Ex.:** Se capturamos os locators da tela de login o nome da classe será: ```LoginElement.java```

#### Criação dos mobile elements

Para colocar os locations nós utilizamos as annotations java [@AndroidFindBy](https://appium.github.io/java-client/io/appium/java_client/pagefactory/AndroidFindBy.html) para a plataforma Android e [@iOSXCUITFindBy](https://appium.github.io/java-client/io/appium/java_client/pagefactory/iOSXCUITFindBy.html) para a plataforma de iOS.
Para o nome da váriavel é recomendado utilizar o tipo de elemento como prefixo, para um botão == button, para um campo == field e para um texto == text. Segue abaixo um exemplo de uma classe ilustrando a criação.

````java
package br.com.navpro.pagefactory.elements;

import br.com.navpro.pagefactory.pages.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;

@Data
public class LoginElement extends BasePage {

    @AndroidFindBy(xpath = "br.com.dasa.hospitais.patientmonitor.hml:id/bt_first_step_login_register")
    @iOSXCUITFindBy(accessibility = "apple_result_text")
    MobileElement buttonCadastrar;

}
````
