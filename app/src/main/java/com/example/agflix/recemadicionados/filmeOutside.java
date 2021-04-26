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

public class filmeOutside extends AppCompatActivity {
    private VideoView outsidefilme;
    private Button btnPlayOutside,btnStopOutside,btnVoltarOutside;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_outside);

        outsidefilme = findViewById(R.id.filmeRed);
        btnPlayOutside = findViewById(R.id.btnPlayOutside);
        btnStopOutside = findViewById(R.id.btnStopOutside);
        btnVoltarOutside = findViewById(R.id.btnVoltarOutside);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.outside);

        outsidefilme.setVideoURI(caminho);
        outsidefilme.start();


        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayOutside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outsidefilme.start();

            }
        });

        btnStopOutside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outsidefilme.pause();
            }
        });

        btnVoltarOutside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarOutside();
            }
        });
    }

    public void abrirVoltarOutside (){
        Intent voltarout = new Intent(this, Home.class);
        outsidefilme.pause();
        startActivity(voltarout);
    }
}