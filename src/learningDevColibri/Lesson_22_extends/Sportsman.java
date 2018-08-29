package learningDevColibri.Lesson_22_extends;

public class Sportsman extends People{

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


}
