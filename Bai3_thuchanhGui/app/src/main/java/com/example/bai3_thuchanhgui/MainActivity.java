package com.example.bai3_thuchanhgui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
Button btnchuandoan;
EditText editTen,editChieuCao,editCannang,editBMI,editChandoan;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnchuandoan=(Button) findViewById(R.id.buttonchuandoan);
        editTen=findViewById(R.id.edtTen);
        editChieuCao=findViewById(R.id.edtchieucao);
        editCannang=findViewById(R.id.edtCannang);
        editBMI=findViewById(R.id.edtBMI);
        editChandoan=findViewById(R.id.edtchuandoan);

        double H=Double.parseDouble(editChieuCao.getText()+"");
        double w=Double.parseDouble(editCannang.getText()+"");
        double BMI=w/Math.pow(H,2);
        String chuandoan="";
     if(BMI<18){
         chuandoan="Bạn gầy ";
     }
     else if(BMI<=24.9){
         chuandoan="Bạn bình thường ";
     }
     else if(BMI<=29.9){
         chuandoan="Bạn béo phì độ 1";
     }
     else if(BMI<=34.9){
         chuandoan="Bạn béo phì độ 2 ";
     }
     else {
         chuandoan="Bạn béo phì độ 3";
     }
        DecimalFormat dcf=new DecimalFormat("#.0");
     editBMI.setText(dcf.format(BMI));
     editChandoan.setText(chuandoan);
    }
}