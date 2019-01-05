package com.example.tayler_gabbi.mvp_threadpoolexecutor.interfas;


public interface LoginInteractor {

  void validarUser(String user, String password, OnLoginFinishListener listener);
}
