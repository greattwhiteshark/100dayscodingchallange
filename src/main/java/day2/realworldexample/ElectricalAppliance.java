package day2.realworldexample;
/**

 *
 * <p>every electrical appliance can be turned on and turned off </p>
 * <br>
 * house hold appliances cannot consume more than 1000 watts for safety purpose
 * @author leekendra
 * @version 1.0
 * */
public interface ElectricalAppliance {
    final static int MAX_POWER = 1000;
    void on();
    void off();
}
