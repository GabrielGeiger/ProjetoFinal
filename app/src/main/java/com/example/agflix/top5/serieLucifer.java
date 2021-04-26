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

public class serieLucifer extends AppCompatActivity {
    private VideoView filmeLucifer;
    private Button btnPlayLucifer,btnStopLucifer,btnVoltarLucifer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie_lucifer);

        filmeLucifer = findViewById(R.id.filmeLucifer);
        btnPlayLucifer = findViewById(R.id.btnPlayLucifer);
        btnStopLucifer= findViewById(R.id.btnStopLucifer);
        btnVoltarLucifer = findViewById(R.id.btnVoltarLucifer);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lucifer);

        filmeLucifer.setVideoURI(caminho);
        filmeLucifer.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayLucifer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeLucifer.start();

            }
        });

        btnStopLucifer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeLucifer.pause();
            }
        });

        btnVoltarLucifer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarLucifer();
            }
        });
    }

    public void abrirVoltarLucifer (){
        Intent voltarout = new Intent(this, Home.class);
        filmeLucifer.pause();
        startActivity(voltarout);
    }
}