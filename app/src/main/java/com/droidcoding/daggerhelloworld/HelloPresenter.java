package com.droidcoding.daggerhelloworld;

import javax.inject.Inject;

/**
 * Created by Donglua on 16/4/15.
 */
public class HelloPresenter implements HelloContract.Presenter {

  private final HelloContract.View helloView;
  private final String message;

  @Inject // 注入到构造方法
  public HelloPresenter(HelloContract.View helloView, String message) {
    this.helloView = helloView;
    this.message   = message;
  }

  public void requestMessage() {
    helloView.showHelloMessage(message);
  }

}
