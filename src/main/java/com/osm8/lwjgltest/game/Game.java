package com.osm8.lwjgltest.game;

public class Game{
    private Thread gameThread;
    private boolean running;
    private int windowHeight = 720;
    private int windowWidth = 1280;
    private String windowTitle = "Game";

    Game(){
        this.gameThread = new Thread(new GameThread(windowHeight, windowWidth, windowTitle), "GameThread");
    }

    public void start() {
        if(!running){
            gameThread.start();
            running = true;
        }
    }
    public void stop(){
        if (running){
            gameThread.interrupt();
            running = false;
        }
    }
}
