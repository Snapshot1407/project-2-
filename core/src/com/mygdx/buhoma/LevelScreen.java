package com.mygdx.buhoma;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;

public class LevelScreen extends BaseScreen{


    public int[][] k = {{13,0,13,0}, {16,0,16,0}, {1,17,0,19},{18,5,18,19,17,0},{4,32,4,32},{19,6,19,32},//мама.папа.брат.сестра.дядя.тётя-
            {0,17,1,20,8}, {0,2,19,15,1,20,18}, {0,1,17,9,11,15,18},{0,16,5,12,29,18,9,14},{0,13,5,19,9,18,19},{0,9,18,19},//арбуз.автобус.абрикос.апельсин.аметист.аист-
            {1,0,14,0,14},{1,0,17,0,14},{1,0,19,15,14},{1,0,32,14},{1,5,12,11,0},//банан.баран.батон.баян.белка-
            {2,15,17,15,14,0},{2,5,14,9,11},{2,5,19,11,0},{2,5,12,15,18,9,16,5,19},{2,5,17,1,12,31,4},//ворона.веник.ветка.велосипет.верблюд-
            {4,5,17,5,2,15},{4,17,15,2,0},{4,32,19,5,12},{4,28,14,32},{4,2,5,17,29},//дерево.дрова.дятел.дыня.дверь-
            {5,14,15,19},{5,7,5,2,9,11,0},{5,4,9,14,15,17,15,3},{6,12,11,0},{6,7},//енот.ежевика.единорог.ёлка.ёж-
            {18,0,13,15,12,6,19},{18,12,15,14},{18,15,1,0,11,0},{18,0,13,15,2,0,17},{18,0,12,31,19},//самолёт.слон.собака.самовар.салют-
            {16,5,19,20,22},{16,9,14,3,2,9,14},{16,0,20,11},{16,5,17,5,23},{16,15,13,9,4,15,17},{16,0,2,12,9,14},//петух.пингвин.паук.перец.помидор.павлин-
            {24,0,25,11,0},{24,0,18,28},{24,5,17,5,16,0,22,0},{24,5,13,15,4,0,14},{24,5,18,14,15,11},{24,0,10,11,0},//чашка.часы.черепаха.чемодан.чеснок.чайка-
            {17,0,11},{17,28,1,0},{17,0,11,20,25,11,0},{17,0,11,5,19,0},{17,15,3,0,19,11,0},{17,5,16,0},{17,28,18,29},{17,15,8,0},{17,15,13,0,25,11,0},{17,20,11,0},//рак.рыба.ракушка.ракета.рогатка.репа.рысь.роза.ромашка.рука-*/


    };

    Stage stage;

    final Buhoma game;
    OrthographicCamera camera;
    Image level;
    TextButton button, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private TextButton exit;

    private MyFontButton skin;

    public LevelScreen(Buhoma game) {
        super(game);
        this.game = game;
    }

    @Override
    public void show() {




        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        Gdx.input.setCatchBackKey(true);

        // устанавливаем переменные высоты и ширины в качестве области просмотра нашей игры
        camera = new OrthographicCamera(game.width, game.height);

        // этим методом мы центруем камеру на половину высоты и половину ширины
        camera.setToOrtho(false,game.width,game.height);
        level = new Image(new Texture(Gdx.files.internal("images/level.png")));
        level.setSize(game.width,game.height);
        stage.addActor(level);

        skin = new MyFontButton();

        button = new TextButton("0",skin.textButtonStyle_level1);
        button1 = new TextButton("1",skin.textButtonStyle_level2);
        button2 = new TextButton("2",skin.textButtonStyle_level1);
        button3 = new TextButton("3",skin.textButtonStyle_level2);
        button4 = new TextButton("4",skin.textButtonStyle_level1);

        button5 = new TextButton("5",skin.textButtonStyle_level1);
        button6 = new TextButton("6",skin.textButtonStyle_level2);
        button7 = new TextButton("7",skin.textButtonStyle_level1);
        button8 = new TextButton("8",skin.textButtonStyle_level2);
        button9 = new TextButton("9",skin.textButtonStyle_level1);


        //Setsize button

        button.setSize(game.width*MainMenuScreen.const_button_width,game.height*MainMenuScreen.const_button_height);
        button1.setSize(game.width*MainMenuScreen.const_button_width,game.height*MainMenuScreen.const_button_height);
        button2.setSize(game.width*MainMenuScreen.const_button_width,game.height*MainMenuScreen.const_button_height);
        button3.setSize(game.width*MainMenuScreen.const_button_width,game.height*MainMenuScreen.const_button_height);
        button4.setSize(game.width*MainMenuScreen.const_button_width,game.height*MainMenuScreen.const_button_height);
        button5.setSize(game.width*MainMenuScreen.const_button_width,game.height*MainMenuScreen.const_button_height);
        button6.setSize(game.width*MainMenuScreen.const_button_width,game.height*MainMenuScreen.const_button_height);
        button7.setSize(game.width*MainMenuScreen.const_button_width,game.height*MainMenuScreen.const_button_height);
        button8.setSize(game.width*MainMenuScreen.const_button_width,game.height*MainMenuScreen.const_button_height);
        button9.setSize(game.width*MainMenuScreen.const_button_width,game.height*MainMenuScreen.const_button_height);





        //setPosition button

        button.setPosition(button.getWidth() * 0.5f,game.height-(button.getHeight()*3.5f));
        button1.setPosition(button.getWidth() * 1.6f,game.height-(button.getHeight()*3.5f));
        button2.setPosition(button.getWidth() * 2.7f,game.height-(button.getHeight()*3.5f));
        button3.setPosition(button.getWidth() * 3.8f,game.height-(button.getHeight()*3.5f));
        button4.setPosition(game.width - (button4.getWidth()*1.5f),game.height-(button.getHeight()*3.5f));

        button5.setPosition(button.getWidth() * 0.5f,game.height-(button.getHeight()*5.5f));
        button6.setPosition(button.getWidth() * 1.6f,game.height-(button.getHeight()*5.5f));
        button7.setPosition(button.getWidth() * 2.7f,game.height-(button.getHeight()*5.5f));
        button8.setPosition(button.getWidth() * 3.8f,game.height-(button.getHeight()*5.5f));
        button9.setPosition(game.width - (button4.getWidth()*1.5f),game.height-(button.getHeight()*5.5f));




        button.addCaptureListener(new ChangeListener() {@Override public void changed(ChangeEvent event, Actor actor) {
            game.setGameScreen();
            game.gameScreen.setSwitch_i(0);}});
        button1.addCaptureListener(new ChangeListener() {@Override public void changed(ChangeEvent event, Actor actor) {
            game.setGameScreen();
            game.gameScreen.setSwitch_i(1);}});
        button2.addCaptureListener(new ChangeListener() {@Override public void changed(ChangeEvent event, Actor actor) {
            game.setGameScreen();
            game.gameScreen.setSwitch_i(2);}});
        button3.addCaptureListener(new ChangeListener() {@Override public void changed(ChangeEvent event, Actor actor) {
            game.setGameScreen();
            game.gameScreen.setSwitch_i(3);}});
        button4.addCaptureListener(new ChangeListener() {@Override public void changed(ChangeEvent event, Actor actor) {
            game.setGameScreen();
            game.gameScreen.setSwitch_i(4);}});
        button5.addCaptureListener(new ChangeListener() {@Override public void changed(ChangeEvent event, Actor actor) {
            game.setGameScreen();
            game.gameScreen.setSwitch_i(5);}});
        button6.addCaptureListener(new ChangeListener() {@Override public void changed(ChangeEvent event, Actor actor) {
            game.setGameScreen();
            game.gameScreen.setSwitch_i(6);}});
        button7.addCaptureListener(new ChangeListener() {@Override public void changed(ChangeEvent event, Actor actor) {
            game.setGameScreen();
            game.gameScreen.setSwitch_i(7);}});
        button8.addCaptureListener(new ChangeListener() {@Override public void changed(ChangeEvent event, Actor actor) {
            game.setGameScreen();
            game.gameScreen.setSwitch_i(8);}});
        button9.addCaptureListener(new ChangeListener() {@Override public void changed(ChangeEvent event, Actor actor) {
            game.setGameScreen();
            game.gameScreen.setSwitch_i(9);}});




        exit = new TextButton("Выход",skin.textButtonStyle_exit);


        //Setsize button

        exit.setSize(game.width*MainMenuScreen.const_button_width,game.height*MainMenuScreen.const_button_height);

        //setPosition button

        exit.setPosition(game.width - exit.getWidth(),0);

        exit.addCaptureListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                dispose();
                Gdx.app.exit();
            }
        });


        // добавление объектов на сцеену

        stage.addActor(exit);


        stage.addActor(button);
        stage.addActor(button1);
        stage.addActor(button2);
        stage.addActor(button3);
        stage.addActor(button4);

        stage.addActor(button5);
        stage.addActor(button6);
        stage.addActor(button7);
        stage.addActor(button8);
        stage.addActor(button9);



    }

    @Override
    public void render(float delta) {
        stage.act(delta);
        stage.draw();
        camera.update();

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
        Gdx.input.setInputProcessor(null);
    }

    @Override
    public void dispose() {

    }
}
