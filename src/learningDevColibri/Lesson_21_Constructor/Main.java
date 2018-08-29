package learningDevColibri.Lesson_21_Constructor;

class Main {

    private static Cat cat;
    private static People people;

    public static void main(String[] args){

        cat = new Cat(2,"Dana","Персицький");

        people = new People("Dima","Plokhyta",22, cat);

        System.out.println(people);
        cat.say();
        people.getCat().say();

        people.setCat(null);

        System.out.println(people);
        cat.say();

    }
}
