package day2.realworldexample;

public abstract class Television extends ElectricalApplianceImpl{
    float screenSize;
    boolean isAndroidTv;

    /**
     * @param isAndroidTv
     * we have to check the internet connectevity if it is android tv
     */
    Television(boolean isAndroidTv, int devicePower) {
        super(devicePower);
        this.isAndroidTv = isAndroidTv;
        if(isAndroidTv) {
            checkInternetConnection();
        }
    }

    /**
     * ping and if ping succeds internet is working
     * if iternet is working have to show no internet connection on the tv startup
     */
    private void checkInternetConnection() {
        System.out.println("no internet connection");
    }
    abstract void changeChannel();
    abstract void increaseSound();
    abstract void decreaseSound();



}
