package learningDevColibri.Lesson_25_Interface;

import learningDevColibri.Lesson_25_Interface.People.People;

public class DriverBus implements Transport, Driver{

    private People people;
    private String category;
    private int speed = 60;

    @Override
    public void setCategory(String c) {
        this.category = c;
        people = new People("Bob", "Tomson" , 45, null);
    }

    @Override
    public void go() {
        if(people != null){
            System.out.println("GO!!!");
        } else {
            System.out.println("STOP!!!");
        }
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
