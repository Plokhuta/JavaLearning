package OOP;

public class Polymorphism {
    public static void main(String[] args){
        Hogwarts[] hogwarts = new Hogwarts[]{
                new Gryffindor(), new Hufflepuff(), new Ravenclaw(), new Slytherin()
        };

        for (Hogwarts i: hogwarts
             ) {i.getFaculty();
            
        }

    }
}

class Hogwarts{
    public void getFaculty() {

    }
}


class Gryffindor extends Hogwarts {
    public void getFaculty() {
        System.out.println("Gryffindo");
    }
}

class Hufflepuff extends Hogwarts {
    public void getFaculty() {
        System.out.println("Hufflepuff");
    }
}

class Ravenclaw extends Hogwarts {
    public void getFaculty() {
        System.out.println("Ravenclaw");
    }
}

class Slytherin extends Hogwarts {
    public void getFaculty() {
        System.out.println("Slytherin");
    }
}