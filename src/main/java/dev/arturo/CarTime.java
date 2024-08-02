package dev.arturo;

import dev.arturo.models.CarAtributes;

public class CarTime {

    CarAtributes carAtributes;


    public Integer arrivalTime (CarAtributes carAtributes, Double km) {

        carAtributes.getActualSpeed();


        Integer velocity = carAtributes.getActualSpeed();
        Integer answer = (int) (km/velocity);

        return answer;
    }       


    }
