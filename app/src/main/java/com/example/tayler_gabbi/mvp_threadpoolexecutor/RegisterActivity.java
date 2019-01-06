package com.example.tayler_gabbi.mvp_threadpoolexecutor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.tayler_gabbi.mvp_threadpoolexecutor.view.RegisterView;

public class RegisterActivity extends AppCompatActivity implements RegisterView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    @Override
    public void registrarSuccess() {
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
        Toast.makeText(this,"usuario registrado",Toast.LENGTH_LONG).show();
    }

    @Override
    public void nameError() {

        Toast.makeText(this,"Ingrese nombre",Toast.LENGTH_LONG).show();
    }

    @Override
    public void usuarioError() {

        Toast.makeText(this,"Ingrese nombre de usuario",Toast.LENGTH_LONG).show();
    }

    @Override
    public void passwordError() {

        Toast.makeText(this,"Ingrese  Contraseña",Toast.LENGTH_LONG).show();
    }

    @Override
    public void registerError() {

        Toast.makeText(this,"usuario no guardado", Toast.LENGTH_LONG).show();
    }
}
