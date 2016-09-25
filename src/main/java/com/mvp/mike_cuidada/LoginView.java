package com.mvp.mike_cuidada;

/**
 * Created by cuiyonghong on 16/9/25.
 */

public interface LoginView {
    /**
     * 用户名 错误或者为空
     */
    void setUnameNotEmpty();

    /**
     * 密码为空时
     */
    void setPwdNotEmpty();

    /**
     * 显示进度条
     */
    void showProgerss();

    /**
     * 验证成功,跳转到下一个页面
     */
    void toSuccessPage();

    /**
     * 隐藏进度条布局
     */
    void hideProgeress();

}
