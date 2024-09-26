package com.example.bai2_thuchanhgui;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {
 EditText edtfar,edtCel;
 Button btnFar,btnCel,btnCl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

         edtfar=(EditText) findViewById(R.id.edtFar);
        edtCel=(EditText) findViewById(R.id.edtcel);
        btnFar=  findViewById(R.id.btnFar);
        btnCel=  findViewById(R.id.btnCel);
        btnCl=  findViewById(R.id.btnClear);

         btnFar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 float far=Float.parseFloat(edtfar.getText().toString());
                 float fahrenheit = far *9/5 +32;
                 edtCel.setText(String.valueOf(fahrenheit));
             }
         });
        btnCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float Cel=Float.parseFloat(edtCel.getText().toString());
                float celsius = (Cel - 32) * 5 / 9;
                edtfar.setText(String.valueOf(celsius));
            }
        });
        btnCl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtfar.setText("");
                edtCel.setText("");
            }
        });
    }
}