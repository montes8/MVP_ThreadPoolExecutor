package com.example.tayler_gabbi.mvp_threadpoolexecutor.model;


import com.example.tayler_gabbi.mvp_threadpoolexecutor.interfas.OnRegisterFinishListener;
import com.example.tayler_gabbi.mvp_threadpoolexecutor.presenter.RegisterPresenter;
import com.example.tayler_gabbi.mvp_threadpoolexecutor.view.RegisterView;

public class RegisterPresenterImpl implements RegisterPresenter,OnRegisterFinishListener {

    private RegisterView registerView;
    //private RegisterInteractor registerInteractor;

    public RegisterPresenterImpl(RegisterView registerView) {
        this.registerView = registerView;
        //this.registerInteractor = new RegisterInteractorImpl();
    }

    @Override
    public void RegisterSucces(String name, String user, String password) {

        //registerInteractor.registrarUser(name,user,password,usuarioDao,this);

    }

    @Override
    public void registrarSuccessExcito() {

        if (registerView != null){
            registerView.registrarSuccess();
        }

    }

    @Override
    public void nombreError() {

        if (registerView != null){
            registerView.nameError();
        }

    }

    @Override
    public void usuError() {

        if (registerView != null){
            registerView.usuarioError();
        }
    }

    @Override
    public void contraseniaError() {
        if (registerView != null){
            registerView.passwordError();
        }
    }

    @Override
    public void registroError() {
        if (registerView != null){
            registerView.registerError();
        }
    }
}
