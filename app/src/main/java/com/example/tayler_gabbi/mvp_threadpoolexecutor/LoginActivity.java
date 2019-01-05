package com.example.tayler_gabbi.mvp_threadpoolexecutor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

     /*   DefaultExecutorSupplier.getInstance().forBackgroundTasks().execute(new Runnable() {

            @Override public void run() {

                final Usuario usuario = DemoApplication.dataBase.usuarioDao().userLOgin(nombre.getText().toString(),contasenia.getText().toString());


                DefaultExecutorSupplier.getInstance().forMainThreadTasks().execute(new Runnable() {
                    @Override public void run() {

                        if (usuario != null){
                            Toast.makeText(LoginActivity.this,"Bienvenida"+usuario.getNombre(),Toast.LENGTH_SHORT).show();
                            Intent inten = new Intent(LoginActivity.this,HomeActivity.class);
                            startActivity(inten);
                        }else{

                            Toast.makeText(LoginActivity.this,"Usuario o contraseña incorrectos",Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });
    }
});*/
    }
}
