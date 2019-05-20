package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class User extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_layout);
        init();

    }

    void init() {
        TextView edtEditInfo = findViewById(R.id.btn_edit_profile);
        LinearLayout relatReturn = findViewById(R.id.ln_logout);
        LinearLayout relatTransaction = findViewById(R.id.ln_transaction_history);
        LinearLayout relatQA = findViewById(R.id.ln_qa);
        LinearLayout relatManualGuide = findViewById(R.id.ln_manual_guide);
        ImageView btnBackToHome = findViewById(R.id.img_back);
        ImageView userProfilePicture = findViewById(R.id.img_user_profile);
        ImageView greenLevel = findViewById(R.id.ic_checked_green);
        ImageView blueLevel = findViewById(R.id.ic_checked_blue);
        ImageView goldLevel = findViewById(R.id.ic_gold);
        ImageView platinumLevel = findViewById(R.id.ic_platinum);
        edtEditInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this, InfoEdittingActivity.class);
                startActivity(intent);
            }
        });
        relatReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(User.this, "Cảm ơn bạn đã sử dụng dịch vụ!", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(User.this, LoginActivity.class);
                startActivity(intent2);
            }
        });
        relatQA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(User.this, "Đang phát triển", Toast.LENGTH_SHORT).show();
            }
        });
        relatManualGuide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(User.this, "Đang phát triển", Toast.LENGTH_SHORT).show();
            }
        });
        relatTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(User.this, "Đang phát triển", Toast.LENGTH_SHORT).show();
            }
        });
        btnBackToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(User.this, "Sẽ trở về màn hình chính!" +
                        " Đang phát triển!", Toast.LENGTH_SHORT).show();
            }
        });
        userProfilePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(User.this, "Đang phát triển!" +
                        " Mèo xinh hihi!", Toast.LENGTH_SHORT).show();
            }
        });
        greenLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(User.this, "Đã mở khóa vào dd/mm/yyyy", Toast.LENGTH_SHORT).show();
            }
        });
        blueLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(User.this, "Đã mở khóa vào dd/mm/yyyy", Toast.LENGTH_SHORT).show();
            }
        });
        goldLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(User.this, "Hãy tích thêm null điểm để thăng hạng Vàng.", Toast.LENGTH_SHORT).show();
            }
        });
        platinumLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(User.this, "Hãy tích thêm null điểm để thăng hạng Bạch Kim.", Toast.LENGTH_SHORT).show();
            }
        });


    }


}
