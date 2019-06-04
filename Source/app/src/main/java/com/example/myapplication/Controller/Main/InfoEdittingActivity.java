package com.example.myapplication.Controller.Main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.myapplication.R;

public class InfoEdittingActivity extends AppCompatActivity {
    RelativeLayout btnUpdateInfo;
    ImageView btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_editting_layout);
        init();
    }

    void init() {
        btnUpdateInfo = findViewById(R.id.rl_info_verification);
        btnBack = findViewById(R.id.img_back_ifet);
        btnUpdateInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentUpdateInfo = new Intent(InfoEdittingActivity.this, UserActivity.class);
                startActivity(intentUpdateInfo);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBackWoSave = new Intent(InfoEdittingActivity.this, UserActivity.class);
                startActivity(intentBackWoSave);
            }
        });

    }
}
