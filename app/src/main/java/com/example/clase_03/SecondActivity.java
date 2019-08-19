package com.example.clase_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView) findViewById(R.id.textViewSecond);

        // Tomar los datos del intent
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.getString("texto") != null){
            String text = bundle.getString("texto");
            Toast.makeText(SecondActivity.this, text, Toast.LENGTH_LONG).show();
            textView.setText(text);
        }else {
            Toast.makeText(SecondActivity.this, "It is empty!", Toast.LENGTH_LONG).show();

        }


    }
}
