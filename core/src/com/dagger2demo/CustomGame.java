package com.dagger2demo;

import com.badlogic.gdx.Game;
import com.dagger2demo.view.GameScreen;

import javax.inject.Inject;

/**
 * Created by Çağatay Çavuşoğlu on 14.07.2016.
 */
public class CustomGame extends Game {
    private GameScreen gameScreen;

    @Inject
    public CustomGame(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
    }

    @Override
    public void create() {
        setScreen(gameScreen);
    }
}
