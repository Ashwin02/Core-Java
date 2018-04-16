public class Walls {

    private int number;
    private String color;


    public Walls(int number, String color) {
        this.number = number;
        this.color = color;
    }

    public void getWallColor(){
        System.out.println("The wall color is " + color);
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }
}
