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
        final int a=1;
        buttonsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Operaction operacao =new Operaction(Float.parseFloat(editText.getText().toString()), Float.parseFloat(editText2.getText().toString()));
                operacao.setSum();
                editText3.setText(String.valueOf(operacao.getSum()));

            }
        });

        buttonsubtrai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operaction operacao =new Operaction(Float.parseFloat(editText.getText().toString()), Float.parseFloat(editText2.getText().toString()));
                operacao.setSubtraction();
                editText3.setText(String.valueOf(operacao.getSubtraction()));

            }
        });

        buttonmultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operaction operacao =new Operaction(Float.parseFloat(editText.getText().toString()), Float.parseFloat(editText2.getText().toString()));
                operacao.setmultiplication();
                editText3.setText(String.valueOf(operacao.getmultiplication()));
            }
        });

        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operaction operacao =new Operaction(Float.parseFloat(editText.getText().toString()), Float.parseFloat(editText2.getText().toString()));
                operacao.setDivision();
                editText3.setText(String.valueOf(operacao.getDivision()));

            }
        });

    }
}
