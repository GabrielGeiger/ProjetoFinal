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

public class filmePinoquio extends AppCompatActivity {
    private VideoView filmePinoquio;
    private Button btnPlayPinoquio,btnStopPinoquio,btnVoltarPinoquio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_pinoquio);

        filmePinoquio = findViewById(R.id.filmePinoquio);
        btnPlayPinoquio = findViewById(R.id.btnPlayPinoquio);
        btnStopPinoquio= findViewById(R.id.btnStopPinoquio);
        btnVoltarPinoquio = findViewById(R.id.btnVoltarPinoquio);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.pinoquio);

        filmePinoquio.setVideoURI(caminho);
        filmePinoquio.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayPinoquio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmePinoquio.start();

            }
        });

        btnStopPinoquio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmePinoquio.pause();
            }
        });

        btnVoltarPinoquio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarPinoquio();
            }
        });
    }

    public void abrirVoltarPinoquio (){
        Intent voltarout = new Intent(this, Home.class);
        filmePinoquio.pause();
        startActivity(voltarout);
    }
}