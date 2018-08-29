package learningDevColibri.Lesson_23_Polymorphism;

class Cat {
    private int age;
    private String poroda;
    private String name;

    Cat(int age, String poroda, String name) {
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

    void say(){
        System.out.println("Мяу");
    }

    @Override
    public String toString(){
        return "Ім'я: " + name + ", Порода: " + poroda + ", Вік: " + age;
    }

}
