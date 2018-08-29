package learningDevColibri.Lesson_25_Interface.People;

import learningDevColibri.Lesson_25_Interface.Cat.*;
import learningDevColibri.Lesson_25_Interface.People.People;

public class Sportsman extends People {

    private String typeSport;

    public String getTypeSport() {
        return typeSport;
    }

    public void setTypeSport(String typeSport) {
        this.typeSport = typeSport;
    }



    public Sportsman(String name, String lastName, int age, Cat cat) {
        super(name, lastName, age, cat);


    }

    @Override
    public void say() {
        System.out.println("Hi Sportsman!");
    }
}
