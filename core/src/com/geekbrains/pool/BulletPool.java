package com.geekbrains.pool;

import com.geekbrains.base.SpritesPool;
import com.geekbrains.sprite.Bullet;

public class BulletPool extends SpritesPool<Bullet> {
    @Override
    protected Bullet newObject() {
        return new Bullet();
    }
}
