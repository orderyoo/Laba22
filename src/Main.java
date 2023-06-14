import java.util.concurrent.Phaser;

public class Main {
    public static void main(String[] args) {
        Motor motor = new IndustrialElectricMotor();
        PowerUnit powerUnit = new PowerUnit(motor);
        powerUnit.work();
        Phone phone = new iPhone();
        IndustrialElectricMotor adapter = new Adapter(phone);
        PowerUnit powerUnit1 = new PowerUnit(adapter);
        powerUnit1.work();
    }
}
