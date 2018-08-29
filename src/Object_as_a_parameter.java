class Test{
    int a,b;

    Test(int i, int j){
        a = i;
        b = j;
    }

    boolean equals(Test o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
public class Object_as_a_parameter {
    public static void main (String[] args){
        Test ob1 = new Test(120, 150);
        Test ob2 = new Test(148, 169);
        Test ob3 = new Test(-1,-1);

        System.out.println("ob1 == ob2  " + ob1.equals(ob2));
        System.out.println("ob1 == ob3  " + ob1.equals(ob3));
        System.out.println("ob1 == ob2  " + ob1.equals(ob1));

    }
}
