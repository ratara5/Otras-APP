package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity
        extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Método para botón gato
    public void mensajeGato(View view){
        Toast.makeText(this, "Este es un GATO", Toast.LENGTH_SHORT).show();
    }
    //Método para botón oso
    public void mensajeOso(View view){
        Toast.makeText(this, "Este es un OSO", Toast.LENGTH_SHORT).show();
    }
}