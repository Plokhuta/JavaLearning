public class Constructor_overload_this {


    public static void main(String[] args){

        Humen man = new Humen("Andriy", 21);
        Humen woman = new Humen("Alisa", 22);
        Humen test = new Humen();
    }
}

class Humen{
    private String name;
    private int age;

    Humen(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + this.name + "  age: " + this.age);
    }
    //перегрузка метода
    Humen()
    {
        System.out.println("пустий конструктор");
    }
}


