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

public class serieSobrenatural extends AppCompatActivity {
    private VideoView filmeSobrenatural;
    private Button btnPlaySobrenatural,btnStopSobrenatural,btnVoltarSobrenatural;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie_sobrenatural);


        filmeSobrenatural = findViewById(R.id.filmeSobrenatural);
        btnPlaySobrenatural= findViewById(R.id.btnPlaySobrenatural);
        btnStopSobrenatural= findViewById(R.id.btnStopSobrenatural);
        btnVoltarSobrenatural = findViewById(R.id.btnVoltarSobrenatural);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sobrenatural);

        filmeSobrenatural.setVideoURI(caminho);
        filmeSobrenatural.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlaySobrenatural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeSobrenatural.start();

            }
        });

        btnStopSobrenatural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeSobrenatural.pause();
            }
        });

        btnVoltarSobrenatural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarSobrenatural();
            }
        });
    }

    public void abrirVoltarSobrenatural (){
        Intent voltarout = new Intent(this, Home.class);
        filmeSobrenatural.pause();
        startActivity(voltarout);
    }
}