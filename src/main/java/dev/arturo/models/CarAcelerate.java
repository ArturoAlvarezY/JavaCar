package dev.arturo.models;

public class CarAcelerate {

    public Integer acelerate (CarAtributes carAtributes, Integer newSpeed) {
        int speedAceleration = carAtributes.getActualSpeed() + newSpeed;

        carAtributes.setActualSpeed(speedAceleration);
        return carAtributes.getActualSpeed();
    }

    public String evaluateSpeed(CarAtributes carAtributes){
        if (carAtributes.getActualSpeed() > 130) {
        return "Slow your speed Barry Allen!";            
        } 
        else if(carAtributes.getActualSpeed() < 0){
            return "You cant set a velocity minor than cero";
        }
        return "You are on rule!";
    }

    public Integer breakMethod (CarAtributes carAtributes) {
        carAtributes.setActualSpeed(0);

        return carAtributes.getActualSpeed();
    }
}
