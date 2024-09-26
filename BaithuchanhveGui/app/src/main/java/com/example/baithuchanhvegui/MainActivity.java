package com.example.baithuchanhvegui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
   EditText soA,soB;
   TextView ketqua;
   Button btnTong,btnHieu,btnTich,btnThuong,btnUCLN,btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        soA=(EditText) findViewById(R.id.editTextTextsoA);
        soB=(EditText) findViewById(R.id.editTextTextsoB);
        ketqua=(TextView) findViewById(R.id.tvKetqua);
        btnTong=findViewById(R.id.buttonTong);
        btnHieu=findViewById(R.id.buttonHieu);
        btnTich=findViewById(R.id.buttonTich);
        btnThuong=findViewById(R.id.buttonThuong);
        btnUCLN=findViewById(R.id.buttonUCLN);
        btnThoat=findViewById(R.id.buttonThoat);

    btnTong.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int a=Integer.parseInt(soA.getText().toString());
            int b=Integer.parseInt(soB.getText().toString());
            ketqua.setText("Tổng: " +(a+b));
        }
    });
    btnHieu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int a=Integer.parseInt(soA.getText().toString());
            int b=Integer.parseInt(soB.getText().toString());
            ketqua.setText("Hiệu"+(a-b));
        }
    });
    btnTich.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int a=Integer.parseInt(soA.getText().toString());
            int b=Integer.parseInt(soB.getText().toString());
            ketqua.setText("Tích"+(a*b));
        }
    });
        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(soA.getText().toString());
                int b=Integer.parseInt(soB.getText().toString());
                if(b!=0){
                    ketqua.setText("Thương"+(a/b));
                }
               else {
                    ketqua.setText("B phải >0");
                }
            }
        });
        btnUCLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(soA.getText().toString());
                int b=Integer.parseInt(soB.getText().toString());
                ketqua.setText("UCLN"+gcd(a,b));
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}