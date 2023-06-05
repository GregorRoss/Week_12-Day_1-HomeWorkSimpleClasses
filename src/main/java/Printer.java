public class Printer {
    private int numOfSheets;
    private int tonerVolume;

    public Printer (){
        this.numOfSheets = 50;
        this.tonerVolume = 30;
    }

    public int getNumOfSheets() {
        return numOfSheets;
    }

    public void setNumOfSheets(int numOfSheets) {
        this.numOfSheets = numOfSheets;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void setTonerVolume(int tonerVolume) {
        this.tonerVolume = tonerVolume;
    }

    public void print(int pages, int copies){
        int totalSheets = pages * copies;
        int tonercost = totalSheets * 1;
        if(totalSheets <= this.numOfSheets) {
            this.numOfSheets = this.numOfSheets - totalSheets;
            this.tonerVolume = this.tonerVolume - tonercost;
        }

    }
}
