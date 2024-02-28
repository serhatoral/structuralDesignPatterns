package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MovingParticle {
    private CoreParticle coreParticle;
    private String cords;
    private String vector;
    private String speed;
    private int sumSize = 0;
    private Map<String,Integer> movingParticle = new HashMap<>();

    public MovingParticle(CoreParticle coreParticle) {
        movingParticle.put("cords",8);
        movingParticle.put("vector",16);
        movingParticle.put("speed",4);
        movingParticle.put("coreParticle",4);
    }

    public int returnObjectSize(){
        movingParticle.values().forEach(value -> sumSize += value);
        return  sumSize;
    }
}
