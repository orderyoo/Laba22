public class IndustrialElectricMotor implements Motor {
    public void powerSupply() {
        System.out.println("Напряжение 380 вольт");
    }
    public void motorOn() {
        System.out.println("Мотор включен");
    }
    public void motorOff() {
        System.out.println("Мотор выключен");
    }
}
interface Motor{
    public void powerSupply();
    public void motorOn();
    public void motorOff();
}
