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

public class serieGot extends AppCompatActivity {
    private VideoView filmeGot;
    private Button btnPlayGot,btnStopGot,btnVoltarGot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie_got);

        filmeGot = findViewById(R.id.filmeGot);
        btnPlayGot = findViewById(R.id.btnPlayGot);
        btnStopGot= findViewById(R.id.btnStopGot);
        btnVoltarGot = findViewById(R.id.btnVoltarGot);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.got);

        filmeGot.setVideoURI(caminho);
        filmeGot.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayGot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeGot.start();

            }
        });

        btnStopGot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeGot.pause();
            }
        });

        btnVoltarGot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarGot();
            }
        });
    }

    public void abrirVoltarGot (){
        Intent voltarout = new Intent(this, Home.class);
        filmeGot.pause();
        startActivity(voltarout);
    }
}