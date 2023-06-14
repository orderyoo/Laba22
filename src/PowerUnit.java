public class PowerUnit {
    public Motor motor;
    PowerUnit(Motor motor){
        this.motor = motor;
    }
    public void work(){
        motor.powerSupply();
        motor.motorOn();
        motor.motorOff();
    }
}
