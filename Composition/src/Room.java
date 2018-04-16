public class Room {

    private Walls walls;
    private Bathroom bathroom;
    private Lights lights;
    private furniture furniture;

    public Room(Walls walls, Bathroom bathroom, Lights lights, furniture furniture) {
        this.walls = walls;
        this.bathroom = bathroom;
        this.lights = lights;
        this.furniture = furniture;
    }

    public void powerOnTheLights(){
        System.out.println("The number of lights turned on " + this.lights.getOnLights());
    }


    public Walls getWalls() {
        return walls;
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public Lights getLights() {
        return lights;
    }

    public furniture getFurniture() {
        return furniture;
    }
}
