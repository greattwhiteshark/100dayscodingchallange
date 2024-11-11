package day1.appliance;

public interface ElectricalAppliances {
    //interface contains the common behaviour
    final static int MAX_POWER = 1000;  // any applicant should not consume more than Max power

    abstract void on();
    abstract void off();

}

 abstract class Television implements ElectricalAppliances {
    int power;
    enum TYPE {LCD, LED, CRT};

    Television(int power) {
        if(power > MAX_POWER) {
            System.out.println("not allowed");
        }
    }
}

class Sony extends Television{
    boolean isSmartTv;

    Sony(int power) {
        super(power);
    }

    @Override
    public void on() {
        System.out.println("sony on");
    }

    @Override
    public void off() {
        System.out.println("sony off");
    }

    void setIsSmartTv(boolean isSmartTv) {
        this.isSmartTv = isSmartTv;
    }
}

class SonyBravia extends Sony {
    boolean isSmartTv = true;
    boolean isAndroidTv = false;

    SonyBravia(int power) {
        super(power);
        setIsSmartTv(isSmartTv);
    }




}



