package com.example.clase_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonMain;
    private EditText editTextUser, editTextPass;
    private String texto = "Activity-Two";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMain = (Button) findViewById(R.id.buttonMain);
        editTextUser = (EditText) findViewById(R.id.editTextUser);
        editTextPass = (EditText) findViewById(R.id.editTextPass);

        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextUser.getText().toString().equals("yaritza") && editTextPass.getText().toString().equals("123")){
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("texto", texto);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();
                }


            }
        });


    }
}
