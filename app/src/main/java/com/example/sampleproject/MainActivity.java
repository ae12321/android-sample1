package com.example.sampleproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sampleproject.popup.PopupClass;
import com.example.sampleproject.preference.ParentPreferenceFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button popupButton = findViewById(R.id.btnPopup);
        popupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupClass popupClass = new PopupClass();
                popupClass.showPopupWindow(view);
            }
        });

        Button preferenceButton = findViewById(R.id.btnPreference);
        preferenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.settings_container, new ParentPreferenceFragment()).commit();

            }
        });

    }
}