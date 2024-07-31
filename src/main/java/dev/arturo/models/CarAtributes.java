package dev.arturo.models;

import dev.arturo.models.enumatributes.CarColors;
import dev.arturo.models.enumatributes.CarType;
import dev.arturo.models.enumatributes.Foul;

public class CarAtributes {
   private String branch;
   private Integer model;
   private Double motor;
   private Foul foul;
   private CarType carType;
   private Integer doors;
   private Integer sits;
   private Integer speed;
   private CarColors carColors;
   private Integer actualSpeed;
   


public CarAtributes(String branch, Integer model, Double motor, Foul foul, CarType carType, Integer doors, Integer sits,
        Integer speed, CarColors carColors, Integer actualSpeed) {
    this.branch = branch;
    this.model = model;
    this.motor = motor;
    this.foul = foul;
    this.carType = carType;
    this.doors = doors;
    this.sits = sits;
    this.speed = speed;
    this.carColors = carColors;
    this.actualSpeed = actualSpeed;
}
public String getBranch() {
    return branch;
}
public void setBranch(String branch) {
    this.branch = branch;
}
public Integer getModel() {
    return model;
}
public void setModel(Integer model) {
    this.model = model;
}
public Double getMotor() {
    return motor;
}
public void setMotor(Double motor) {
    this.motor = motor;
}
public Foul getFoul() {
    return foul;
}
public void setFoul(Foul foul) {
    this.foul = foul;
}
public CarType getCarType() {
    return carType;
}
public void setCarType(CarType carType) {
    this.carType = carType;
}
public Integer getDoors() {
    return doors;
}
public void setDoors(Integer doors) {
    this.doors = doors;
}
public Integer getSits() {
    return sits;
}
public void setSits(Integer sits) {
    this.sits = sits;
}
public Integer getSpeed() {
    return speed;
}
public void setSpeed(Integer speed) {
    this.speed = speed;
}
public CarColors getCarColors() {
    return carColors;
}
public void setCarColors(CarColors carColors) {
    this.carColors = carColors;
}
public Integer getActualSpeed() {
    return actualSpeed;
}
public void setActualSpeed(Integer actualSpeed) {
    this.actualSpeed = actualSpeed;
}
    
}
