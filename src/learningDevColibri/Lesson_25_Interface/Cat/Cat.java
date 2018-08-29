package learningDevColibri.Lesson_25_Interface.Cat;

public class Cat extends Animals {
    private int age;
    private String poroda;
    private String name;

    public Cat(int age, String poroda, String name) {
        this.age = age;
        this.poroda = poroda;
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getPoroda() {
        return poroda;
    }

    void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("I eat!");
    }

    @Override
    void say(){
        System.out.println("Мяу");
    }

    @Override
    public String toString(){
        return "Ім'я: " + name + ", Порода: " + poroda + ", Вік: " + age;
    }

}
