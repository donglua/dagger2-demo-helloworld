package com.droidcoding.daggerhelloworld;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.droidcoding.daggerhelloworld.databinding.ActivityMainBinding;
import com.droidcoding.daggerhelloworld.di.DaggerHelloComponent;
import com.droidcoding.daggerhelloworld.di.HelloModule;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements HelloContract.View {

  private ActivityMainBinding mBinding;

  @Inject HelloPresenter mPresenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

    DaggerHelloComponent.builder()
        .helloModule(new HelloModule(this))
        .build()
        .inject(this);

    mBinding.button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        mPresenter.requestMessage();
      }
    });
  }

  @Override public void showHelloMessage(String msg) {
    Snackbar
        .make(mBinding.getRoot(), msg, Snackbar.LENGTH_SHORT)
        .show();
  }

}
