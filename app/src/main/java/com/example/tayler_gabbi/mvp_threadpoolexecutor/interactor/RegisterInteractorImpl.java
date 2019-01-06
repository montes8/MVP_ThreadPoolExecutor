package com.example.tayler_gabbi.mvp_threadpoolexecutor.interactor;

import android.text.TextUtils;

import com.example.tayler_gabbi.mvp_threadpoolexecutor.DemoApplication;
import com.example.tayler_gabbi.mvp_threadpoolexecutor.database.model.Usuario;
import com.example.tayler_gabbi.mvp_threadpoolexecutor.interfas.OnRegisterFinishListener;
import com.example.tayler_gabbi.mvp_threadpoolexecutor.interfas.RegisterInteractor;
import com.example.tayler_gabbi.mvp_threadpoolexecutor.presenter.RegisterPresenter;

public class RegisterInteractorImpl implements RegisterInteractor {

    private RegisterPresenter registerPresenter;


    @Override
    public void registrarUser(String name, String user, String password, OnRegisterFinishListener listener) {
        if (TextUtils.isEmpty(name)) {

            listener.nombreError();

        } else if (TextUtils.isEmpty(user)) {

            listener.usuError();
        } else if (TextUtils.isEmpty(password)) {

            listener.contraseniaError();

        } else {

            Usuario usuarioi = new Usuario();
            usuarioi.setNombre(name);
            usuarioi.setNombreUsuario(user);
            usuarioi.setContrasenia(password);
            Long idResultante = DemoApplication.dataBase.usuarioDao().insertarUsuario(usuarioi);

            if (idResultante != null && idResultante > 0) {

                listener.registrarSuccessExcito();

            } else {

                listener.registroError();
            }
        }
    }
}
