package com.rakt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class PhoneAuth1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_auth1);
    }

    public void openPhoneAuth2(View view) {
        Intent i=new Intent(this,PhoneAuth2.class);
        startActivity(i);
        Animatoo.animateSlideLeft(this);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Animatoo.animateSlideRight(this);
    }
}