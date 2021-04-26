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

public class filmeSpace extends AppCompatActivity {
    private VideoView filmeSpace;
    private Button btnPlaySpace,btnStopSpace,btnVoltarSpace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_space);

        filmeSpace = findViewById(R.id.filmeSpace);
        btnPlaySpace = findViewById(R.id.btnPlaySpace);
        btnStopSpace = findViewById(R.id.btnStopSpace);
        btnVoltarSpace = findViewById(R.id.btnVoltarSpace);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.space);

        filmeSpace.setVideoURI(caminho);
        filmeSpace.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btnPlaySpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeSpace.start();

            }
        });

        btnStopSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeSpace.pause();
            }
        });

        btnVoltarSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarSpace();
            }
        });
    }

    public void abrirVoltarSpace (){
        Intent voltarout = new Intent(this, Home.class);
        filmeSpace.pause();
        startActivity(voltarout);
    }
}