package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<String>();

        listStrings.add("one");
        listStrings.add("two");

        for(String item : listStrings){
            System.out.println(item);
        }

        listStrings.remove(0);

        try {
            System.out.println(listStrings.get(1));
        }catch (IndexOutOfBoundsException a){
            System.err.println("Не існуючий елемент в списку!");
        }

        System.out.println(listStrings.get(0));

        Iterator<String> iterator = listStrings.iterator();
        System.out.println("\nIterator: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
