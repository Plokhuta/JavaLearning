package Pattern;

public class AbstractFactory {
    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCountryCode("UA");
        //DeviceFactory factory = getFactoryByCountryCode("EN");
        Mouse m = factory.getMouse();
        Keyboard k = factory.getKeyboard();
        TouchPad t = factory.getTouchPad();

        m.click();
        m.doubleClick();
        m.scroll(6);
        k.printText();
        k.printCapsText();
        t.track(5,10);
    }
    private static DeviceFactory getFactoryByCountryCode(String lang){
        switch (lang){
            case "UA":
                return new UA_DeviceFactory();
            case "EN":
                return new EN_DeviceFactory();
                default:
                    throw new RuntimeException("Unsupported Country Code:" + lang);
        }
    }
}

interface Mouse{
    void click();
    void doubleClick();
    void scroll(int direction);
}
interface Keyboard{
    void printText();
    void printCapsText();
}
interface TouchPad{
    void track(int deltaX, int deltaY);
}

interface DeviceFactory{
    Mouse getMouse();
    Keyboard getKeyboard();
    TouchPad getTouchPad();
}

class UA_Mouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Клац)");
    }

    @Override
    public void doubleClick() {
        System.out.println("Клац Клац)");
    }

    @Override
    public void scroll(int direction) {
        if(direction > 0){
            System.out.println("Піднімаємо до гори");
        }else if(direction < 0){
            System.out.println("Cпускаємося до низу");
        }else System.out.println("Нікуди не рухаємося");
    }
}
class UA_Keyboard implements Keyboard{
    @Override
    public void printText() {
        System.out.println("друкуємо текст");
    }

    @Override
    public void printCapsText() {
        System.out.println("ДРУКУЄМО ТЕКСТ");
    }
}
class UA_TouchPad implements TouchPad{
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int)Math.sqrt(Math.pow(deltaX, 2)+Math.pow(deltaY, 2));
        System.out.println(s);
    }
}

class EN_Mouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Click)");
    }

    @Override
    public void doubleClick() {
        System.out.println("Click Click)");
    }

    @Override
    public void scroll(int direction) {
        if(direction > 0){
            System.out.println("Climb to the mountain");
        }else if(direction < 0){
            System.out.println("descends to the bottom");
        }else System.out.println("Do not move anywhere");
    }
}
class EN_Keyboard implements Keyboard{
    @Override
    public void printText() {
        System.out.println("type text");
    }

    @Override
    public void printCapsText() {
        System.out.println("TYPE TEXT");
    }
}
class EN_TouchPad implements TouchPad{
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int)Math.sqrt(Math.pow(deltaX, 2)+Math.pow(deltaY, 2));
        System.out.println(s);
    }
}

class UA_DeviceFactory implements DeviceFactory{
    @Override
    public Mouse getMouse() {
        return new UA_Mouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new UA_Keyboard();
    }

    @Override
    public TouchPad getTouchPad() {
        return new UA_TouchPad();
    }
}
class EN_DeviceFactory implements DeviceFactory{
    @Override
    public Mouse getMouse() {
        return new EN_Mouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EN_Keyboard();
    }

    @Override
    public TouchPad getTouchPad() {
        return new EN_TouchPad();
    }
}