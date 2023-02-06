public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        int a = 6;
        int b = 20;

        String strA = Integer.toBinaryString(a);
        String strB = Integer.toBinaryString(b);

        String sumAB = bins.sum(strA, strB);
        String multAB = bins.mult(strA, strB);

        int intSumAB = Integer.parseInt(sumAB, 2);
        int intMultAB = Integer.parseInt(multAB, 2);

        System.out.println(intSumAB);
        System.out.println(intMultAB);
    }
}