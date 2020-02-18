# ICM
Introdução à Computação Móvel.

- [ICM](#icm)
  * [Authors](#authors)
  * [Lesson 1](https://github.com/user-cube/ICM/tree/master/Lesson%201)
  * [Lesson 2](https://github.com/user-cube/ICM/tree/master/Lesson%202)
  * [Challenges](https://github.com/user-cube/ICM/tree/master/Challenges)
  * [Dark Mode](#dark-mode)
## Authors
* [Rui Coelho](https://github.com/user-cube)


## Dark Mode
To set up Dark Mode e must create an `onConfigurationChanged`that will detect when user changes his theme color.
```java
    /**
     * Sets dark or light mode according to user changes.
     *
     * @param newConfig New configuration according to user changes.
     */
    public void onConfigurationChanged (Configuration newConfig){
        int currentNightMode = newConfig.uiMode & Configuration.UI_MODE_NIGHT_MASK;
        switch (currentNightMode) {
            case Configuration.UI_MODE_NIGHT_NO:
                // Night mode is not active, we're using the light theme
                break;
            case Configuration.UI_MODE_NIGHT_YES:
                // Night mode is active, we're using dark theme
                break;
        }
    }
```
And in `styles.xml` we must change: 
```xml
<resources>

    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.DayNight">
        <!-- Customize your theme here. -->
    </style>
</resources>
```