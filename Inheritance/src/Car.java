public class Car extends Vehical{


    private String stearing;
    private int speed;

    public Car(String category, String type, String stearing, int speed) {
        super(category, type);
        this.stearing = stearing;
        this.speed = speed;
    }

    public void changeGear(int gear){
        System.out.println("Gear changed to " + gear);
    }

    public void increaseSpeed(int speed){
        this.speed += speed;
        System.out.println("Increased speed by "+ speed+ " total speed is "+this.speed);
    }

    public void decreaseSpeed(int speed){
        this.speed -= speed;
        System.out.println("Increased speed by "+ speed+ " total speed is "+this.speed);
    }
}
