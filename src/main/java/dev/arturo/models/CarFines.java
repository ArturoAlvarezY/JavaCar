package dev.arturo.models;



public class CarFines {

    public Integer isItLegal (CarAtributes carAtributes) {
        Integer penal = 0;

        if (carAtributes.getSpeed() > 130) {
            penal += 1;
        } 
        return penal;
    }

    public boolean hasPenals(CarAtributes carAtributes){
        if (isItLegal(carAtributes) > 0) {
            return true;
        }
        return false;
    }

        public static void main(String[] args) {
        CarAtributes carAtributes = new CarAtributes(null, null, null, null, null, null, null, 131, null, 131, null);

        CarFines carFines = new CarFines();

        System.out.println(carFines.isItLegal(carAtributes));

        System.out.println(carFines.hasPenals(carAtributes));
        }
}
