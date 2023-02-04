package com.sapato.simarropop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.sapato.simarropop.R;

public class LoginActivity extends AppCompatActivity {

    private EditText mUsernameView;
    private EditText mPasswordView;
    private Button mLoginButton;
    private TextView mSignUpLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUsernameView = findViewById(R.id.usernameLogin);
        mPasswordView = findViewById(R.id.passwordLogin);
        mLoginButton = findViewById(R.id.login_button);
        mSignUpLink = findViewById(R.id.sign_up_link);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptLogin();
                Intent i = new Intent(LoginActivity.this,MainActivity.class);
                //i.putExtra();
                startActivity(i);
            }
        });

        mSignUpLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ir a pantalla de registro
            }
        });
    }

    private void attemptLogin() {
        // Validar credenciales aquí

        // Mostrar progreso
        // Realizar inicio de sesión en segundo plano

        // Ir a la siguiente actividad en caso de éxito
    }
}