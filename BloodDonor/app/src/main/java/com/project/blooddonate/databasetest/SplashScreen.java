package com.project.blooddonate.databasetest;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class SplashScreen extends AppCompatActivity {
    ImageView imageView;
    private SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    private static final String ACCESS_FILE="Accessability";
    private static final String USER_NAME="username";
    private static final String PASS_WORD="pass";
    String userName, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imageView = (ImageView) findViewById(R.id.imageView3);
        sharedPreferences=getSharedPreferences(ACCESS_FILE, Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();

        userName= sharedPreferences.getString(USER_NAME,"abc");
        password = sharedPreferences.getString(PASS_WORD, "abc");



        Picasso.with(this)
                .load(R.drawable.splash)
                .into(imageView);


        new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                if(userName.equals("admin") && password.equals("admin12345"))
                {
                    startActivity(new Intent(SplashScreen.this,MainActivity.class));
                    finish();
                }
                else
                {
                    startActivity(new Intent(SplashScreen.this,Login.class));
                    finish();
                }

            }
        }.start();




    }
}
