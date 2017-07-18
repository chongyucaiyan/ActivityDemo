package com.github.cyc.lifecycle.demo01;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.github.cyc.lifecycle.R;

public class Demo01Activity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "Demo01Activity";

    private AlertDialog mDialog;

    public static void start(Context context) {
        Intent intent = new Intent(context, Demo01Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate()");
        setContentView(R.layout.activity_demo01);
        initContentView();
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

    private void initContentView() {
        findViewById(R.id.btn_start_dialog_activity).setOnClickListener(this);
        findViewById(R.id.btn_start_another_activity).setOnClickListener(this);
        findViewById(R.id.btn_show_dialog).setOnClickListener(this);
    }

    private void showDialog() {
        if (mDialog == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(R.string.dialog);
            builder.setMessage(R.string.dialog);
            builder.setPositiveButton(R.string.ok, null);
            mDialog = builder.create();
        }
        mDialog.show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_start_dialog_activity:
                DialogActivity.start(this);
                break;

            case R.id.btn_start_another_activity:
                AnotherActivity.start(this);
                break;

            case R.id.btn_show_dialog:
                showDialog();
                break;

            default:
                break;
        }
    }
}
