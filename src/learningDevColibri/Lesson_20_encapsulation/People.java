package learningDevColibri.Lesson_20_encapsulation;

class People {

    private String name;
    private String lastName;
    private int age;
    private Cat cat;

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

    public String getLastName() {
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

    @Override
    public String toString(){
        return  "Piople: " + name + ", Прізвище: " + lastName + " "+ age +"рік, Є кіт: " + cat;
    }
}
