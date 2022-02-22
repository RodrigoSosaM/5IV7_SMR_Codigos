package com.example.calculadoramaterias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText math1, math2, math3, math4, math5, math6, math7, math8, math9,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();


        math1 = (EditText)findViewById(R.id.txt_math1);
        math2 = (EditText)findViewById(R.id.txt_math2);
        math3 = (EditText)findViewById(R.id.txt_math3);
        math4 = (EditText)findViewById(R.id.txt_math4);
        math5 = (EditText)findViewById(R.id.txt_math5);
        math6 = (EditText)findViewById(R.id.txt_math6);
        math7 = (EditText)findViewById(R.id.txt_math7);
        math8 = (EditText)findViewById(R.id.txt_math8);
        math9 = (EditText)findViewById(R.id.txt_math5);


        res = (EditText)findViewById(R.id.txt_result);

    }
    public void promedio (View view){

        double materia1 = Double.parseDouble(math1.getText().toString());
        double materia2 = Double.parseDouble(math2.getText().toString());
        double materia3 = Double.parseDouble(math3.getText().toString());
        double materia4 = Double.parseDouble(math4.getText().toString());
        double materia5 = Double.parseDouble(math5.getText().toString());
        double materia6 = Double.parseDouble(math6.getText().toString());
        double materia7 = Double.parseDouble(math7.getText().toString());
        double materia8 = Double.parseDouble(math8.getText().toString());
        double materia9 = Double.parseDouble(math9.getText().toString());



        double promedio = (materia1+materia2+materia3+materia4+materia5+materia6+materia7+materia8+materia9)/9;

        String result = String.valueOf(promedio);


        res.setText(result);
    }
}