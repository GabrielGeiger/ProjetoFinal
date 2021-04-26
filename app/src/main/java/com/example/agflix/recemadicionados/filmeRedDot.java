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

public class filmeRedDot extends AppCompatActivity {
    private VideoView filmeRedDot;
    private Button btnPlayRedDot,btnStopRedDot,btnVoltarRedDot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_red_dot);

        filmeRedDot = findViewById(R.id.filmeRedDot);
        btnPlayRedDot = findViewById(R.id.btnPlayRedDot);
        btnStopRedDot = findViewById(R.id.btnStopRedDot);
        btnVoltarRedDot = findViewById(R.id.btnVoltarRedDot);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.reddot);

        filmeRedDot.setVideoURI(caminho);
        filmeRedDot.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayRedDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeRedDot.start();

            }
        });

        btnStopRedDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeRedDot.pause();
            }
        });

        btnVoltarRedDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarRedDot();
            }
        });
    }

    public void abrirVoltarRedDot (){
        Intent voltarout = new Intent(this, Home.class);
        filmeRedDot.pause();
        startActivity(voltarout);
    }
}