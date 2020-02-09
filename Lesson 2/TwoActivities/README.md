# Two Activities

## Lançar uma segunda activity
```java
Intent intent = new Intent(this, Nome_Da_Class.class);
startActivity(intent);
```

## Guardar e restaurar instâncias de uma Activity
Dependendo do recursos do sistema e do comportamento do utilizador, cada Activity na nossa app pode ser destruída e reconstruída.

You may have noticed this behavior in the last section when you rotated the device or emulator. Rotating the device is one example of a device configuration change. Although rotation is the most common one, all configuration changes result in the current Activity being destroyed and recreated as if it were new. If you don't account for this behavior in your code, when a configuration change occurs, your Activity layout may revert to its default appearance and initial values, and your users may lose their place, their data, or the state of their progress in your app.

The state of each Activity is stored as a set of key/value pairs in a Bundle object called the Activity instance state. The system saves default state information to instance state Bundle just before the Activity is stopped, and passes that Bundle to the new Activity instance to restore.

To keep from losing data in an Activity when it is unexpectedly destroyed and recreated, you need to implement the onSaveInstanceState() method. The system calls this method on your Activity (between onPause() and onStop()) when there is a possibility the Activity may be destroyed and recreated.

The data you save in the instance state is specific to only this instance of this specific Activity during the current app session. When you stop and restart a new app session, the Activity instance state is lost and the Activity reverts to its default appearance. If you need to save user data between app sessions, use shared preferences or a database. You learn about both of these in a later practical.