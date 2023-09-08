package solution24_25304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[][] ab = new int[2][n];
        int total = 0;
        for(int i = 0; i < n; i++) {
            ab[0][i] = sc.nextInt();
            ab[1][i] = sc.nextInt();
            total += ab[0][i] * ab[1][i];
        }
        if (total == x) System.out.println("Yes");
        else System.out.println("No");
    }
}
