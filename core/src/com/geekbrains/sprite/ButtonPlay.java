package com.geekbrains.sprite;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.geekbrains.base.ScaledButton;
import com.geekbrains.math.Rect;
import com.geekbrains.screen.GameScreen;

public class ButtonPlay extends ScaledButton {
    private final Game game;

    private static final float MARGIN = 0.05f;

    public ButtonPlay(TextureAtlas atlas, Game game) {
        super(atlas.findRegion("btPlay"));
        this.game = game;
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(0.2f);
        setBottom(worldBounds.getBottom() + MARGIN);
        setRight(worldBounds.getRight() - MARGIN);
    }

    @Override
    public void action() {
        game.setScreen(new GameScreen());
    }
}