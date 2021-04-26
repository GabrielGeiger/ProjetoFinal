package com.example.agflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import com.example.agflix.recemadicionados.*;
import com.example.agflix.top10.*;
import com.example.agflix.top5.*;

public class Home extends AppCompatActivity {
private Button tomjarry;
private ImageButton abaixoZero,btnSpace,btnRed,btnOutside,btnJerry,btnRedDot,btnUpena,btnAgencia,btnParaiso,btnLuci,btnMandela,btnRise,btnRaya,btnPinoquio,btnBlis,btnPequenos,btnLucifer,btnArrow,btnSobrenatural,btnFlash,btnGot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //BOTOES
        ///Recem Adicionados\\
        tomjarry = findViewById(R.id.tomjarry);
        abaixoZero = findViewById(R.id.btnZero);
        btnSpace = findViewById(R.id.btnSpace);
        btnRed = findViewById(R.id.btnRed);
        btnJerry = findViewById(R.id.btnJerry);
        btnRedDot = findViewById(R.id.btnRedDot);
        btnOutside = findViewById(R.id.btnOutside);
        ///TOP 10\\\
        btnUpena = findViewById(R.id.btnUpena);
        btnAgencia = findViewById(R.id.btnAgencia);
        btnParaiso = findViewById(R.id.btnParaiso);
        btnLuci = findViewById(R.id.btnLuci);
        btnMandela = findViewById(R.id.btnMandela);
        btnRise = findViewById(R.id.btnRise);
        btnRaya = findViewById(R.id.btnRaya);
        btnPinoquio = findViewById(R.id.btnPinoquio);
        btnBlis = findViewById(R.id.btnBlis);
        btnPequenos = findViewById(R.id.btnPequenos);

        /////TOP 5\\\\\
        btnLucifer = findViewById(R.id.btnLucifer);
        btnFlash = findViewById(R.id.btnFlash);
        btnSobrenatural = findViewById(R.id.btnSobrenatural);
        btnGot = findViewById(R.id.btnGot);
        btnArrow = findViewById(R.id.btnArrow);


        //FULLSCREEN
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //ABRIR RECEM ADICIONADOS\\
        tomjarry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirJarry();
            }
        });
        ///////////////////////////////////////////////////////////
        abaixoZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirZero();
            }
        });
        /////////////////////////////////////////////////////////////
        btnSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSpace();
            }
        });
        //////////////////////////////////////////////////////////////
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirRed();
            }
        });
        //////////////////////////////////////////////////////////////
        btnJerry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirJarryTom();
            }
        });
        ///////////////////////////////////////////////////////////////
        btnRedDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirRedDot();
            }
        });
        //////////////////////////////////////////////////////////////
        btnOutside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirOutside();
            }
        });
        ///////////////////// FIM RECEM ADICIONADOS\\\\\\\\\\\\\\\\\\\\\\\\

        //ABRIR TOP 10\\
        btnUpena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirUpena();
            }
        });

        btnAgencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirAgencia();
            }
        });

        btnParaiso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirParaiso();
            }
        });

        btnLuci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirLuci();
            }
        });

        btnMandela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMandela();
            }
        });

        btnRise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirRise();
            }
        });

        btnRaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirRaya();
            }
        });

        btnPinoquio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirPinoquio();
            }
        });

        btnBlis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirBlis();
            }
        });

        btnPequenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirPequenos();
            }
        });

        ////////////FIM ARECEM CRIADOS//////////////

        //////////////TOP 5\\\\\\\\\\\\\\\\\\\\\\\\\\
        btnLucifer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirlucifer();
            }
        });

        btnFlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirFlash();
            }
        });

        btnSobrenatural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSobrenatural();
            }
        });

        btnGot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirGot();
            }
        });

        btnArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirArrow();
            }
        });

    }//FIM ONCREATE
    //////////////////// RECEM ADICIONADOS \\\\\\\\\\\\\\\\\\\\\\\\\
   public void abrirJarry(){
       Intent jarry = new Intent(this, filmeJerry.class);
       startActivity(jarry);
   }
    //////////////////////////////////////////////////////////////////////
   public  void abrirZero(){
        Intent zero = new Intent(this, filmeZero.class);
        startActivity(zero);
   }
    //////////////////////////////////////////////////////////////////////
    public void abrirSpace(){
        Intent space = new Intent(this, filmeSpace.class);
        startActivity(space);
    }
    /////////////////////////////////////////////////////////////////////
    public void abrirRed(){
        Intent red = new Intent(this, filmeRed.class);
        startActivity(red);
    }
    /////////////////////////////////////////////////////////////////////
    public void abrirJarryTom(){
        Intent tom = new Intent(this, filmeJerry.class);
        startActivity(tom);
    }
    /////////////////////////////////////////////////////////////////////
    public void abrirRedDot(){
        Intent reddot = new Intent(this, filmeRedDot.class);
        startActivity(reddot);
    }
    ///////////////////////////////////////////////////////////////////////
    public void abrirOutside(){
        Intent outside = new Intent(this, filmeOutside.class);
        startActivity(outside);
    }
    ///////////////////////  FIM RECEM ADICIONADOS /////////////////////////

    //////////////////////////TOP 10\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public void abrirUpena(){
        Intent upena = new Intent(this, filmeUpena.class);
        startActivity(upena);
    }
    //////////////////////////////////////////////////////////////////////
    public void abrirAgencia(){
        Intent agencia = new Intent(this, filmeAgencia.class);
        startActivity(agencia);
    }
    /////////////////////////////////////////////////////////////////////////
    public void abrirParaiso(){
        Intent paraiso = new Intent(this, filmeParaiso.class);
        startActivity(paraiso);
    }

    public void abrirLuci(){
        Intent luci = new Intent(this, filmeLuci.class);
        startActivity(luci);
    }
    /////////////////////////////////////////////////////////////////////////
    public void abrirMandela(){
        Intent mandela = new Intent(this, filmeMandela.class);
        startActivity(mandela);
    }
    /////////////////////////////////////////////////////////////////////////
    public void abrirRise(){
        Intent rise = new Intent(this, filmeRise.class);
        startActivity(rise);
    }
    /////////////////////////////////////////////////////////////////////////
    public void abrirRaya(){
        Intent raya = new Intent(this, filmeRaya.class);
        startActivity(raya);
    }
    /////////////////////////////////////////////////////////////////////////
    public void abrirPinoquio(){
        Intent pino = new Intent(this, filmePinoquio.class);
        startActivity(pino);
    }
    /////////////////////////////////////////////////////////////////////////
    public void abrirBlis(){
        Intent blis = new Intent(this, filmeBlis.class);
        startActivity(blis);
    }
    /////////////////////////////////////////////////////////////////////////
    public void abrirPequenos(){
        Intent peq = new Intent(this, filmePequenos.class);
        startActivity(peq);
    }
    ////////////////////////////FIM TOP 10/////////////////////////

    ////////////////////////////////TOP 5\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public void abrirlucifer(){
        Intent lucifer = new Intent(this, serieLucifer.class);
        startActivity(lucifer);
    }
    public void abrirFlash(){
        Intent flashh = new Intent(this, serieFlash.class);
        startActivity(flashh);
    }
    public void abrirSobrenatural(){
        Intent sobre = new Intent(this, serieSobrenatural.class);
        startActivity(sobre);
    }
    public void abrirGot(){
        Intent got = new Intent(this, serieGot.class);
        startActivity(got);
    }
    public void abrirArrow(){
        Intent arrow = new Intent(this, serieArrow.class);
        startActivity(arrow);
    }
    //////////////FIM TOP 5\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
}