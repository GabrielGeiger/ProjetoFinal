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

public class filmeRise extends AppCompatActivity {
    private VideoView filmeRise;
    private Button btnPlayRise,btnStopRise,btnVoltarRise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_rise);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        filmeRise = findViewById(R.id.filmeRise);
        btnPlayRise = findViewById(R.id.btnPlayRise);
        btnStopRise= findViewById(R.id.btnStopRise);
        btnVoltarRise = findViewById(R.id.btnVoltarRise);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.riseup);

        filmeRise.setVideoURI(caminho);
        filmeRise.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayRise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeRise.start();

            }
        });

        btnStopRise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeRise.pause();
            }
        });

        btnVoltarRise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarRise();
            }
        });
    }

    public void abrirVoltarRise (){
        Intent voltarout = new Intent(this, Home.class);
        filmeRise.pause();
        startActivity(voltarout);
    }

}