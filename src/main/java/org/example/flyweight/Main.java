package org.example.flyweight;

public class Main {

    public static void main(String[] args) {

        System.out.println("******** Size with FullParticle*********");
        int fullParticleCoast=0;

        for(int i =0; i<100;i++){
            FullParticle fullParticle = new FullParticle();
            fullParticleCoast += fullParticle.returnObjectSize();
        }
        System.out.println("FullParticle coast for 100 object: "+fullParticleCoast+"B -> "+fullParticleCoast/1000+"KB");

        System.out.println();
        System.out.println();
        System.out.println("******** Size with Flyweight design pattern*********");

        CoreParticle coreParticle = new CoreParticle();

        int movingParticleCoast = 0;
        for(int i =0; i<100;i++){
            MovingParticle movingParticle = new MovingParticle(coreParticle);
            movingParticleCoast += movingParticle.returnObjectSize();
        }

        System.out.println("movingParticle coast for 100 object: "+movingParticleCoast+ "B");
    }
}
