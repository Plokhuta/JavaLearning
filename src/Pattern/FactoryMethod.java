package Pattern;

import java.util.Date;

public class FactoryMethod {
    public static void main(String[] args) {

        WatchMaker maker = new DigitalWatchMaker();
        //WatchMaker maker = getMakerByName("Digital");
        Watch watch = maker.CreateWatch();
        watch.showTime();

    }
    public static WatchMaker getMakerByName(String maker){
        if(maker.equals("Digital")){
            return new DigitalWatchMaker();
        }else if(maker.equals("Rome")){
            return new RomeWatchMaker();
        }
        throw new RuntimeException("Не відомий виробник!" + maker);
    }
}

interface Watch{
    void showTime();
}

class RomeWatch implements Watch{

    @Override
    public void showTime() {
        System.out.println("XV-XII");
    }
}
class DigitalWatch implements Watch{

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}

interface WatchMaker{
    Watch CreateWatch();
}
class DigitalWatchMaker implements WatchMaker{
    @Override
    public Watch CreateWatch() {
        return new DigitalWatch();
    }
}
class RomeWatchMaker implements WatchMaker{
    @Override
    public Watch CreateWatch() {
        return new RomeWatch();
    }
}
