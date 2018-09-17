package Pattern;

public class Facade {
    public static void main(String[] args) {
    PC pc = new PC();

    pc.save();

    }
}

class PC{
    Power power = new Power();
    CDRom cdRom = new CDRom();
    HDD hdd = new HDD();

    void save(){
        power.on();
        cdRom.load();
        hdd.saveData(cdRom);
    }
}

class Power{
    void off(){
        System.out.println("Живлення вимкнено");
    }
    void on(){
        System.out.println("Живлення увімнено");
    }
}

class CDRom{
    private boolean data;

    public boolean hassData(){
        return data;
    }

    void load(){
        data = true;
    }

    void unload(){
        data = false;
    }
}

class HDD{
    CDRom cdRom = new CDRom();

    void saveData(CDRom cdRom){
        if(cdRom.hassData()){
            System.out.println("Данні збережені");
        }else {
            System.out.println("Вставте диск");
        }
    }
}
