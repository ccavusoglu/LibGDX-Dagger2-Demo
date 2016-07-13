package com.dagger2demo.di;

import com.dagger2demo.controller.MainController;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created by Çağatay Çavuşoğlu on 13.07.2016.
 */
@Module
public class MainModule {
    @Provides
    @Singleton
    MainController provideMainController() {
        return new MainController();
    }
}
