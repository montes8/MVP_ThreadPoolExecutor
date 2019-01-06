package com.example.tayler_gabbi.mvp_threadpoolexecutor.interfas;


public interface RegisterInteractor {

    void registrarUser(String name, String user, String password, OnRegisterFinishListener listener);
}
