package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        //Колекція Set тримає в собі тільки унікальні значення
        set.add("one");
        set.add("two");
        set.add("two");
        set.add("three");
        set.add("two");

        //отримати значення в колекції Set можна тільки перебором всіх елементів
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        //або
        for (String s : set){
            System.out.println(s);
        }


        set.add("two");
        set.add("two");
        set.add("two");
        set.add("two");
        System.out.println();
        //видалення значень в колекції Set не по індексу а по змісту
        set.remove("two");

        for (String s : set){
            System.out.println(s);
        }
    }
}
