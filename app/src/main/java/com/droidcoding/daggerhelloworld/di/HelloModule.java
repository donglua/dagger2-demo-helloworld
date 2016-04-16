package com.droidcoding.daggerhelloworld.di;

import com.droidcoding.daggerhelloworld.HelloContract;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Donglua on 16/4/15.
 */
@Module
public class HelloModule {

  private final HelloContract.View view;

  public HelloModule(HelloContract.View view) {
    this.view = view;
  }

  @Provides @Singleton
  public HelloContract.View providesHelloView() {
    return this.view;
  }

  @Provides @Singleton
  public String providesHelloMessage() {
    return "Hello World!";
  }
}
