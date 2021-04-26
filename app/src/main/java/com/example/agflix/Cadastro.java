package com.example.agflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.agflix.modelo.Pessoa;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class Cadastro extends AppCompatActivity {
    EditText editNome, editEmail;
   Button btnLogar;

    FirebaseDatabase firebasedatabase;
    DatabaseReference databasereference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        editEmail = findViewById(R.id.editEmail);
        editNome = findViewById(R.id.editNome);
        btnLogar = findViewById(R.id.btnLogar);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirHome();
            }

        });
    }

    public void inicializarFirebase()
    {
        FirebaseApp firebaseApp = FirebaseApp.initializeApp(Cadastro.this);
        firebasedatabase = FirebaseDatabase.getInstance();
        databasereference = firebasedatabase.getReference();
    }



    //inserindo ação para put dados no banco de dados
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        //ao clicar em add
        if(id == R.id.editNome) ///mudar aqui
        {
            Pessoa p = new Pessoa();
            p.setId(UUID.randomUUID().toString());
            p.setNome(editNome.getText().toString());
            p.setEmail(editEmail.getText().toString());
            databasereference.child("Pessoa").child(p.getId()).setValue(p);
            limparCampos();

        }
        return  true;
    }
    public void limparCampos()
    {
        editNome.setText("");
        editEmail.setText("");
    }

    public void abrirHome(){
        Intent home = new Intent(this, Home.class);
        startActivity(home);
    }


}