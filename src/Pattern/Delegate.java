package Pattern;

public class Delegate {
    public static void main(String[] args) {
        Painter painter = new Painter();

        painter.setGraphics(new Circle());
        painter.draw();

        painter.setGraphics(new Square());
        painter.draw();

        painter.setGraphics(new Triangle());
        painter.draw();
    }
}

interface Graphics{
    public void draw();
}

class Painter{
    Graphics graphics;

    void setGraphics(Graphics g){
        graphics = g;
    }
    void draw() {
        graphics.draw();
    }

}

class Triangle implements Graphics{

    @Override
    public void draw() {
        System.out.println("Намалював трикутник");
    }
}

class Square implements Graphics{

    @Override
    public void draw() {
        System.out.println("Намалював квадрат");
    }
}

class Circle implements Graphics{

    @Override
    public void draw() {
        System.out.println("Намалював коло");
    }
}

