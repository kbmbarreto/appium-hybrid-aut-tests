# Captura de elementos

Para realizar a busca e captura do elementos é utilizado o [Appium Desktop](https://github.com/appium/appium-desktop/releases)
para criar o servidor e o [Appium inspector](https://github.com/appium/appium-inspector/releases)

****
## Configurações Appium Server GUI

- Server address: `localhost`
- Server port: ``4723``
- basePath: ``/wd/hub``

## Configurações Appium inspector

### Android:
````json
{
  "platformName": "Android",
  "appium:appPackage": "br.com.dasa.hospitais.patientmonitor.hml",
  "appium:appActivity": "com.patientmonitor.features.splash.activity.AppSplashActivity",
  "appium:app": "/path/to/android/app.apk"
}
````

### iOS:
````json
{
  "platformName": "iOS",
  "appium:platformVersion": "15.2",
  "appium:deviceName": "iPhone 11",
  "appium:automationName": "XCUITest",
  "appium:udid": "00008030-00160D281AD1402E",
  "appium:app": "/path/to/ios/nav-pro.ipa"
}
````

Ao executar o server a `Start Session` no appium inspector você estará habilitado para navegar na arvore de ambientes.

![Imagem Appium inspector executando](docs/imgs/appium-inspector.png)