package com.example.tayler_gabbi.mvp_threadpoolexecutor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tayler_gabbi.mvp_threadpoolexecutor.view.LoginView;

public class LoginActivity extends AppCompatActivity implements LoginView{

    private EditText editPass,editUser;
    private Button logearse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        editUser = findViewById(R.id.edit_usuario);
        editPass = findViewById(R.id.edit_pasword);
        logearse = findViewById(R.id.button_ingresar);


    }

    @Override
    public void loginValidations() {

        Toast.makeText(LoginActivity.this, "Debes ingresar campos correspondientes", Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginSuccess() {
        Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
        startActivity(intent);
        editUser.setText("");
        editPass.setText("");
        finish();
    }

    @Override
    public void loginError() {
        Toast.makeText(LoginActivity.this, "Usuario o Contraseña Incorrectos", Toast.LENGTH_LONG).show();
    }
}
