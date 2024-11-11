package day2.realworldexample;

public abstract class Cooler extends ElectricalApplianceImpl{
    int minimumWaterLevel = 10;

    /**
     * @param devicePower device power cannot be gretaer than the maximum power
     */
    Cooler(int devicePower, int waterlevel) {
        super(devicePower);
        if(waterlevel < minimumWaterLevel) {
            System.out.println("low water level. refil it soon");
        }
    }

    abstract void setSpeed();

}
