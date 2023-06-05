public class WaterBottle {
    private int volume;

    public WaterBottle(){
        this.volume = 100;

    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void drink(){
        this.volume = this.volume - 10;
    }

    public void empty(){
        this.volume = 0;
    }

    public void fill(){
        this.volume = 100;
    }
}
