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

public class filmeBlis extends AppCompatActivity {
    private VideoView filmeBliss;
    private Button btnPlayBliss,btnStopBliss,btnVoltarBliss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_blis);

        filmeBliss = findViewById(R.id.filmeBliss);
        btnPlayBliss = findViewById(R.id.btnPlayBliss);
        btnStopBliss = findViewById(R.id.btnStopBliss);
        btnVoltarBliss = findViewById(R.id.btnVoltarBliss);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bliss);

        filmeBliss.setVideoURI(caminho);
        filmeBliss.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayBliss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeBliss.start();

            }
        });

        btnStopBliss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeBliss.pause();
            }
        });

        btnVoltarBliss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarBliss();
            }
        });
    }

    public void abrirVoltarBliss (){
        Intent voltarout = new Intent(this, Home.class);
        filmeBliss.pause();
        startActivity(voltarout);
    }
}