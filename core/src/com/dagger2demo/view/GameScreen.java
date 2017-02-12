package com.dagger2demo.view;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dagger2demo.controller.MainController;

import javax.inject.Inject;

/**
 * Created by Çağatay Çavuşoğlu on 14.07.2016.
 */
public class GameScreen implements Screen {
    private SpriteBatch batch;
    private Texture     img;
    private MainController mainController;

    @Inject
    public GameScreen(MainController mainController) {
        this.mainController = mainController;
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");
    }

    @Override
    public void render(float delta) {
        batch.begin();
        batch.draw(img, 0, 0);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
