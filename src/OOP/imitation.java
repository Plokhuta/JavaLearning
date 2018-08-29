package OOP;

public class imitation {
    public static void main(String[] args) {
    Fish fish = new Fish();
    fish.animal(" Koda ", 150, " gupi ");
    fish.animal("Fan", 200);
    fish.animal();
    }
}

class Alimal{
    int weight;
    String name;
    String species;
    public void animal(String name, int weight){

    }
}

class Fish extends Alimal{

    public void animal(String name, int weight, String species){
        super.weight = weight;
        super.name = name;
        super.species = species;
        System.out.println(species + name + weight);
    }

    public void animal(){
        System.out.println("Ви не ввели данні!");
    }
}


class Birds extends Alimal{

}

class Mammals extends Alimal{

}

class Insects extends Alimal{

}

class Reptiles extends Alimal{

}


