package com.example.exno2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText password;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.Name);
        password  = findViewById(R.id.Password);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().equals("Mahalakshmi") && password.getText().toString().equals("111718205026")){
                    Intent intent = new Intent(MainActivity.this,Content.class);
                    startActivity(intent);
                }
                else {
                    Context context = getApplicationContext();
                    Toast.makeText(context,"Invalid Username/Password",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}