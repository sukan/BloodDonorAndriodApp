package com.project.blooddonate.databasetest;

import android.annotation.TargetApi;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DonorDescription extends AppCompatActivity {
    TextView nameT;
    TextView phoneT;
    TextView emailT;
    TextView blooDgroupT;
    TextView statusT;
    @TargetApi(Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_description);

        nameT= (TextView) findViewById(R.id.DesciNameTextView);
        phoneT= (TextView) findViewById(R.id.DesciPhoneTextView);
        emailT= (TextView) findViewById(R.id.DesciEmailTextView);
        blooDgroupT= (TextView) findViewById(R.id.DesciBGTextView);
        statusT= (TextView) findViewById(R.id.DesciStatusView);

        final String name = getIntent().getStringExtra("name");
        final String phone = getIntent().getStringExtra("phone");
        final String email = getIntent().getStringExtra("email");
        final String bloodGroup = getIntent().getStringExtra("bloodGroup");
        final String lastDate = getIntent().getStringExtra("lastDate");


        nameT.setText(name);
        phoneT.setText(phone);
        emailT.setText(email);
        blooDgroupT.setText(bloodGroup);
        statusT.setText(lastDate);



    }
}
