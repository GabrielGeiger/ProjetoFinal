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

public class filmePequenos extends AppCompatActivity {
    private VideoView filmePequenos;
    private Button btnPlayPequenos,btnStopPequenos,btnVoltarPequenos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_pequenos);

        filmePequenos = findViewById(R.id.filmePequenos);
        btnPlayPequenos = findViewById(R.id.btnPlayPequenos);
        btnStopPequenos= findViewById(R.id.btnStopPequenos);
        btnVoltarPequenos = findViewById(R.id.btnVoltarPequenos);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.pequenos);

        filmePequenos.setVideoURI(caminho);
        filmePequenos.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayPequenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmePequenos.start();

            }
        });

        btnStopPequenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmePequenos.pause();
            }
        });

        btnVoltarPequenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarPequenos();
            }
        });
    }

    public void abrirVoltarPequenos (){
        Intent voltarout = new Intent(this, Home.class);
        filmePequenos.pause();
        startActivity(voltarout);
    }
}