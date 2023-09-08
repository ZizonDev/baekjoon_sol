package solution22_10950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        int[] b = new int[t];
        int[][] test = {a, b};
        for(int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            System.out.println(a[i] + b[i]);
        }
    }
}
