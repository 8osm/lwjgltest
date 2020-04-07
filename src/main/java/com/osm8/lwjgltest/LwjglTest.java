package com.osm8.lwjgltest;

import com.osm8.lwjgltest.game.GameInstance;

public class LwjglTest {
    public static void main(String[] args) {
        GameInstance gameInstance = new GameInstance();
        gameInstance.getGame().start();

    }
}
