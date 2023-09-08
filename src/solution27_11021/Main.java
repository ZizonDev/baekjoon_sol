package solution27_11021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] ab = new int[2][t];
        for(int i = 0; i < t; i++) {
            System.out.println("Case #" + (i+1) + ": " + (ab[0][i] + ab[1][i]));
        }
    }
}
