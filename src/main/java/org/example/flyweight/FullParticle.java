package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

/*
    color ve sprite özellikleri sürekli aynı değişmiyor. Diğer özellikler duruma göre değişmekte.

 */
public class FullParticle {

    private String cords;
    private String vector;
    private String speed;
    private final String color ="black";
    private final String sprite ="bullet";
    private int sumSize = 0;
    private Map<String,Integer> fullParticle = new HashMap<>();

    public FullParticle() {
        fullParticle.put("cords",8);
        fullParticle.put("vector",16);
        fullParticle.put("speed",4);
        fullParticle.put("color",4);
        fullParticle.put("sprite",20000);
    }

    public int returnObjectSize(){
        fullParticle.values().forEach(value -> sumSize += value);
          return  sumSize;
    }
}
