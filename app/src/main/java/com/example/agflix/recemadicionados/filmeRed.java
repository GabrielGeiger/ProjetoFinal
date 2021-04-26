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

public class filmeRed extends AppCompatActivity {
    private VideoView filmeRed;
    private Button btnPlayRed,btnStopRed,btnVoltarRed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_red);

        filmeRed = findViewById(R.id.filmeRed);
        btnPlayRed = findViewById(R.id.btnPlayRed);
        btnStopRed = findViewById(R.id.btnStopRed);
        btnVoltarRed = findViewById(R.id.btnVoltarRed);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.red);

        filmeRed.setVideoURI(caminho);
        filmeRed.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeRed.start();

            }
        });

        btnStopRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeRed.pause();
            }
        });

        btnVoltarRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarRed();
            }
        });
    }

    public void abrirVoltarRed (){
        Intent voltarout = new Intent(this, Home.class);
        filmeRed.pause();
        startActivity(voltarout);
    }
}