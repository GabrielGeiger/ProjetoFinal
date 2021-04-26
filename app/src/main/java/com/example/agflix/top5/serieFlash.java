package com.example.agflix.top5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.VideoView;

import com.example.agflix.Home;
import com.example.agflix.R;

public class serieFlash extends AppCompatActivity {
    private VideoView filmeFlash;
    private Button btnPlayFlash,btnStopFlash,btnVoltarFlash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie_flash);

        filmeFlash = findViewById(R.id.filmeFlash);
        btnPlayFlash = findViewById(R.id.btnPlayFlash);
        btnStopFlash= findViewById(R.id.btnStopFlash);
        btnVoltarFlash = findViewById(R.id.btnVoltarFlash);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.flash);

        filmeFlash.setVideoURI(caminho);
        filmeFlash.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayFlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeFlash.start();

            }
        });

        btnStopFlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeFlash.pause();
            }
        });

        btnVoltarFlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarFlash();
            }
        });
    }

    public void abrirVoltarFlash (){
        Intent voltarout = new Intent(this, Home.class);
        filmeFlash.pause();
        startActivity(voltarout);
    }
}