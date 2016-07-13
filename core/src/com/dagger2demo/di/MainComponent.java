package com.dagger2demo.di;

import com.dagger2demo.Dagger2Demo;
import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by Çağatay Çavuşoğlu on 13.07.2016.
 */
@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(Dagger2Demo applicationListener);
}
