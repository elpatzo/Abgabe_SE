package com.example.patrick.checkpalindrom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    public static boolean isPalindrom(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public void checkPalindrom (View view){
        EditText editText = (EditText) findViewById(R.id.editText2);
        String message = editText.getText().toString();
        TextView textView = (TextView) findViewById(R.id.textView4);



        if (message.toCharArray().length == 0){
            textView.setText("Keinen String eingegeben");
        }

        else if (message.toCharArray().length <= 4 ){
            textView.setText("String zu kurz, mindestens 5 Buchstaben");
        }

        else {

            if(isPalindrom(message) == true){
                textView.setText("Ist Palindrom");
            }

            else {
                textView.setText("Ist kein Palindrom");
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
