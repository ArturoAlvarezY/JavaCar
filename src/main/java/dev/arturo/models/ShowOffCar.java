package dev.arturo.models;

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
}
