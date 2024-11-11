package day2.realworldexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sony extends Television{

    List<String> ott = new ArrayList<String>();

    /**
     * @param isAndroidTv we have to check the internet connectevity if it is android tv
     * @param devicePower
     */
    Sony(boolean isAndroidTv, int devicePower) {
        super(isAndroidTv, devicePower);
    }

    @Override
    void changeChannel() {

    }

    @Override
    void increaseSound() {

    }

    @Override
    void decreaseSound() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }
    void showOtt() {
        if(super.isAndroidTv) {
            ott.addAll(Arrays.asList("hotstar","prime","netflix"));
        }
    }
}
