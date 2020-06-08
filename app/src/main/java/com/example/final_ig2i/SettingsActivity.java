package com.example.final_ig2i;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    // A déclarer dans le MANIFESTE !
    // Cf. <activity android:name=".SettingsActivity"></activity>
    // dans la balise <application>


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }
}
