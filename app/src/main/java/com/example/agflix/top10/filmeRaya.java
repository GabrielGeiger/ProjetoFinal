package com.example.agflix.top10;

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

public class filmeRaya extends AppCompatActivity {
    private VideoView filmeRaya;
    private Button btnPlayRaya,btnStopRaya,btnVoltarRaya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_raya);

        filmeRaya = findViewById(R.id.filmeRaya);
        btnPlayRaya = findViewById(R.id.btnPlayRaya);
        btnStopRaya= findViewById(R.id.btnStopRaya);
        btnVoltarRaya = findViewById(R.id.btnVoltarRaya);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.raya);

        filmeRaya.setVideoURI(caminho);
        filmeRaya.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayRaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeRaya.start();

            }
        });

        btnStopRaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeRaya.pause();
            }
        });

        btnVoltarRaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarRaya();
            }
        });
    }

    public void abrirVoltarRaya (){
        Intent voltarout = new Intent(this, Home.class);
        filmeRaya.pause();
        startActivity(voltarout);
    }
}