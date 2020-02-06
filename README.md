# ICM

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