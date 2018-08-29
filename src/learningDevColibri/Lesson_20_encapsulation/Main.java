package learningDevColibri.Lesson_20_encapsulation;

public class Main {

    private static Cat cat = new Cat();
    private static People people = new People();

    public static void main(String[] args){

        cat.setName("Dana");
        cat.setPoroda("Персицький");
        cat.setAge(2);

        people.setName("Dima");
        people.setLastName("Plokhyta");
        people.setAge(22);
        people.setCat(cat);

        System.out.println(people);
        cat.say();
        people.getCat().say();
    }
}
