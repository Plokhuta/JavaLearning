package learningDevColibri.Lesson_23_Polymorphism;

public class Sportsman extends People {

    private String typeSport;

    public String getTypeSport() {
        return typeSport;
    }

    public void setTypeSport(String typeSport) {
        this.typeSport = typeSport;
    }



    Sportsman(String name, String lastName, int age, Cat cat) {
        super(name, lastName, age, cat);


    }

    @Override
    public void say() {
        System.out.println("Hi Sportsman!");
    }
}
