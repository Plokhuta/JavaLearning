package OOP;

public class Polymorphism2 {
  public static void main(String[] args) {
      Animal animal = new Animal();
      Dog dog = new Dog();
      Cat cat = new Cat();

      test(animal);
      test(dog);
      test(cat);

  }

  private static void test(Animal animal){
    animal.eat();
  }
}

class Animal{
  void eat(){
    System.out.println("Animal is eating!!!");
  }
}

class Dog extends Animal{
  @Override
  void eat() {
    System.out.println("Dog is eating!!!");
  }
}

class Cat extends Animal{

}
