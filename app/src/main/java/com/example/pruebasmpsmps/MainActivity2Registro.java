package com.example.pruebasmpsmps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;


public class MainActivity2Registro extends AppCompatActivity {

    Button btnCrearUsuario;

    private String dni, name, lastName;

    private EditText db_ci, db_nombre, db_apellido, db_contrasena;

    private static final String TAG = "mpsusers";
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_registro);

        db_ci = (EditText) findViewById(R.id.editTextNumberCI);
        db_nombre = (EditText) findViewById(R.id.editTextNombre);
        db_apellido = (EditText) findViewById(R.id.editTextApellido);



        btnCrearUsuario = findViewById(R.id.buttonCrearUsuario);


        btnCrearUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dni = db_ci.getText().toString();
                name = db_nombre.getText().toString();
                lastName = db_apellido.getText().toString();

                Map<String, Object> users = new HashMap<>();

                users.put("CI", dni);
                users.put("Nombre", name);
                users.put("Apellido", lastName);


                db.collection("users")
                        .add(users)
                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                            @Override
                            public void onSuccess(DocumentReference documentReference) {
                                Log.d(TAG, "Documento agregado con:  " + documentReference.getId());
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(TAG, "Error al agregar datos", e);
                            }
                        });
                Intent intent = new Intent(MainActivity2Registro.this,MenuUsuario.class);
                startActivity(intent);




                /*db.collection("users").document(db_ci).set(
                        hashMapOf("nombre" to db_nombre.toString(),
                                "apellido" to db_apellido.toString())*/



            }
        });
    }
        /*public void Registro(View view){

            AdminSQLMPS admin = new AdminSQLMPS(this, "admin", null, 1);
            SQLiteDatabase BaseMPS = admin.getWritableDatabase();

            String ci = db_ci.getText().toString();
            String nombre = db_nombre.getText().toString();
            String apellido = db_apellido.getText().toString();


            if (!ci.isEmpty() && !nombre.isEmpty() && !apellido.isEmpty()) {
                ContentValues registro = new ContentValues();
                registro.put("ci", ci);
                registro.put("nombre", nombre);
                registro.put("apellido", apellido);

                BaseMPS.insert("usuarios", null, registro);

                BaseMPS.close();
                db_ci.setText("");
                db_nombre.setText("");
                db_apellido.setText("");

                Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(this, "Debes llenar todos los campos", Toast.LENGTH_SHORT).show();
            }*/
        }



