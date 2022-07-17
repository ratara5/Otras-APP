package com.example.parametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1=(TextView)findViewById(R.id.textView);

        String dato2=getIntent().getStringExtra("dato");

        tv1.setText("Hola "+dato2);
    }

    //Método Botón ATRAS
    public void atras(View view){
        Intent atras=new Intent(this,MainActivity.class);
        startActivity(atras);
    }
}