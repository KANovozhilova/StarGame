package com.geekbrains.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import com.geekbrains.base.Sprite;
import com.geekbrains.math.Rect;

public class GameOver extends Sprite {

    public GameOver(TextureAtlas atlas) {
        super(atlas.findRegion("message_game_over"));
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(0.08f);
        setBottom(0.15f);
    }
}