public class Main {

    public static void main(String[] args){

        Printer canon = new Printer(30,5,true);

        canon.fillToner(210);
        System.out.println("Toner level "+canon.getTonerLevel());

        canon.printPage();
        System.out.println("Total pages printed "+canon.getNumPagesPrinted());

        System.out.println("Is printer duplex "+canon.isDuplex());

    }
}
