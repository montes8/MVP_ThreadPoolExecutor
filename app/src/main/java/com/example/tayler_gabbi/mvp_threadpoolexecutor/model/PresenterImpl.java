package com.example.tayler_gabbi.mvp_threadpoolexecutor.model;


import com.example.tayler_gabbi.mvp_threadpoolexecutor.interfas.LoginInteractor;
import com.example.tayler_gabbi.mvp_threadpoolexecutor.interfas.OnLoginFinishListener;
import com.example.tayler_gabbi.mvp_threadpoolexecutor.presenter.LoginPresenter;
import com.example.tayler_gabbi.mvp_threadpoolexecutor.view.LoginView;

public class PresenterImpl implements LoginPresenter,OnLoginFinishListener {

    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public PresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        //this.loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void usuarioSucces(String user, String password) {
        if (loginView != null){

        }
        loginInteractor.validarUser(user,password,this);

    }

    @Override
    public void loginValidationsError() {

        if (loginView != null){
            loginView.loginValidations();
        }

    }

    @Override
    public void loginSuccessExist() {
        if (loginView != null){
           loginView.loginSuccess();
        }
    }

    @Override
    public void loginUserError() {
        if (loginView != null){
            loginView.loginError();
        }

    }
}
