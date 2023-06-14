public class Adapter extends IndustrialElectricMotor {
    Phone phone;
    Adapter(Phone phone){
        this.phone = phone;
    }
    public void powerSupply() {
        phone.powerSupply();
    }
    public void motorOn() {
        phone.phoneOn();
    }
    public void motorOff() {
        phone.phoneOff();
    }
}
