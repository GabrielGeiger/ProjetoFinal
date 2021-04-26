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

public class filmeZero extends AppCompatActivity {
    private VideoView filmeZero;
    private Button btnPlayZero,btnStopZero,btnVoltarZero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_zero);

        filmeZero = findViewById(R.id.filmeZero);
        btnPlayZero = findViewById(R.id.btnPlayZero);
        btnStopZero = findViewById(R.id.btnStopZero);
        btnVoltarZero = findViewById(R.id.btnVoltarZero);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.zero);

        filmeZero.setVideoURI(caminho);
        filmeZero.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeZero.start();

            }
        });

        btnStopZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeZero.pause();
            }
        });

        btnVoltarZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarZero();
            }
        });
    }

    public void abrirVoltarZero (){
        Intent voltarout = new Intent(this, Home.class);
        filmeZero.pause();
        startActivity(voltarout);
    }
}