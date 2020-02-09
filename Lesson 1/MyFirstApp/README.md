# Versão Mínima da API

Devemos configurar a API para o mínimo 15 que é praticamente compatível com todos os dispositivos do mercado.

# Função Log
A função `Log` é usado como debugger para as nossas aplicações.

<table>
    <tr>
        <th>Função</th>
        <th>Flag</th>
        <th>Funcionalidade</th>
    </tr>
    <tr>
        <td>Log.d</td>
        <td>DEBUG</td>
        <td>Fazer log da mensagem e da exceção</td>
    </tr>
    <tr>
        <td>Log.e</td>
        <td>ERROR</td>
        <td>Fazer log de mensagens de erro</td>
    </tr>
    <tr>
        <td>Log.i</td>
        <td>INFO</td>
        <td>Fazer log de uma mensagem de informação </td>
    </tr>
    <tr>
        <td>Log.v</td>
        <td>VERBOSE</td>
        <td>Fazer log verboso da mensagem e da exceção</td>
    </tr>
    <tr>
        <td>Log.w</td>
        <td>WARN</td>
        <td>Fazer log de um warning</td>
    </tr>
</table>

# Logcat

Local onde podemos ver os nosso logs.

# Build.gradle

Ficheiro que necessitamos para adicionar bibliotecas ao sistema e/ou alterar a versão das mesmas.

# Android Manifest

Devemos alterar este ficheiro por forma a adicionar componentes e permissões para a nossa APP.

# Sumário
* To install Android Studio, go to Android Studio and follow the instructions to download and install it.
* When creating a new app, ensure that API 15: Android 4.0.3 IceCreamSandwich is set as the Minimum SDK.
* To see the app's Android hierarchy in the Project pane, click the Project tab in the vertical tab column, and then choose Android in the popup menu at the top.
* Edit the build.gradle(Module:app) file when you need to add new libraries to your project or change library versions.
* All code and resources for the app are located within the app and res folders. The java folder includes activities, tests, and other components in Java source code. The res folder holds resources, such as layouts, strings, and images.
* Edit the AndroidManifest.xml file to add features components and permissions to your Android app. All components for an app, such as multiple activities, must be declared in this XML file.
* Use the Android Virtual Device (AVD) manager to create a virtual device (also known as an emulator) to run your app.
Add Log statements to your app, which display messages in the Logcat pane as a basic tool for debugging.
* To run your app on a physical Android device using Android Studio, turn on USB Debugging on the device. Open Settings > About phone and tap Build number seven times. Return to the previous screen (Settings), and tap Developer options. Choose USB Debugging.