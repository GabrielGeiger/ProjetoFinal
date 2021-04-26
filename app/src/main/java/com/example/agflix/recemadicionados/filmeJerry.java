package com.example.agflix.recemadicionados;

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

public class filmeJerry extends AppCompatActivity {
    private VideoView tomejerry;
    private Button btnPlayTom,btnStopTom,btnVoltarTom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_jerry);

        tomejerry = findViewById(R.id.filmeRed);
        btnPlayTom = findViewById(R.id.btnPlayTom);
        btnStopTom = findViewById(R.id.btnStopTom);
        btnVoltarTom = findViewById(R.id.btnVoltarTom);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tomejerry);

        tomejerry.setVideoURI(caminho);
        tomejerry.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayTom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             tomejerry.start();

            }
        });

        btnStopTom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tomejerry.pause();
            }
        });

        btnVoltarTom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarTom();
            }
        });
    }

    public void abrirVoltarTom(){
        Intent voltartom = new Intent(this, Home.class);
        tomejerry.pause();
        startActivity(voltartom);
    }
}