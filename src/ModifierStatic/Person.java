package ModifierStatic;

public class Person {
    static int age = 22;

    static int get(){
        return age++;
    }
}
