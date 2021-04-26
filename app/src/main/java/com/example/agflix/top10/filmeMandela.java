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

public class filmeMandela extends AppCompatActivity {
    private VideoView filmeMandela;
    private Button btnPlayMandela,btnStopMandela,btnVoltarMandela;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_mandela);

        filmeMandela = findViewById(R.id.filmeMandela);
        btnPlayMandela = findViewById(R.id.btnPlayMandela);
        btnStopMandela= findViewById(R.id.btnStopMandela);
        btnVoltarMandela = findViewById(R.id.btnVoltarMandela);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.mandela);

        filmeMandela.setVideoURI(caminho);
        filmeMandela.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayMandela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeMandela.start();

            }
        });

        btnStopMandela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeMandela.pause();
            }
        });

        btnVoltarMandela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarMandela();
            }
        });
    }

    public void abrirVoltarMandela (){
        Intent voltarout = new Intent(this, Home.class);
        filmeMandela.pause();
        startActivity(voltarout);
    }
}