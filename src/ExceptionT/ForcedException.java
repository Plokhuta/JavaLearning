package ExceptionT;


import ExceptionT.MyException;
import java.util.Scanner;

public class ForcedException {
    public static void main(String... args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        int sc = Integer.parseInt(scanner.nextLine());

        if(sc !=0){
            throw new MyException();
        }

    }


}
