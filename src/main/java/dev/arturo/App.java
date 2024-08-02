package dev.arturo;

import dev.arturo.models.CarAcelerate;
import dev.arturo.models.CarAtributes;
import dev.arturo.models.enumatributes.CarColors;
import dev.arturo.models.enumatributes.CarType;
import dev.arturo.models.enumatributes.Foul;

public final class App {
    private App() {
    }

   
    public static void main(String[] args) {
        CarAtributes carAtributes = new CarAtributes("Toyota", 2025, 5.0, Foul.gasoline, CarType.city, 5, 5, 140, CarColors.purple, 0);

        CarAcelerate carAcelerate = new CarAcelerate();

        carAtributes.setActualSpeed(100);

        System.out.println(carAtributes.getActualSpeed() + "km/h");

        carAtributes.setActualSpeed(120);

        System.out.println(carAtributes.getActualSpeed() + "km/h");

        carAtributes.setActualSpeed(70);

        System.out.println(carAtributes.getActualSpeed() + "km/h");


        System.out.println(carAcelerate.breakMethod(carAtributes));
    }
}
