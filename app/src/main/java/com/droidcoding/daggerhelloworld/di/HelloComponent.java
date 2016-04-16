package com.droidcoding.daggerhelloworld.di;

import com.droidcoding.daggerhelloworld.MainActivity;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by Donglua on 16/4/15.
 */
@Singleton
@Component(
    modules = HelloModule.class
)
public interface HelloComponent {

  void inject(MainActivity activity);
}
