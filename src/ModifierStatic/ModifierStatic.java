package ModifierStatic;

public class ModifierStatic {
    public static void main(String... args){
        System.out.println(Person.age);

        Person.get();
        Person.get();
        Person.get();
        Person.get();

        System.out.println(Person.age);

        Person.age += 10;

        System.out.println(Person.age);
    }
}
