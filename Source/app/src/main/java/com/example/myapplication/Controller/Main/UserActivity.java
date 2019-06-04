package com.example.myapplication.Controller.Main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.Controller.Auth.LoginActivity;
import com.example.myapplication.Model.HomeData;
import com.example.myapplication.Model.News;
import com.example.myapplication.Model.User;
import com.example.myapplication.R;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserActivity extends AppCompatActivity implements Serializable {
    TextView tvPhoneNo;
    TextView tvName;
    TextView tvEdit;
    CircleImageView imgAvatar;
    RecyclerView rvNews;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_layout);
        String strHomeData = loadJSONFromAsset();
        Gson gson = new Gson();
        HomeData homeData = gson.fromJson(strHomeData, HomeData.class);
        String customerName = homeData.getResult().getCustomerDetail().getCustomerName();
        String newsTitle = homeData.getResult().getListNews().get(0).getTitle();
        //Toast.makeText(this, customerName, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, newsTitle, Toast.LENGTH_SHORT).show();



        /*Gson gson = new Gson();
        Log.d("","onCreate");
        try {
            JSONObject jsonUserHomeData = new JSONObject(userHomeData);
            JSONObject customerName = jsonUserHomeData.getJSONObject("customerName");
            JSONObject phoneNumber = jsonUserHomeData.getJSONObject("phoneNumber");
            JSONObject profileAvatarUrl = jsonUserHomeData.getJSONObject("profileAvatar");
            customerName.getJSONObject("customerName");
            phoneNumber.getJSONObject("phoneNumber");
            profileAvatarUrl.getJSONObject("profileAvatar");
        } catch (JSONException e) {
            e.printStackTrace();
        }*/


            News news1 = homeData.getResult().getListNews().get(0);
            String phoneNumber = homeData.getResult().getCustomerDetail().getPhone();




        init();

        //getData();
    }




    void getData() {
        User user = (User) getIntent().getSerializableExtra("user");
        tvPhoneNo.setText((loadJSONFromAsset()));
        tvName.setText(loadJSONFromAsset());
        Picasso.get()
                .load(loadJSONFromAsset())
                .placeholder(getResources().getDrawable(R.drawable.ic_user))
                .into(imgAvatar);


    }

    void init() {
        LinearLayout relatReturn = findViewById(R.id.ln_logout);
        rvNews = findViewById(R.id.img_background);
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
                Intent intent3 = new Intent(UserActivity.this, TransactionHistoryActivity.class);
                startActivity(intent3);
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

    public String loadJSONFromAsset() {
        String str = null;
        try {
            InputStream is = getAssets().open("home.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            str = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return str;
    }


}
