package com.example.pruebasmpsmps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Button buttonIngresar;
    Button btnCrearUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*codigo para hacer clink en registrarse y pasar a la otra activity*/
        btn = findViewById(R.id.buttonRegistro);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2Registro.class);
                startActivity(intent);
            }
        });

        buttonIngresar= findViewById(R.id.buttonIngresar);

        buttonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MenuUsuario.class);
                startActivity(intent);



        // SE NECESITA QUE EL BOTON DE CREAR USUARIO FUNCIONE
        btnCrearUsuario = findViewById(R.id.buttonCrearUsuario);


        btnCrearUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MenuUsuario.class);
                startActivity(intent);
            }
        });

    }
});

    }



}