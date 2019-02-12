package learningWithAlishev;

public class AnonymousClasses {
  public static void main(String[] args) {

    AbleToEat ableToEat = new AbleToEat() {
      @Override public void eat() {
        System.out.println("Eat!");
      }
    };
    ableToEat.eat();
  }
}

interface AbleToEat{
  void eat();
}