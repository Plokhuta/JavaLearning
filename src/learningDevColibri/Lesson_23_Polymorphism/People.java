package learningDevColibri.Lesson_23_Polymorphism;

public class People {

    private String name;
    private String lastName;
    private int age;
    private Cat cat;

    People(String name, String lastName, int age, Cat cat) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.cat = cat;
    }

    Cat getCat() {
        return cat;
    }

    void setCat(Cat cat) {
        this.cat = cat;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    public void say(){
        System.out.println("Hi!");
    }

    @Override
    public String toString(){
        return  "Piople: " + name + ", Прізвище: " + lastName + " "+ age +" рoків, Є кіт: " + cat;
    }
}
