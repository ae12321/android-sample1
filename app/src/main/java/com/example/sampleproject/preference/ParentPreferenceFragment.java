package com.example.sampleproject.preference;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.example.sampleproject.R;

// https://maku77.github.io/android/fw/preference-fw.html
public class ParentPreferenceFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preference, rootKey);
    }
}
