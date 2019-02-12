package Pattern.TestPatterns;

class Facade {
  public static void main(String[] args) {
    RobotTeapot robotTeapot = new RobotTeapot();

    robotTeapot.tea();
  }
}

class RobotTeapot{
  Water water = new Water();
  Power power = new Power();
  Temperature temperature = new Temperature();

  void tea(){
    water.setWater(true);
    power.setPower(true);
    temperature.setTemperature(100);
  }
}

class Water{
  void setWater(boolean Water){
    if (Water) {
      System.out.println("Є вода");
    } else {
      System.out.println("Нема води");
    }
  }
}
class Power{
    void setPower(boolean power){
    if (power) {
      System.out.println("Живлення увімнено");
    } else {
      System.out.println("Живлення вимкнено!!!");
    }
  }
}
class Temperature{
  void setTemperature(int temperature){
    if (temperature == 100 ) {
      System.out.println("Готово");
    } else {
      System.out.println("Слабо");
    }
  }
}