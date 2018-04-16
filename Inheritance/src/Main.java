public class Main {

    public static void main(String[] args){

        Car honda = new Car("Commercial","Sedan","4 wheel", 50);

        System.out.println("Car category "+ honda.getCategory());

        honda.changeGear(3);
        honda.increaseSpeed(40);
    }
}
