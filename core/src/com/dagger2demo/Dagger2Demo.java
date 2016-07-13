package com.dagger2demo;

import com.badlogic.gdx.ApplicationAdapter;
import com.dagger2demo.di.DaggerMainComponent;
import com.dagger2demo.di.MainComponent;
import com.dagger2demo.di.MainModule;

import javax.inject.Inject;

public class Dagger2Demo extends ApplicationAdapter {
    private final MainComponent component;
    @Inject       CustomGame    customGame;

    public Dagger2Demo() {
        component = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        component.inject(this);
    }

    @Override
    public void create() {
        customGame.create();
    }

    @Override
    public void render() {
        customGame.render();
    }

    @Override
    public void dispose() {
        customGame.dispose();
    }

    public MainComponent getComponent() {
        return component;
    }
}
