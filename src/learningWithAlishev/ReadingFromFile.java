package learningWithAlishev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
  public static void main(String[] args) throws FileNotFoundException {
      //String separator = File.separator;
      //String path = "C:" + separator + "Users" + separator + "Dimap" + separator + "Desktop" + separator + "learningWithAlishev/test";

      File file = new File("learningWithAlishev/test");

    Scanner scanner = new Scanner(file);

    String line = scanner.nextLine();

    String[] nubersStreing = line.split(" ");

    int[] nubbersInt = new int[3];

    int count = 0;

    for (String numbers : nubersStreing){
      nubbersInt[count++] = Integer.valueOf(numbers);
    }

    System.out.println(Arrays.toString(nubbersInt));
  }
}

