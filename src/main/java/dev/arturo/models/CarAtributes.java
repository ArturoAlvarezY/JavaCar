package dev.arturo.models;

import java.util.List;

public class CarAtributes {
   private String branch;
   private Integer model;
   private Double motor;
   private List<String> fuel;
   private List<String> type;
   private Integer doors;
   private Integer sits;
   private Double speed;
   private List<String> color;
   private Double actualSpeed;
    
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
    public List<String> getFuel() {
        return fuel;
    }
    public void setFuel(List<String> fuel) {
        this.fuel = fuel;
    }
    public List<String> getType() {
        return type;
    }
    public void setType(List<String> type) {
        this.type = type;
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
    public Double getSpeed() {
        return speed;
    }
    public void setSpeed(Double speed) {
        this.speed = speed;
    }
    public List<String> getColor() {
        return color;
    }
    public void setColor(List<String> color) {
        this.color = color;
    }
    public Double getActualSpeed() {
        return actualSpeed;
    }
    public void setActualSpeed(Double actualSpeed) {
        this.actualSpeed = actualSpeed;
    }
    public CarAtributes(String branch, Integer model, Double motor, List<String> fuel, List<String> type, Integer doors,
            Integer sits, Double speed, List<String> color, Double actualSpeed) {
        this.branch = branch;
        this.model = model;
        this.motor = motor;
        this.fuel = fuel;
        this.type = type;
        this.doors = doors;
        this.sits = sits;
        this.speed = speed;
        this.color = color;
        this.actualSpeed = actualSpeed;
    }
}
