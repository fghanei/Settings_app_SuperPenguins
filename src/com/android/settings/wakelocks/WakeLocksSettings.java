package com.android.settings;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.app.FragmentManager;
import android.util.Log;
import android.view.View;
import android.content.pm.PackageManager;
import android.content.Context;
import android.view.KeyEvent;
import java.io.IOException;

public class WakeLocksSettings extends SettingsPreferenceFragment {
    private String packageName = "com.kodarkooperativet.blackplayerfree";

    @Override
    protected int getMetricsCategory() {
        return InstrumentedFragment.WAKELOCKS;
    }

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.mpkostek.superpenguins");
        if (launchIntent != null) { 
            Log.i("SP Settings", "starting SuperPenguins");
            startActivity(launchIntent);//null pointer check in case package name was not found
        } else {
            Log.i("SP Settings", "Apparantly SuperPenguins does not exist");
        }
        finish();
        getActivity().dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_BACK));
        getActivity().dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_BACK));
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("SP Settings", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("SP Settings", "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("SP Settings", "onDestroy");
    }
}
