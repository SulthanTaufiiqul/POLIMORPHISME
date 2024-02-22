public class iphone implements Phone {

    private int volume;
    private boolean isPowerOn;

    public iphone() {
        // set volume awal
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone is on...");
        System.out.println("Hello");
        System.out.println("IOS Version 11");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Phone is off");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Turn on ur phone first!!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Turn on ur phone first!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }

}
 
    

