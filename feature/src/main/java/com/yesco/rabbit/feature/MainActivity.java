package com.yesco.rabbit.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.yesco.rabbit.feature.utils.SysUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        ((TextView) findViewById(R.id.version)).setText(SysUtils.getVersion(this));
    }

    public void onClick(View view) {
        startActivity(new Intent(MainActivity.this, GameActivity.class));
    }
}
