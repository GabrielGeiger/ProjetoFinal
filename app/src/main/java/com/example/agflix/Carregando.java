package com.example.agflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.VideoView;

public class Carregando extends AppCompatActivity {
    private VideoView carregamento;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carregando);

        carregamento = findViewById(R.id.carregamento);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.carregamento);
        carregamento.setVideoURI(caminho);
        carregamento.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
                finish();
                carregamento.stopPlayback();
            }
        }, 9000);
    }
}