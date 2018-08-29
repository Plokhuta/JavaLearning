package learningDevColibri.Lesson_22_extends;

class Main {

    public static void main(String[] args){

        Cat cat = new Cat(2, "Dana", "Персицький");

        People people = new People("Dima", "Plokhyta", 22, cat);

        System.out.println(people);
        cat.say();
        people.getCat().say();


        Cat cat2 = new Cat(4,"Dan4","Персицький2");
        Sportsman sportsman = new Sportsman("Dima", "Takuy", 25, cat2);
        sportsman.setTypeSport("Tenis");
        System.out.println(sportsman);

    }
}
