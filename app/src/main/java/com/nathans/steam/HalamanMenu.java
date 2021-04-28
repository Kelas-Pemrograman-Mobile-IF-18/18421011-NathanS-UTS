package com.nathans.steam;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HalamanMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_menu);

        ButterKnife.bind(this);
    }

    //For Games
    @OnClick(R.id.btnViewGames)
    void viewgames(){
        Intent i = new Intent(HalamanMenu.this, HalamanGames.class);
        startActivity(i);
        finish();
    }

    @OnClick(R.id.btnGame3)
    void viewgame3(){
        Intent i = new Intent(HalamanMenu.this, Game3.class);
        startActivity(i);
        finish();
    }

    @OnClick(R.id.btnGame4)
    void viewgame4(){
        Intent i = new Intent(HalamanMenu.this, Game4.class);
        startActivity(i);
        finish();
    }

    @OnClick(R.id.btnGame8)
    void viewgame8(){
        Intent i = new Intent(HalamanMenu.this, Game8.class);
        startActivity(i);
        finish();
    }

    @OnClick(R.id.btnGame5)
    void viewgame5(){
        Intent i = new Intent(HalamanMenu.this, Game5.class);
        startActivity(i);
        finish();
    }

    //For Wallet
    @OnClick(R.id.btnViewWallet)
    void viewwallet(){
        Intent i = new Intent(HalamanMenu.this, HalamanWallet.class);
        startActivity(i);
        finish();
    }

    @OnClick(R.id.btnWallet1)
    void viewwallet1(){
        Intent i = new Intent(HalamanMenu.this, Wallet1.class);
        startActivity(i);
        finish();
    }

    @OnClick(R.id.btnWallet2)
    void viewwallet2(){
        Intent i = new Intent(HalamanMenu.this, Wallet2.class);
        startActivity(i);
        finish();
    }

    @OnClick(R.id.btnWallet3)
    void viewwallet3(){
        Intent i = new Intent(HalamanMenu.this, Wallet3.class);
        startActivity(i);
        finish();
    }

    @OnClick(R.id.btnWallet4)
    void viewwallet4(){
        Intent i = new Intent(HalamanMenu.this, Wallet4.class);
        startActivity(i);
        finish();
    }

    @OnClick(R.id.btnMenu)
    void viewmenu(){
        Intent i = new Intent(HalamanMenu.this, HalamanAlt.class);
        startActivity(i);
        finish();
    }

    @OnClick(R.id.btnExit)
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.mipmap.steamlogo2)
                .setTitle("Log Out Steam.ind")
                .setMessage("Are you sure you want to log out?")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(HalamanMenu.this, HalamanSignin.class);
                        startActivity(i);
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