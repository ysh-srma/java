abstract class poly {

    abstract void turnOn();
    abstract void turnOff();
}
class tvremote extends poly {
    @Override
    void turnOn() {
        System.out.println("TV is turned on");
    }
    @Override
    void turnOff() {
        System.out.println("TV is turned off");
    }
 }
 public class tv {
    public static void main(String[] args) {
        poly p = new tvremote();
        p.turnOn();
        p.turnOff();
    }
}