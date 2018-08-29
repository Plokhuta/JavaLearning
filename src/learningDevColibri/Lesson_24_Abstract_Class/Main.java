package learningDevColibri.Lesson_24_Abstract_Class;

class Main {

    public static void main(String[] args){

        Cat cat = new Cat(2, "Dana", "Персицький");

        People people = new People("Dima", "Plokhyta", 22, cat);

        System.out.println(people);

        Cat cat2 = new Cat(4,"Dan4","Персицький2");
        Sportsman sportsman = new Sportsman("Dima", "Takuy", 25, cat2);
        sportsman.setTypeSport("Tenis");
        System.out.println(sportsman);

        people.say();
        sportsman.say();

    }
}
