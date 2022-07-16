package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal animal1, Animal animal2) {
        int speed = 0;
        if (animal1.getSpeed() == animal2.getSpeed()){
        speed =  0;
        } else if (animal1.getSpeed() > animal2.getSpeed()) {
            speed = -1;
        } else if ( animal1.getSpeed() < animal2.getSpeed()) {
            return 1;
        }
        return speed;
    }
}
