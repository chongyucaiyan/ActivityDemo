package com.github.cyc.lifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.cyc.lifecycle.demo01.Demo01Activity;
import com.github.cyc.lifecycle.demo02.Demo02Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initContentView();
    }

    private void initContentView() {
        findViewById(R.id.btn_demo01).setOnClickListener(this);
        findViewById(R.id.btn_demo02).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_demo01:
                Demo01Activity.start(this);
                break;

            case R.id.btn_demo02:
                Demo02Activity.start(this);
                break;

            default:
                break;
        }
    }
}
