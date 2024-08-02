package dev.arturo.models;

import dev.arturo.models.enumatributes.CarColors;
import dev.arturo.models.enumatributes.CarType;
import dev.arturo.models.enumatributes.Foul;

public class ShowOffCar {

    public String brag(CarAtributes carAtributes){
        StringBuilder sb = new StringBuilder();
        sb.append("Car Brand: ").append(carAtributes.getBranch()).append("\n");
        sb.append("Model: ").append(carAtributes.getModel()).append("\n");
        sb.append("Motor: ").append(carAtributes.getMotor()).append("\n");
        sb.append("Foul kind: ").append(carAtributes.getFoul()).append("\n");
        sb.append("CarType: ").append(carAtributes.getCarType()).append("\n");
        sb.append("Doors: ").append(carAtributes.getDoors()).append("\n");
        sb.append("Sits: ").append(carAtributes.getSits()).append("\n");
        sb.append("Speed: ").append(carAtributes.getSpeed()).append("\n");
        sb.append("Color: ").append(carAtributes.getCarColors()).append("\n");
        sb.append("Actual speed: ").append(carAtributes.getActualSpeed()).append("\n");

        return sb.toString();
    }

    public static void main(String[] args) {
        CarAtributes carAtributes = new CarAtributes("Toyota", 2025, 5.0, Foul.gasoline, CarType.city, 9, 10, 220, CarColors.purple, 0);

        ShowOffCar showOffCar = new ShowOffCar();

        System.out.println(showOffCar.brag(carAtributes));

    }
}
