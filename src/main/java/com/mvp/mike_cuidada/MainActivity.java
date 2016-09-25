package com.mvp.mike_cuidada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.mvp.mike_cuidada.presenter.LoginPresenter;
import com.mvp.mike_cuidada.presenter.impl.LoginPresenterImpl;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements LoginView{

    @InjectView(R.id.username)
    EditText uName;
    @InjectView(R.id.password)
    EditText uPwd;
    @InjectView(R.id.button)
    Button subButton;
    @InjectView(R.id.progress)
    ProgressBar progressBar;

    LoginPresenter  presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);  // 注解控件
        presenter = new LoginPresenterImpl(this);
    }

    @Override
    public void setUnameNotEmpty() {
        uName.setError("用户名不能为空");
    }

    @Override
    public void setPwdNotEmpty() {
        uPwd.setError("密码不能为空");
    }

    @Override
    public void showProgerss() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void toSuccessPage() {
        startActivity(new Intent(getApplicationContext(),HomeActivity.class));
        finish();
    }

    @Override
    public void hideProgeress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    protected void onDestroy() {
        presenter.onDestory();
        super.onDestroy();
    }

    @OnClick(R.id.button)
    public void onClick(View view){
        presenter.validateLoginState(uName.getText().toString(),uPwd.getText().toString());
        Toast.makeText(getApplicationContext(),"click event ",Toast.LENGTH_SHORT).show();
    }
}
