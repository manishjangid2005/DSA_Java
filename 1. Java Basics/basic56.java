// Convert from Decimal to Binary

public class basic56 {
    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary of " + myNum +" = " + binNum);
    }
    public static void main(String[] args) {
        decToBin(7);
    }

}
