public class VillainTest {
    public static void main(String[] args) {
        Villain v = new Villain();
        v.xCoordinate = 3;
        v.newOriginX = -2.2;


        Villain v2 = new Villain();
        v2.xCoordinate = 5;
        v2.newOriginX = -1.4;


        System.out.println("v has the x-coordinate  = " + v.xCoordinate);
        System.out.println("v has the newOriginX  = " + v.newOriginX);
        System.out.println("v2 has the x-coordinate  = " + v2.xCoordinate);
        System.out.println("v2 has the newOriginX  = " + v2.newOriginX);
    }

}
