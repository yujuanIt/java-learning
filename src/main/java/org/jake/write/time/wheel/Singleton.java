package org.jake.write.time.wheel;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
