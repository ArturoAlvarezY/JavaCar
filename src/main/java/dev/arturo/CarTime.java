package dev.arturo;

public class CarTime {

    CarAtributes carAtributes = new CarAtributes(null, null, null, null, null, null, null, 100, null, 0);


    public Integer arrivalTime (CarAtributes carAtributes, Double km) {

        carAtributes.getActualSpeed();


        Integer velocity = carAtributes.getActualSpeed();
        Integer answer = (int) (km/velocity);

        return answer;
    }       

 

     

public static void main(String[] args) {
    System.out.println();

    CarAtributes carAtributes = new CarAtributes(null, null, null, null, null, null, null, null, null, null);

    carAtributes.setActualSpeed(150);

    CarTime carTime = new CarTime();


    System.out.println(carTime.arrivalTime(carAtributes, 150.0));
    

}
    }
