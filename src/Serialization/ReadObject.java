package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
  public static void main(String[] args) {


    try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/Serialization/people.bin"))){
      Person person = (Person) objectInputStream.readObject();
      Person person1 = (Person) objectInputStream.readObject();
      Person[] objectListPiople = (Person[]) objectInputStream.readObject();

      System.out.println(person.toString());
      System.out.println(person1.toString());
      System.out.println(Arrays.toString(objectListPiople));

    } catch (java.io.IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
