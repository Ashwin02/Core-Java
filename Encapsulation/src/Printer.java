public class Printer {

    private int tonerLevel = 50;
    private int numPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numPagesPrinted, boolean isDuplex) {
        if(tonerLevel > 0 && tonerLevel <= 100 ){
            this.tonerLevel = tonerLevel;
        }

        this.numPagesPrinted = numPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int amount){
        if((amount + this.tonerLevel) <= 100){
            this.tonerLevel = this.tonerLevel+amount;
        }
        else{
            this.tonerLevel = 100;
        }
    }

    public void printPage(){
        this.numPagesPrinted ++;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumPagesPrinted() {
        return numPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
