package com.example.calculadoramaterias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText math1_p1, math1_p2, math1_p3, math2_p1, math2_p2, math2_p3, math3_p1, math3_p2, math3_p3,
            math4_p1, math4_p2, math4_p3, math5_p1, math5_p2, math5_p3, math6_p1, math6_p2, math6_p3,
            math7_p1, math7_p2, math7_p3, math8_p1, math8_p2, math8_p3, math9_p1, math9_p2, math9_p3,
            gen_mt1, gen_mt2, gen_mt3, gen_mt4, gen_mt5, gen_mt6, gen_mt7, gen_mt8, gen_mt9, gen_sem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();


        math1_p1 = (EditText)findViewById(R.id.txt_math1_p1);
        math1_p2 = (EditText)findViewById(R.id.txt_math1_p2);
        math1_p3 = (EditText)findViewById(R.id.txt_math1_p3);
        math2_p1 = (EditText)findViewById(R.id.txt_math2_p1);
        math2_p2 = (EditText)findViewById(R.id.txt_math2_p2);
        math2_p3 = (EditText)findViewById(R.id.txt_math2_p3);
        math3_p1 = (EditText)findViewById(R.id.txt_math3_p1);
        math3_p2 = (EditText)findViewById(R.id.txt_math3_p2);
        math3_p3 = (EditText)findViewById(R.id.txt_math3_p3);
        math4_p1 = (EditText)findViewById(R.id.txt_math4_p1);
        math4_p2 = (EditText)findViewById(R.id.txt_math4_p2);
        math4_p3 = (EditText)findViewById(R.id.txt_math4_p3);
        math5_p1 = (EditText)findViewById(R.id.txt_math5_p1);
        math5_p2 = (EditText)findViewById(R.id.txt_math5_p2);
        math5_p3 = (EditText)findViewById(R.id.txt_math5_p3);
        math6_p1 = (EditText)findViewById(R.id.txt_math6_p1);
        math6_p2 = (EditText)findViewById(R.id.txt_math6_p2);
        math6_p3 = (EditText)findViewById(R.id.txt_math6_p3);
        math7_p1 = (EditText)findViewById(R.id.txt_math7_p1);
        math7_p2 = (EditText)findViewById(R.id.txt_math7_p2);
        math7_p3 = (EditText)findViewById(R.id.txt_math7_p3);
        math8_p1 = (EditText)findViewById(R.id.txt_math8_p1);
        math8_p2 = (EditText)findViewById(R.id.txt_math8_p2);
        math8_p3 = (EditText)findViewById(R.id.txt_math8_p3);
        math9_p1 = (EditText)findViewById(R.id.txt_math9_p1);
        math9_p2 = (EditText)findViewById(R.id.txt_math9_p2);
        math9_p3 = (EditText)findViewById(R.id.txt_math9_p3);
        gen_mt1 = (EditText)findViewById(R.id.txt_gen_mt1);
        gen_mt2 = (EditText)findViewById(R.id.txt_gen_mt2);
        gen_mt3 = (EditText)findViewById(R.id.txt_gen_mt3);
        gen_mt4 = (EditText)findViewById(R.id.txt_gen_mt4);
        gen_mt5 = (EditText)findViewById(R.id.txt_gen_mt5);
        gen_mt6 = (EditText)findViewById(R.id.txt_gen_mt6);
        gen_mt7 = (EditText)findViewById(R.id.txt_gen_mt7);
        gen_mt8 = (EditText)findViewById(R.id.txt_gen_mt8);
        gen_mt9 = (EditText)findViewById(R.id.txt_gen_mt9);

        gen_sem = (EditText)findViewById(R.id.txt_gen_sem);


        math1_p1.setText("0");
        math1_p2.setText("0");
        math1_p3.setText("0");

        math2_p1.setText("0");
        math2_p2.setText("0");
        math2_p3.setText("0");

        math3_p1.setText("0");
        math3_p2.setText("0");
        math3_p3.setText("0");

        math4_p1.setText("0");
        math4_p2.setText("0");
        math4_p3.setText("0");

        math5_p1.setText("0");
        math5_p2.setText("0");
        math5_p3.setText("0");

        math6_p1.setText("0");
        math6_p2.setText("0");
        math6_p3.setText("0");

        math7_p1.setText("0");
        math7_p2.setText("0");
        math7_p3.setText("0");

        math8_p1.setText("0");
        math8_p2.setText("0");
        math8_p3.setText("0");

        math9_p1.setText("0");
        math9_p2.setText("0");
        math9_p3.setText("0");

        gen_mt1.setText("0");
        gen_mt2.setText("0");
        gen_mt3.setText("0");
        gen_mt4.setText("0");
        gen_mt5.setText("0");
        gen_mt6.setText("0");
        gen_mt7.setText("0");
        gen_mt8.setText("0");
        gen_mt9.setText("0");


    }
    public void progenM1 (View view){
        double par1 = Double.parseDouble(math1_p1.getText().toString());
        double par2 = Double.parseDouble(math1_p2.getText().toString());
        double par3 = Double.parseDouble(math1_p3.getText().toString());
        gen_mt1.setText(String.valueOf((par1+par2+par3)/3));
        prosem(view);
    }
    public void progenM2 (View view){
        double par1 = Double.parseDouble(math2_p1.getText().toString());
        double par2 = Double.parseDouble(math2_p2.getText().toString());
        double par3 = Double.parseDouble(math2_p3.getText().toString());
        gen_mt2.setText(String.valueOf((par1+par2+par3)/3));
        prosem(view);
    }
    public void progenM3 (View view){
        double par1 = Double.parseDouble(math3_p1.getText().toString());
        double par2 = Double.parseDouble(math3_p2.getText().toString());
        double par3 = Double.parseDouble(math3_p3.getText().toString());
        gen_mt2.setText(String.valueOf((par1+par2+par3)/3));
        prosem(view);
    }
    public void progenM4 (View view){
        double par1 = Double.parseDouble(math4_p1.getText().toString());
        double par2 = Double.parseDouble(math4_p2.getText().toString());
        double par3 = Double.parseDouble(math4_p3.getText().toString());
        gen_mt2.setText(String.valueOf((par1+par2+par3)/3));
        prosem(view);
    }
    public void progenM5 (View view){
        double par1 = Double.parseDouble(math5_p1.getText().toString());
        double par2 = Double.parseDouble(math5_p2.getText().toString());
        double par3 = Double.parseDouble(math5_p3.getText().toString());
        gen_mt2.setText(String.valueOf((par1+par2+par3)/3));
        prosem(view);
    }
    public void progenM6 (View view){
        double par1 = Double.parseDouble(math6_p1.getText().toString());
        double par2 = Double.parseDouble(math6_p2.getText().toString());
        double par3 = Double.parseDouble(math6_p3.getText().toString());
        gen_mt2.setText(String.valueOf((par1+par2+par3)/3));
        prosem(view);
    }
    public void progenM7 (View view){
        double par1 = Double.parseDouble(math7_p1.getText().toString());
        double par2 = Double.parseDouble(math7_p2.getText().toString());
        double par3 = Double.parseDouble(math7_p3.getText().toString());
        gen_mt2.setText(String.valueOf((par1+par2+par3)/3));
        prosem(view);
    }
    public void progenM8 (View view){
        double par1 = Double.parseDouble(math8_p1.getText().toString());
        double par2 = Double.parseDouble(math8_p2.getText().toString());
        double par3 = Double.parseDouble(math8_p3.getText().toString());
        gen_mt8.setText(String.valueOf((par1+par2+par3)/3));
        prosem(view);
    }
    public void progenM9 (View view){
        double par1 = Double.parseDouble(math9_p1.getText().toString());
        double par2 = Double.parseDouble(math9_p2.getText().toString());
        double par3 = Double.parseDouble(math9_p3.getText().toString());
        gen_mt9.setText(String.valueOf((par1+par2+par3)/3));
        prosem(view);
    }
    public void prosem (View view){
        double gm1 = Double.parseDouble(gen_mt1.getText().toString());
        double gm2 = Double.parseDouble(gen_mt2.getText().toString());
        double gm3 = Double.parseDouble(gen_mt3.getText().toString());
        double gm4 = Double.parseDouble(gen_mt4.getText().toString());
        double gm5 = Double.parseDouble(gen_mt5.getText().toString());
        double gm6 = Double.parseDouble(gen_mt6.getText().toString());
        double gm7 = Double.parseDouble(gen_mt7.getText().toString());
        double gm8 = Double.parseDouble(gen_mt8.getText().toString());
        double gm9 = Double.parseDouble(gen_mt9.getText().toString());
        gen_sem.setText(String.valueOf((gm1+gm2+gm3+gm4+gm5+gm6+gm7+gm8+gm9)/9));
    }

}