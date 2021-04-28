package com.nathans.steam;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HalamanSignup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_signup);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSignup)
    void signup(){
        Intent i = new Intent(HalamanSignup.this, HalamanAdmin.class);
        startActivity(i);
        finish();
    }

    @OnClick(R.id.btnSignin)
    void signin(){
        Intent i = new Intent(HalamanSignup.this, HalamanSignin.class);
        startActivity(i);
        finish();
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.mipmap.steamlogo2)
                .setTitle("Exit Steam.ind")
                .setMessage("Are you sure?")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }
}