class Box{
    double width;
    double height;
    double depth;

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;

    }

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return depth*height*width;
    }
}

public class Constructor {
    public static void main(String[] args)
    {
        Box box = new Box();
        Box box2 = new Box(14, 11,18);
        Box box3 = new Box(10);
        Box box4 = new Box(box2);

        System.out.println(box.volume());
        System.out.println(box2.volume());
        System.out.println(box3.volume());
        System.out.println(box4.volume());
    }
}
