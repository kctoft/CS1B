public class Test {
    static int someRecMethod(int n) {
        if (n < 0)
            return -1;
        return someRecMethod(n + 1);
    }
    public static void main(String[] args){
        System.out.println(someRecMethod(3));

    }
}
