package com.tay.labexerno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void LL(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com/Lovers.Lane.UST/"));
        startActivity(i);
    }
    public void MB(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://varsitarian.net/20180102/circle/ust-main-building-at-90"));
        startActivity(i);
    }
    public void RR(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://foursquare.com/v/roque-rua%C3%B1o-building/4d4ede8a9d662d43d6a94b00"));
        startActivity(i);
    }
    public void Lib(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://library.ust.edu.ph/"));
        startActivity(i);
    }
}
