package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class InfoEdittingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_editting_layout);
        init();
    }

    void init() {
        TextView btnUpdateInfo = findViewById(R.id.btn_update_info);
        ImageView btnBack = findViewById(R.id.img_back_edif);
        btnUpdateInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InfoEdittingActivity.this, "Cập nhật thành công!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(InfoEdittingActivity.this, User.class);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InfoEdittingActivity.this, "Chưa cập nhật, thông tin lưu nháp!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(InfoEdittingActivity.this, User.class);
                startActivity(intent);
            }
        });

    }
}
