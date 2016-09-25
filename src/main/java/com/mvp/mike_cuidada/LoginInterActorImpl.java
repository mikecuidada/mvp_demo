package com.mvp.mike_cuidada;

import android.text.TextUtils;

/**
 * Created by cuiyonghong on 16/9/26.
 */

public class LoginInterActorImpl implements LoginInterActor {

    @Override
    public void login(String uName, String pwd, OnLoginStateListener listener) {
        if (TextUtils.isEmpty(uName)) {
            listener.onUnameEmpty();
        } else if (TextUtils.isEmpty(pwd)) {
            listener.onPwdEmpty();
        } else {
            listener.onSuccessPage();
        }
    }
}
