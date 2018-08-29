package OOP;

public class Test_Encapsulation {
    public static void main(String []args){
        Car car = new Car();
        System.out.println(car.getCar);

    }

}

class Car{
    private String number = "5604";
    private String marck = "cheri";

    String getCar = "number - " + number + "\nmarck - " + marck;

}
