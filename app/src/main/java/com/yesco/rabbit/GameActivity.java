package com.yesco.rabbit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yesco.rabbit.view.GameView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameView(this));
    }

}
