public class iPhone implements Phone {
    public void powerSupply() {
        System.out.println("Напряжение 220 вольт");
    }
    public void phoneOn() {
        System.out.println("Телефон включен");
    }
    public void phoneOff() {
        System.out.println("Телефон выключен");
    }
}
interface Phone{
    public void powerSupply();
    public void phoneOn();
    public void phoneOff();
}
