package OOP.Interface;

public class main {
  public static void main(String[] args) {
    Animal animal = new Animal(10);
    Person person = new Person("Dima");

    show(animal);
    show(person);
  }

   public static void show(Info info){
    info.showInfo();
  }

}

interface Info{
  void showInfo();
}

class Animal implements Info{
  private int ID;
  Animal(int id){
    this.ID = id;
  }

  @Override
  public void showInfo() {
    System.out.println(this.ID);
  }
}

class Person implements Info{
  private String name;
  Person(String name){
    this.name = name;
  }
  @Override
  public void showInfo() {
    System.out.println(this.name);
  }

}