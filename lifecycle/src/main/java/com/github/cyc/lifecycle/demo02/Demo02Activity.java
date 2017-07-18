package com.github.cyc.lifecycle.demo02;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.github.cyc.lifecycle.R;

public class Demo02Activity extends AppCompatActivity {
    private static final String TAG = "Demo02Activity";

    private static final String KEY_STATE = "key_state";
    private static final String STATE = "state";

    public static void start(Context context) {
        Intent intent = new Intent(context, Demo02Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo02);

        if (savedInstanceState == null) {
            Log.i(TAG, "onCreate()");
        } else {
            String data = savedInstanceState.getString(KEY_STATE);
            Log.i(TAG, "onCreate(), restore: " + data);
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_STATE, STATE);
        Log.i(TAG, "onSaveInstanceState(), save: " + STATE);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String data = savedInstanceState.getString(KEY_STATE);
        Log.i(TAG, "onRestoreInstanceState(), restore: " + data);
    }
}
