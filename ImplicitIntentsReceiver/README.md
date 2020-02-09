# Receber Intents Implícitas
Para que a nossa app possa receber intens implícitas podemos definir um filtro no `AndroidManifest.xml` no qual indicamos quais o tipo de Intent implícitas estamos interessados em receber na nossa `Activity`.
Para corresponder a um pedido a um aplicativo específico instalado no dispositivo, o sistema Android associa sua `Intent` implícita a uma `Activity` cujos filtros de Intent indicam que eles podem executar essa ação.<br>
Quando várias apps instaladas correspondem a este requisito, o utilizador recebe uma caixa de seleção onde pode escolhar qual a app que vai lidar com a Intent.

## Filtros
É de notar que no `AndroidManifest.xml` já existe um filtro por default:
```xml
<intent-filter>
   <action android:name="android.intent.action.MAIN" />
   <category android:name="android.intent.category.LAUNCHER" />
</intent-filter>
```
Este filtro indica que esta Activity é o ponto principal de entrada para o aplicativo (possui uma `android.intent.action.MAIN`) e que essa Activity deve aparecer como um item de nível superior no iniciador (possui uma `android.intent.category.LAUNCHER`)

```xml
<intent-filter>
    <action android:name="android.intent.action.VIEW" />
    <category android:name="android.intent.category.DEFAULT" />
    <category android:name="android.intent.category.BROWSABLE" />
    <data android:scheme="http" android:host="developer.android.com" />
</intent-filter>
```
Estas linhas definem:

| Tipo de filtro | Valor                                                           | Match                                                                                                                 |
|----------------|-----------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| action         | "android.intent.action.VIEW"                                    | Qualquer Intent com ações na View                                                                                     |
| category       | "android.intent.category.DEFAULT"                               | Qualquer Intent Implícita. Esta categoria deve ser incluída na nossa Acitivity para receber qualquer Intent Implícita |
| category       | "android.intent.category.BROWSABLE"                             | Pede links pesquisáveis para páginas web, emails ou outras fontes                                                     |
| data           | android:scheme="http" <br> android:host="developer.android.com" | URIs que contêm o esquema do método http e o host name do developer.android.com                                       |

## Sumário 
* An implicit Intent allows you to activate an Activity if you know the action, but not the specific app or Activity that will handle that action.
* An Activity that can receive an implicit Intent must define Intent filters in the AndroidManifest.xml file that match one or more Intent actions and categories.
* The Android system matches the content of an implicit Intent and the Intent filters of any available Activity to determine which Activity to activate. If there is more than one available Activity, the system provides a chooser so the user can pick one.
* The ShareCompat.IntentBuilder class makes it easy to build an implicit Intent for sharing data to social media or email.