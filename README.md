# ICM
Introdução à Computação Móvel.

## Table of Contents

- [ICM](#icm)
  * [Table of Contents](#table-of-contents)
  * [Authors](#authors)
  * [Notes](#notes)
  * [Lesson 1](https://github.com/user-cube/ICM/tree/master/Lesson%201)
  * [Lesson 2](https://github.com/user-cube/ICM/tree/master/Lesson%202)

## Authors
* [Rui Coelho](https://github.com/user-cube)


## Notes
Enable Dark Mode
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
In `styles.xml` change to 
```xml
<resources>

    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.DayNight">
        <!-- Customize your theme here. -->
    </style>
</resources>
```