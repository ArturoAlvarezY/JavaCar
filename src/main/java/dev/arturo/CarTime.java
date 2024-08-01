package dev.arturo;

public class CarTime {

    CarAtributes carAtributes = new CarAtributes(null, null, null, null, null, null, null, 100, null, 0);


    public Integer arrivalTime (Integer integer, Double km) {
        Integer velocity = integer.acelerate(carAtributes, 25);

        Integer answer = (int) (km/velocity);

        return answer;
    }       

    public static void main(String[] args) {

        CarAtributes carAtributes;

        CarTime carTime = new CarTime();

        CarAcelerate carAcelerate = new CarAcelerate();

        

        carTime.arrivalTime(carAcelerate.acelerate(, 30.0), 30.0);
    }

    }
