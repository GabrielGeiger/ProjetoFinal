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

public class serieArrow extends AppCompatActivity {
    private VideoView filmeArrow;
    private Button btnPlayArrow,btnStopArrow,btnVoltarArrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie_arrow);

        filmeArrow = findViewById(R.id.filmeArrow);
        btnPlayArrow = findViewById(R.id.btnPlayArrow);
        btnStopArrow= findViewById(R.id.btnStopArrow);
        btnVoltarArrow = findViewById(R.id.btnVoltarArrow);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.arrow);

        filmeArrow.setVideoURI(caminho);
        filmeArrow.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeArrow.start();

            }
        });

        btnStopArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeArrow.pause();
            }
        });

        btnVoltarArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarArrow();
            }
        });
    }

    public void abrirVoltarArrow (){
        Intent voltarout = new Intent(this, Home.class);
        filmeArrow.pause();
        startActivity(voltarout);
    }
}