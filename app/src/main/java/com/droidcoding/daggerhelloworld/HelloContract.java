package com.droidcoding.daggerhelloworld;

/**
 * Created by Donglua on 16/4/15.
 */
public interface HelloContract {

  interface View {
    void showHelloMessage(String msg);
  }

  interface Presenter {
    void requestMessage();
  }

}
