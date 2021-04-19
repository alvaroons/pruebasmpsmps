package com.example.pruebasmpsmps;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.example.pruebasmpsmps.MainActivity2Registro;


public class MenuUsuario extends AppCompatActivity {

    private TextView mtextLastName, mtextName, mtextCI;


    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference referencia = database.getReference("message");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_usuario);
        this.db_ci =

        mtextLastName = (TextView) findViewById(R.id.textLastName);
        mtextName = (TextView) findViewById(R.id.textName);
        mtextCI = (TextView) findViewById(R.id.textCI);

        private TextView mtextLastName, mtextName, mtextCI;
        private DatabaseReference mDatabase;




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu_usuario);


            mtextLastName = (TextView) findViewById(R.id.textLastName);
            mtextName = (TextView) findViewById(R.id.textName);
            mtextCI = (TextView) findViewById(R.id.textCI);

            mDatabase = FirebaseDatabase.getInstance().getReference(String.valueOf(db_ci));



        }


}