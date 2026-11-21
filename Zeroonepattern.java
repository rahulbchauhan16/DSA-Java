public class Zeroonepattern {
    public static void main(String[] args) {
        int n = 7;
        int str = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) str = 1;
            else str = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(str);
                str = 1 - str;
            }
            System.out.println();
        }
    }
}
