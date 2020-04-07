package com.osm8.lwjgltest.game;

import com.osm8.lwjgltest.game.Game;

public class GameInstance {

    Game game;

    public Game getGame(){
        if (game == null){
            game = new Game();
            return game;
        }
        return game;
    }
}
