package com.qaitpay.guess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    EditText numbers;
    int i1, guessInt;

    public void toast(String string){
        Toast.makeText(MainActivity2.this, string, Toast.LENGTH_SHORT).show();
        numbers.setText("");


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        numbers = findViewById(R.id.numbers);
        Random r = new Random();
        i1 = r.nextInt(20) + 1;
    }

    public void guess(View view) {
        guessInt = Integer.parseInt(numbers.getText().toString());


        if (guessInt > i1)
        {
            toast("Lower !");
        }

        else if (guessInt < i1)
        {
            toast("Higher !");
        }

        else
            {
            toast("This's Right 'Number ! Now Try Again !");
            Random r = new Random();
            i1 = r.nextInt(20) + 1;
        }
    }
}