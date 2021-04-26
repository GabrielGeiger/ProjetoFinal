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

public class filmeParaiso extends AppCompatActivity {
    private VideoView filmeParaiso;
    private Button btnPlayParaiso,btnStopParaiso,btnVoltarParaiso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_paraiso);

        filmeParaiso = findViewById(R.id.filmeParaiso);
        btnPlayParaiso = findViewById(R.id.btnPlayParaiso);
        btnStopParaiso = findViewById(R.id.btnStopParaiso);
        btnVoltarParaiso = findViewById(R.id.btnVoltarParaiso);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.paraiso);

        filmeParaiso.setVideoURI(caminho);
        filmeParaiso.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayParaiso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeParaiso.start();

            }
        });

        btnStopParaiso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeParaiso.pause();
            }
        });

        btnVoltarParaiso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarParaiso();
            }
        });
    }

    public void abrirVoltarParaiso (){
        Intent voltarout = new Intent(this, Home.class);
        filmeParaiso.pause();
        startActivity(voltarout);
    }
}