package OOP;

public class Encapsulation {
    public static void main(String[] args){
        Person person = new Person();
        System.out.println(person.getName());
    }
}

class Person{
    private String name = "Dima";
    private int age = 21;

    String getName() {
        return name + " " + age;
    }
}