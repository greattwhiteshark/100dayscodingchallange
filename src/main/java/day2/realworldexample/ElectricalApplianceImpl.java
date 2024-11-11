package day2.realworldexample;

public abstract class ElectricalApplianceImpl implements ElectricalAppliance{
    /**
     *
     * @param devicePower
     * device power cannot be gretaer than the maximum power
     */
    ElectricalApplianceImpl(int devicePower) {
        if(devicePower > MAX_POWER ) {
            System.out.println("device power cannot be greated than "+MAX_POWER);
        }
    }
}
