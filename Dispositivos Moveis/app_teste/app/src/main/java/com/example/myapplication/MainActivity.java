package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button botaoRegister = (Button) findViewById(R.id.button_register);
        Button botaoLogin = (Button) findViewById(R.id.button_login);
        Button botaoSair = (Button) findViewById(R.id.button_sair);
        botaoRegister.setOnClickListener(this);
        botaoLogin.setOnClickListener(this);
        botaoSair.setOnClickListener(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        if (id == R.id.button_sair){
            finish();
        }
        if (id == R.id.button_login){

        }
        if (id == R.id.button_register){

        }
    }
}