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

public class filmeLuci extends AppCompatActivity {
    private VideoView filmeLuci;
    private Button btnPlayLuci,btnStopLuci,btnVoltarLuci;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_luci);

        filmeLuci = findViewById(R.id.filmeLuci);
        btnPlayLuci = findViewById(R.id.btnPlayLuci);
        btnStopLuci= findViewById(R.id.btnStopLuci);
        btnVoltarLuci = findViewById(R.id.btnVoltarLuci);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.luci);

        filmeLuci.setVideoURI(caminho);
        filmeLuci.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPlayLuci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeLuci.start();

            }
        });

        btnStopLuci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmeLuci.pause();
            }
        });

        btnVoltarLuci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarLuci();
            }
        });
    }

    public void abrirVoltarLuci (){
        Intent voltarout = new Intent(this, Home.class);
        filmeLuci.pause();
        startActivity(voltarout);
    }
}