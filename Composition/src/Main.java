public class Main {

    public static void main(String[] args){

        Walls theWall = new Walls(8,"grey");
        Lights theLights = new Lights(3,"CFL");
        furniture theFurniture = new furniture(5,"wooden");
        Bathroom theBathroom = new Bathroom(1);


        Room theRoom = new Room(theWall,theBathroom,theLights,theFurniture);

        theRoom.getWalls().getWallColor();

        theRoom.powerOnTheLights();

    }
}
