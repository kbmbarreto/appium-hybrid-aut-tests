# Criação da feature e Steps

Para criar o nosso cenário de automação nós utilizamos o cucumber com o método de escrita Gherkin,
assim temos um package com o nome de [features](/src/test/java/br/com/navpro/features) onde colocarmos os nossos cenários e para complementar nós temos o package
[steps](/src/test/java/br/com/navpro/steps).
Abaixo adiciono um exemplo de uma feature e como ela é implementada pelo step.

****
**Onboarding.feature:**
````feature
# encoding: UTF-8
# language: pt

  @onboarding
  Funcionalidade: Onboarding - Tela de boas vindas.


  Cenário: Navegação entre telas
    Dado que estou na tela inicial do Onboarding
    Quando eu avançar para as demais telas
    Então eu devo estar no login
````

**OnboardingStep.java**
````java
package br.com.navpro.steps;

import br.com.navpro.pagefactory.pages.LoginPage;
import br.com.navpro.pagefactory.pages.OnboardingPage;
import br.com.navpro.utils.Utils;
import io.cucumber.java.pt.*;
import static org.junit.Assert.*;

public class OnboardingStep {

    public OnboardingPage onboardingPage = new OnboardingPage();
    public LoginPage loginPage = new LoginPage();

    @Dado("que estou na tela inicial do Onboarding")
    public void que_estou_na_tela_inicial_do_onboarding() {
        ...
    }

    @Quando("eu avançar para as demais telas")
    public void eu_avancar_para_as_demais_telas() throws Exception {
        ...
    }

    @Então("eu devo estar no login")
    public void eu_devo_estar_no_login() {
        ...
    }
}
````