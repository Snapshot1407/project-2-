package com.mygdx.buhoma;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Stage;


public class Buhoma extends Game {
//исполнительный файл




    public static final int widthDesktop=1280;
    public static final int heightDesktop=720;
    public int width,height;
    //создаем экраны
    // добавлять экземпляры экранов
    GameScreen gameScreen;
    QuestScreen questScreen;
    MainMenuScreen mainMenuScreen;
    MenuPauseScreen menuPauseScreen;
    LevelScreen levelScreen;
    int k[];

    @Override
    public void create() {
        width = Gdx.graphics.getWidth();
        height = Gdx.graphics.getHeight();
        // libGDX по умолчанию использует Arial шрифт.
        //обьявляем экраны
        levelScreen = new LevelScreen(this);
        menuPauseScreen = new MenuPauseScreen(this);


        mainMenuScreen = new MainMenuScreen(this);
        questScreen = new QuestScreen(this);
        //экран который запустится первым
        this.setScreen(new MainMenuScreen(this));
    }

    public void render() {
        super.render(); // важно!
    }
    public void setGameScreen(){
        gameScreen = new GameScreen(this);
        setScreen(gameScreen);
    }

    public void paramgameScreen(){

    }

    public void dispose() {


    }

}
