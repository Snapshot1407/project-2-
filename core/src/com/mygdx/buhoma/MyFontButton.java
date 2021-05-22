package com.mygdx.buhoma;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class MyFontButton {

    TextButton.TextButtonStyle textButtonStyle_play,textButtonStyle_exit, textButtonStyle_level1, textButtonStyle_level2;
    BitmapFont font;
    private static final String FONT_CHARACTERS = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789][_!$%#@|\\/?-+=()*&.;,{}\"´`'<>";

    MyFontButton(){
        Skin skin = new Skin();
        TextureAtlas buttonAtlas = new TextureAtlas(Gdx.files.internal("buttons/image_play.pack"));
        skin.addRegions(buttonAtlas);
        textButtonStyle_play = new TextButton.TextButtonStyle();
        textButtonStyle_exit = new TextButton.TextButtonStyle();
        textButtonStyle_level1 = new TextButton.TextButtonStyle();
        textButtonStyle_level2 = new TextButton.TextButtonStyle();

        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("buttons/20451.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter param = new FreeTypeFontGenerator.FreeTypeFontParameter();
        param.size = Gdx.graphics.getHeight() / 12; // Размер шрифта. Я сделал его исходя из размеров экрана. Правда коряво, но вы сами можете поиграться, как вам угодно.
        param.characters = FONT_CHARACTERS; // Наши символы
        font = generator.generateFont(param); // Генерируем шрифт
        font.setColor(Color.RED);
        param.size = Gdx.graphics.getHeight() / 20;
        generator.dispose();
        textButtonStyle_play.font = font;
        textButtonStyle_exit.font = font;
        textButtonStyle_level1.font = font;
        textButtonStyle_level2.font = font;


        textButtonStyle_play.up = skin.getDrawable("button-up");
        textButtonStyle_play.down = skin.getDrawable("button-down");
        textButtonStyle_play.checked = skin.getDrawable("button-up");

        Skin skin1 = new Skin();
        TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("buttons/image_exit.pack"));
        skin1.addRegions(atlas);

        textButtonStyle_exit.up = skin1.getDrawable("button-up");
        textButtonStyle_exit.down = skin1.getDrawable("button-down");
        textButtonStyle_exit.checked = skin1.getDrawable("button-up");

        Skin skin2 = new Skin();
        TextureAtlas atlas1 = new TextureAtlas(Gdx.files.internal("buttons/image_level1.pack"));
        skin2.addRegions(atlas1);

        textButtonStyle_level1.up = skin2.getDrawable("button-up");
        textButtonStyle_level1.down = skin2.getDrawable("button-down");
        textButtonStyle_level1.checked = skin2.getDrawable("button-up");


        Skin skin3 = new Skin();
        TextureAtlas atlas2 = new TextureAtlas(Gdx.files.internal("buttons/image_level2.pack"));
        skin3.addRegions(atlas2);

        textButtonStyle_level2.up = skin3.getDrawable("button-up");
        textButtonStyle_level2.down = skin3.getDrawable("button-down");
        textButtonStyle_level2.checked = skin3.getDrawable("button-up");



    }
    TextButton.TextButtonStyle getTextButtonStyle_play(){
        return textButtonStyle_play;
    }
    TextButton.TextButtonStyle getTextButtonStyle_exit(){
        return textButtonStyle_exit;
    }
    TextButton.TextButtonStyle getTextButtonStyle_level1(){return textButtonStyle_level1;}
    TextButton.TextButtonStyle getTextButtonStyle_level2(){return textButtonStyle_level2;}

    BitmapFont getFont(){
        return font;
    }

}
