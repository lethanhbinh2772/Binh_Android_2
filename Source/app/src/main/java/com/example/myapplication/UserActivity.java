package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserActivity extends AppCompatActivity {
    TextView tvPhoneNo;
    TextView tvName;
    TextView tvEdit;
    CircleImageView imgAvatar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_layout);
        init();
        getData();


    }
    void getData() {
        User user = (User) getIntent().getSerializableExtra("user");
        tvPhoneNo.setText(user.getPhoneNumber());
        tvName.setText(user.getUsername());
        Picasso.get()
                .load(user.getProfileUrl())
                .placeholder(getResources().getDrawable(R.drawable.ic_user))
                .into(imgAvatar);


    }
    void init(){
        LinearLayout relatReturn = findViewById(R.id.ln_logout);
        LinearLayout relatTransaction = findViewById(R.id.ln_transaction_history);
        LinearLayout relatQA = findViewById(R.id.ln_qa);
        LinearLayout relatManualGuide = findViewById(R.id.ln_manual_guide);
        ImageView btnBackToHome = findViewById(R.id.img_back);
        ImageView greenLevel = findViewById(R.id.ic_checked_green);
        ImageView blueLevel = findViewById(R.id.ic_checked_blue);
        ImageView goldLevel = findViewById(R.id.ic_gold);
        ImageView platinumLevel = findViewById(R.id.ic_platinum);
        tvPhoneNo = findViewById(R.id.tv_phonenumber_profile);
        tvName = findViewById(R.id.tv_username_profile);
        tvEdit = findViewById(R.id.btn_edit_profile);
        imgAvatar = findViewById(R.id.img_user_profile);
        tvEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserActivity.this, InfoEdittingActivity.class);
                startActivity(intent);
            }
        });
        relatReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UserActivity.this, "Cảm ơn bạn đã sử dụng dịch vụ!", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(UserActivity.this, LoginActivity.class);
                startActivity(intent2);
            }
        });
        relatQA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UserActivity.this, "Đang phát triển", Toast.LENGTH_SHORT).show();
            }
        });
        relatManualGuide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UserActivity.this, "Đang phát triển", Toast.LENGTH_SHORT).show();
            }
        });
        relatTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UserActivity.this, "Đang phát triển", Toast.LENGTH_SHORT).show();
            }
        });
        btnBackToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        imgAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UserActivity.this, "Đang phát triển!" +
                        " Mèo xinh hihi!", Toast.LENGTH_SHORT).show();
            }
        });
        greenLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UserActivity.this, "Đã mở khóa vào dd/mm/yyyy", Toast.LENGTH_SHORT).show();
            }
        });
        blueLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UserActivity.this, "Đã mở khóa vào dd/mm/yyyy", Toast.LENGTH_SHORT).show();
            }
        });
        goldLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UserActivity.this, "Hãy tích thêm null điểm để thăng hạng Vàng.", Toast.LENGTH_SHORT).show();
            }
        });
        platinumLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UserActivity.this, "Hãy tích thêm null điểm để thăng hạng Bạch Kim.", Toast.LENGTH_SHORT).show();
            }
        });


    }


}
