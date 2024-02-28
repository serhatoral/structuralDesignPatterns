package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public final class CoreParticle {

    private final String color ="black";
    private final String sprite ="bullet";
    private int sumSize = 0;
    private Map<String,Integer> coreParticle = new HashMap<>();;

    public CoreParticle() {
        coreParticle.put("color",4);
        coreParticle.put("sprite",20000);
    }


    public int returnObjectSize(){
        coreParticle.values().forEach(value -> sumSize += value);
        return  sumSize;
    }
}
