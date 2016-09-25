package com.mvp.mike_cuidada;

/**
 * Created by cuiyonghong on 16/9/26.
 */

public interface LoginInterActor{

    public interface OnLoginStateListener{
        void onUnameEmpty();
        void onPwdEmpty();
        void onSuccessPage();
    }

    void login(String uName,String pwd,OnLoginStateListener listener);
}
