package com.rishav.euro2inrconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;

import de.hdodenhof.circleimageview.CircleImageView;

public class ThirdActivity extends AppCompatActivity {

    private TextView a, b;
    private CircleImageView c;


    public  void btnclick(View view)

    {
        startActivity(new Intent(ThirdActivity.this, FourthActivity.class));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        a = findViewById(R.id.info);
        b = findViewById(R.id.mail);
        c = findViewById(R.id.xyz);

        String x = getIntent().getStringExtra("keyname");
        String y = getIntent().getStringExtra("keyemail");
        String z = getIntent().getStringExtra("keyimage");


        a.setText(x);
        b.setText(y);
        Glide.with(this).load(z).into(c);


    }

    AccessTokenTracker accessTokenTracker = new AccessTokenTracker() {
        @Override
        protected void onCurrentAccessTokenChanged(AccessToken oldAccessToken, AccessToken currentAccessToken) {

            if (currentAccessToken == null) {
                startActivity(new Intent(ThirdActivity.this, MainActivity.class));
                finish();
                Toast.makeText(ThirdActivity.this, "logout Successful", Toast.LENGTH_SHORT).show();
                Log.d("muku","Logout Successful");

            }
        }


    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        accessTokenTracker.stopTracking();
    }
}