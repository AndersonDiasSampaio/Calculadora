package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    EditText editText3;
    Button buttonsoma, buttonsubtrai, buttondivide, buttonmultiplica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonsoma=(Button)findViewById(R.id.button);
        buttonmultiplica=(Button)findViewById(R.id.button2);
        buttonsubtrai=(Button)findViewById(R.id.button3);
        buttondivide=(Button)findViewById(R.id.button4);
        editText= (EditText) findViewById(R.id.editText);
        editText2= (EditText) findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        buttonsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operacao operacao =new Operacao(Float.parseFloat(editText.getText().toString()), Float.parseFloat(editText2.getText().toString()));
                operacao.setSoma();
                editText3.setText(String.valueOf(operacao.getSoma()));

            }
        });

        buttonsubtrai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operacao operacao =new Operacao(Float.parseFloat(editText.getText().toString()), Float.parseFloat(editText2.getText().toString()));
                operacao.setSubtracao();
                editText3.setText(String.valueOf(operacao.getSubtracao()));

            }
        });

        buttonmultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operacao operacao =new Operacao(Float.parseFloat(editText.getText().toString()), Float.parseFloat(editText2.getText().toString()));
                operacao.setMultiplicacao();
                editText3.setText(String.valueOf(operacao.getMultiplicacao()));
            }
        });

        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operacao operacao =new Operacao(Float.parseFloat(editText.getText().toString()), Float.parseFloat(editText2.getText().toString()));
                operacao.setDivisao();
                editText3.setText(String.valueOf(operacao.getDivisao()));

            }
        });

    }
}
