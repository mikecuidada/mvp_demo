package com.mvp.mike_cuidada.presenter.impl;

import android.text.TextUtils;

import com.mvp.mike_cuidada.LoginInterActor;
import com.mvp.mike_cuidada.LoginInterActorImpl;
import com.mvp.mike_cuidada.LoginView;
import com.mvp.mike_cuidada.presenter.LoginPresenter;

/**
 * Created by cuiyonghong on 16/9/26.
 */

public class LoginPresenterImpl implements LoginPresenter , LoginInterActor.OnLoginStateListener{

    private LoginView loginView;

    private LoginInterActor loginInterActor;

    public LoginPresenterImpl(LoginView loginView){
        this.loginView = loginView;
        loginInterActor = new LoginInterActorImpl();
    }

    @Override
    public void validateLoginState(String uName, String pwd) {
        if (loginView !=null){
            loginView.showProgerss();
        }
      loginInterActor.login(uName,pwd,this);
    }

    @Override
    public void onDestory() {
        loginView = null;
    }


    @Override
    public void onUnameEmpty() {
        loginView.hideProgeress();
        loginView.setUnameNotEmpty();
    }

    @Override
    public void onPwdEmpty() {
        loginView.hideProgeress();
        loginView.setPwdNotEmpty();
    }

    @Override
    public void onSuccessPage() {
        loginView.hideProgeress();
        loginView.toSuccessPage();
    }
}
