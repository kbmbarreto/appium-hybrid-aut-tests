# Manipulação dos Elementos

Após [criarmos o nosso MobileElement](/docs/criacao-mobile-element.md) agora vamos 'colocar vida' em nosso elemento, fazer com que ele clique ou adicionar um texto que queremos. Para isso criamos uma classe java
que deve ser chamada com o mesmo prefixo da classe do element, se a classe element foi criada com o nome ``LoginElement.java`` a classe page deve ser criado com o nome ``LoginPage.java`` e extendo a classe element.

****

## Inicialização da classe:
A classe page sempre deve ter inicializado a pagefactory para fazer o gerenciamento destes elementos. Segue abaixo um exemplo:

````java
public LoginPage() {
    PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
}
````

Dentro da classe ```BasePage.java``` podemos encontrar diversos métodos auxiliares e dentro da sua page só basta chamar algum destes métodos conforme o exemplo:
````java
public void tapButtonProximo() {
    tap(getButtonProximo());
}

````
