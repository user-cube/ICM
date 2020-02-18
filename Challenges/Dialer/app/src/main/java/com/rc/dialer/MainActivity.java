package com.rc.dialer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText number;

    /**
     * List of permissions to be asked.
     */
    String[] permissions = new String[]{
            Manifest.permission.CALL_PHONE
    };

    /**
     * Check the permissions we need
     * are satisfied, if not, asks the
     * user to give permissions.
     *
     * @return the user feedback.
     */
    private boolean checkPermission() {
        int result;
        List<String> listPermissionsNeeded = new ArrayList<>();
        for (String p : permissions) {
            result = ContextCompat.checkSelfPermission(this, p);
            if (result != PackageManager.PERMISSION_GRANTED) {
                listPermissionsNeeded.add(p);
            }
        }
        if (!listPermissionsNeeded.isEmpty()) {
            ActivityCompat.requestPermissions(this, listPermissionsNeeded.toArray(new String[listPermissionsNeeded.size()]), 100);
            return false;
        }
        return true;
    }

    public void onConfigurationChanged(Configuration newConfig) {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.numberToDial);
        checkPermission();
    }

    public void sendToDialer(View view) {
        String num = number.getText().toString();
        Uri add = Uri.parse("tel:" + num);
        Intent intent = new Intent(Intent.ACTION_CALL, add);

        if (intent.resolveActivity(getPackageManager()) != null) {
            if (checkPermission() != true) {
                return;
            }
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void addToDialer(View view) {
        String num =  number.getText().toString();
        switch (view.getId()) {
            case R.id.push_button:
                number.setText(num + "1");
                break;
            case R.id.push_button2:
                number.setText(num + "2");
                break;
            case R.id.push_button5:
                number.setText(num + "3");
                break;
            case R.id.push_button6:
                number.setText(num + "4");
                break;
            case R.id.push_button7:
                number.setText(num + "5");
                break;
            case R.id.push_button8:
                number.setText(num + "6");
                break;
            case R.id.push_button9:
                number.setText(num + "7");
                break;
            case R.id.push_button10:
                number.setText(num + "8");
                break;
            case R.id.push_button11:
                number.setText(num + "9");
                break;
            case R.id.push_button12:
                number.setText(num + "*");
                break;
            case R.id.push_button13:
                number.setText(num + "0");
                break;
            case R.id.push_button14:
                number.setText(num + "#");
                break;

        }
    }

    public void deleteChar(View view) {
        String num = number.getText().toString();
        String result = null;
        if ((num != null) && (num.length() > 0)) {
            result = num.substring(0, num.length() - 1);
        }
        number.setText(result);
    }
}
