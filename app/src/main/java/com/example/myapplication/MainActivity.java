package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    EditText etNumero1, etNumero2;
    TextView tvResultado;
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        etNumero1 = findViewById(R.id.etNumero1);
        etNumero2 = findViewById(R.id.etNumero2);
        tvResultado = findViewById(R.id.tvResultado);

        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto1 = etNumero1.getText().toString();
                String texto2 = etNumero2.getText().toString();

                if (!texto1.isEmpty() && !texto2.isEmpty()) {
                    double num1 = Double.parseDouble(texto1);
                    double num2 = Double.parseDouble(texto2);
                    double suma = num1 + num2;
                    tvResultado.setText("Resultado: " + suma);
                } else {
                    Toast.makeText(MainActivity.this, "Por favor ingresa ambos números", Toast.LENGTH_SHORT).show();
                }
            }
        });



        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto1 = etNumero1.getText().toString();
                String texto2 = etNumero2.getText().toString();

                if (!texto1.isEmpty() && !texto2.isEmpty()) {
                    double num1 = Double.parseDouble(texto1);
                    double num2 = Double.parseDouble(texto2);
                    double resta = num1 - num2;
                    tvResultado.setText("Resultado: " + resta);
                } else {
                    Toast.makeText(MainActivity.this, "Por favor ingresa ambos números", Toast.LENGTH_SHORT).show();
                }
            }
        });



        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto1 = etNumero1.getText().toString();
                String texto2 = etNumero2.getText().toString();

                if (!texto1.isEmpty() && !texto2.isEmpty()) {
                    double num1 = Double.parseDouble(texto1);
                    double num2 = Double.parseDouble(texto2);
                    double multiplicacion = num1 * num2;
                    tvResultado.setText("Resultado: " + multiplicacion);
                } else {
                    Toast.makeText(MainActivity.this, "Por favor ingresa ambos números", Toast.LENGTH_SHORT).show();
                }
            }
        });



        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto1 = etNumero1.getText().toString();
                String texto2 = etNumero2.getText().toString();

                if (!texto1.isEmpty() && !texto2.isEmpty()) {
                    double num1 = Double.parseDouble(texto1);
                    double num2 = Double.parseDouble(texto2);

                    if (num2 != 0.0) {
                        double division = num1 / num2;
                        tvResultado.setText("Resultado: " + division);
                    } else {
                        Toast.makeText(MainActivity.this, "No se puede dividir entre cero", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Por favor ingresa ambos números", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}