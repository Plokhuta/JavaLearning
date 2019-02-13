package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
  public static void main(String[] args) {
    Person person = new Person(1, "Mike");
    Person person1 = new Person(2, "Franky");
    Person person2 = new Person(3, "Mick");
    Person[] persomMass = new Person[]{new Person(1, "Mike"), new Person(2, "Mike2"), new Person(3, "Mike3")};


    try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/Serialization/people.bin"))){
      objectOutputStream.writeObject(person);
      objectOutputStream.writeObject(person1);
      objectOutputStream.writeObject(persomMass);

    } catch (java.io.IOException e) {
      e.printStackTrace();
    }
  }
}
