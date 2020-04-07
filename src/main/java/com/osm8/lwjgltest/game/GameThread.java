package com.osm8.lwjgltest.game;

import com.osm8.lwjgltest.game.input.Input;
import org.lwjgl.glfw.GLFWVidMode;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.opengl.GL11.*;


public class GameThread implements Runnable{
    private int windowHeight;
    private int windowWidth;
    private String windowTitle;
    private long window;
    boolean running = false;

    public GameThread(int windowHeight, int windowWidth, String windowTitle) {
        this.windowHeight = windowHeight;
        this.windowWidth = windowWidth;
        this.windowTitle = windowTitle;
    }

    public void run() {
        running = true;
        initRender();
        while (running){
            render();
            update();

            if(glfwWindowShouldClose(window)){
                running = false;
            }

        }
    }
    private void initRender(){
        if(!glfwInit()) {
            return;
        }
        glfwWindowHint(GLFW_RESIZABLE, GL_TRUE);
        window = glfwCreateWindow(windowWidth, windowHeight, windowTitle, NULL, NULL);

        if (window == 0) {
            return;
        }

        GLFWVidMode videoMode = glfwGetVideoMode(glfwGetPrimaryMonitor());
        glfwSetWindowPos(window, (videoMode.width()-windowWidth)/2, (videoMode.height() - windowHeight)/2);
        glfwMakeContextCurrent(window);
        glfwShowWindow(window);
        glfwSetKeyCallback(window, new Input());
    }

    private void update(){
        glfwPollEvents();
        if(Input.keys[GLFW_KEY_SPACE]){
            System.out.println("flap!");
        }
    }
    private void render(){
        glfwSwapBuffers(window);
    }
}
