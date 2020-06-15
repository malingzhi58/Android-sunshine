package com.example.android.sunshine;

import android.os.Bundle;
import android.preference.Preference;

import androidx.preference.PreferenceFragmentCompat;

class SettingFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}