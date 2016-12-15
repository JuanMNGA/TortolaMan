package com.tortola.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

import java.util.ArrayList;

/**
 * Created by juanm on 23/11/2016.
 */
public class Level {
    private Texture tBackgroundSky;
    private Texture tBackgroundL1;
    private Texture tBackgroundL2;

    private Texture MainPlatform;

    private ArrayList<Platform> Platforms;

    private ArrayList<Enemy> Enemies;

    public Level(){}

    public void addBackground(Texture sky){
        tBackgroundSky = sky;
    }

    public void addBackground(Texture sky, Texture l1){
        addBackground(sky);
        tBackgroundL1 = l1;
    }

    public void addBackground(Texture sky, Texture l1, Texture l2){
        addBackground(sky, l1);
        tBackgroundL2 = l2;
    }

    public void addMainPlatform(Texture plat){
        MainPlatform = plat;
    }

    public void addPlatforms(ArrayList<Platform> plat){
        Platforms = plat;
    }

    public void addEnemies(ArrayList<Enemy> enem){
        Enemies = enem;
    }

    public void buildLevel(Stage stage){

    }

    public void draw(Stage stage){
        stage.act(Gdx.graphics.getDeltaTime());

        stage.getBatch().begin();

        stage.getBatch().draw(tBackgroundSky,0,0);
        stage.getBatch().draw(tBackgroundL1,0,0);
        stage.getBatch().draw(tBackgroundL2,0,0);

        stage.getBatch().end();

        stage.draw();

    }
}
