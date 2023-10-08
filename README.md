# Projeto para automação de UI de apps mobile Android e iOS

<p>Projeto criado para automação de tela utilizando a técnica de testes cruzados,
podendo utilizar o mesmo cenários de testes para ambas plataformas (Android e iOS)</p>

## Ferramentas utilizadas

- Java
- Junit
- Cucumber
- Appium
- Maven
- Allure Report

## Execução
Para executar passamos alguns argumentos para os testes:

`-Dtest=`: Esse argumento deve receber o nome da suite que fica localizado dentro do pacote runners.
`-Dplatform=`: Recebe para qual plataforma deve ser executado o teste **ANDROID** ou **IOS**
`-Denv=`: Recebe qual ambiente vai ser executada a automação.

Para executar para Android: `mvn clean test -Dtest=DefaultRunner -Dplatform=ANDROID -Denv=hml`  
Para executar para iOS: `mvn clean test -Dtest=NomeDoTeste -Dplatform=IOS -Denv=hml`

Para gerar os relatórios do Allure: `allure generate allure-results`  
Para executar o relatório do Allure: `alure serve`

## Tutorial de construção/organição de código.

- [Captura de locators](docs/captura-localizadores.md)
- [Criação de MobileElement](docs/criacao-mobile-element.md)
- [Manipular Elementos](docs/manipulacao-elementos.md)
- [Criação da features e steps](docs/criacao-feat-steps.md)