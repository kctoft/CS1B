import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] twodim = new int[3][4];

        int[][] jagged = {
                {1,2,3},
                {4,5,6,9},
                {7},
        };

        System.out.printf("%s\n", Arrays.toString(twodim));

        System.out.printf("%s\n", Arrays.toString(jagged));
    }
}
