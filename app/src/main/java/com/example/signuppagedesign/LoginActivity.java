package com.example.signuppagedesign;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button register;
    Button login;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        register = findViewById(R.id.registration2);
        login = findViewById(R.id.login2);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
}
