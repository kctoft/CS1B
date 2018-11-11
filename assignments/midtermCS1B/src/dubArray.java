public class dubArray {
    public static void main(String[] args) {


    double[] dubArray1 = new double[75];
    double[] dubArray2 = new double[100];

    // there are no intervening statements.  immediately following we have:
    dubArray1 = dubArray2;
    dubArray1[99]=101;

    }
}

