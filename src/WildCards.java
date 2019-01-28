import java.util.ArrayList;
import java.util.List;

public class WildCards {
  public static void main(String[] args) {

    List<Animal> listOfAnimals = new ArrayList<>();
    listOfAnimals.add(new Animal(1));
    listOfAnimals.add(new Animal(2));

    List<Dog> dogList = new ArrayList<>();
    dogList.add(new Dog());
    dogList.add(new Dog());


    List<Cat> catList = new ArrayList<>();
    catList.add(new Cat());
    catList.add(new Cat());

    test(listOfAnimals);
    test(dogList);
    test(catList);

  }
                          /////// Важливо!!!!!!!!
  private static void test(List<? extends Animal> list){
      for (Animal animal: list){
        animal.eat();
    }
  }
}

class Animal{
  private int id;

  Animal(){

  }

  Animal(int id) {
    this.id = id;
  }

  public void eat(){
    System.out.println("Animal is eating!!!");
  }

  private int getId() {
    return id;
  }

  @Override public String toString() {
    return getId() + "";
  }
}

class Dog extends Animal{
  public void eat(){
    System.out.println("Dog is eating!!!");
  }
}

class Cat extends Animal{
  public void eat(){
    System.out.println("Cat is eating!!!");
  }
}