package clasatv;

public class TV {
    private boolean power;
    private int channelNr;
    private int volume;
    private Channel[] channels = new Channel[channelNr];


    public  boolean On() {
        power = true;
        return power;
    }

    public boolean Off() {
        power = false;
        return power;
    }

    public void changeChannel(int channelNr) {
        if (power == true) {
            this.channelNr = channelNr;
        }
    }

    public void nextChannel() {
        if (power == true) {
            channelNr++;
            if (channelNr < 100) {
                channelNr++;
            }
            else channelNr = 1;
        }
    }

    public void prevChannel() {
        if (power == true) {
            if (channelNr > 0) {
                channelNr--;
            }
            else channelNr = 100;

        }
    }

    public void volumeUp() {
        if (power == true) {
            if (volume < 50) {
                volume++;
            }
        }
    }

    public void volumeDown() {
        if (power == true) {
            if (volume > 0) {
                volume--;
            }
        }
    }
}
