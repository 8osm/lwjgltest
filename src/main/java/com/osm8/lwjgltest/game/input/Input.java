package com.osm8.lwjgltest.game.input;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWKeyCallback;

public class Input extends GLFWKeyCallback {

    public static boolean[] keys = new boolean[65536];
    public void invoke(long l, int i, int i1, int i2, int i3) {
        keys[i] = i2 != org.lwjgl.glfw.GLFW.GLFW_RELEASE;
    }

    public String getSignature() {
        return null;
    }

    public void callback(long args) {
        
    }

    public void close() {

    }
}
