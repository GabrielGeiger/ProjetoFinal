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

public class filmeAgencia extends AppCompatActivity {
    private VideoView filmeAgencia;
    private Button btnPlayAgencia,btnStopAgencia,btnVoltarAgencia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_agencia);

        filmeAgencia = findViewById(R.id.filmeAgencia);
        btnPlayAgencia = findViewById(R.id.btnPlayAgencia);
        btnStopAgencia= findViewById(R.id.btnStopAgencia);
        btnVoltarAgencia = findViewById(R.id.btnVoltarAgencia);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.agencia);

        filmeAgencia.setVideoURI(caminho);
        filmeAgencia.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayAgencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeAgencia.start();

            }
        });

        btnStopAgencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeAgencia.pause();
            }
        });

        btnVoltarAgencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarAgencia();
            }
        });
    }

    public void abrirVoltarAgencia (){
        Intent voltarout = new Intent(this, Home.class);
        filmeAgencia.pause();
        startActivity(voltarout);
    }
}