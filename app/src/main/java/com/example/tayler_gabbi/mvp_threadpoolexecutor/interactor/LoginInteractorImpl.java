package com.example.tayler_gabbi.mvp_threadpoolexecutor.interactor;

import android.text.TextUtils;
import com.example.tayler_gabbi.mvp_threadpoolexecutor.DemoApplication;
import com.example.tayler_gabbi.mvp_threadpoolexecutor.database.model.Usuario;
import com.example.tayler_gabbi.mvp_threadpoolexecutor.interfas.LoginInteractor;
import com.example.tayler_gabbi.mvp_threadpoolexecutor.interfas.OnLoginFinishListener;
import com.example.tayler_gabbi.mvp_threadpoolexecutor.threadPoolExecutor.DefaultExecutorSupplier;



public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void validarUser(final String user, final String password, final OnLoginFinishListener listener) {
        if(TextUtils.isEmpty(user) || TextUtils.isEmpty(password)){

            listener.loginValidationsError();

        }else {
                        DefaultExecutorSupplier.getInstance().forBackgroundTasks().execute(new Runnable() {

                        @Override public void run() {

                            final Usuario usuario = DemoApplication.dataBase.usuarioDao().userLOgin(user,password);


                            DefaultExecutorSupplier.getInstance().forMainThreadTasks().execute(new Runnable() {
                                @Override public void run() {

                                    if (usuario != null){
                                        listener.loginSuccessExist();
                                    }else{

                                         listener.loginUserError();
                                    }
                                }
                            });

                        }
                    });



       }

    }
}
