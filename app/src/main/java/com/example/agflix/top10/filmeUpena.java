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

public class filmeUpena extends AppCompatActivity {
    private VideoView filmeUpena;
    private Button btnPlayUpena,btnStopUpena,btnVoltarUpena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_upena);

        filmeUpena = findViewById(R.id.filmeUpena);
        btnPlayUpena = findViewById(R.id.btnPlayUpena);
        btnStopUpena= findViewById(R.id.btnStopUpena);
        btnVoltarUpena = findViewById(R.id.btnVoltarUpena);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.uppena);

        filmeUpena.setVideoURI(caminho);
        filmeUpena.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayUpena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeUpena.start();

            }
        });

        btnStopUpena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeUpena.pause();
            }
        });

        btnVoltarUpena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarUpena();
            }
        });
    }

    public void abrirVoltarUpena (){
        Intent voltarout = new Intent(this, Home.class);
        filmeUpena.pause();
        startActivity(voltarout);
    }
}
