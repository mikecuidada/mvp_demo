package com.mvp.mike_cuidada.presenter;

import com.mvp.mike_cuidada.LoginView;

/**
 * Created by cuiyonghong on 16/9/26.
 */

public interface LoginPresenter {
    /**
     * 验证当前的登录
     */
    void validateLoginState(String uName, String pwd);

    /**
     * 注销引用。避免引起的内存泄漏
     */
    void onDestory();
}
