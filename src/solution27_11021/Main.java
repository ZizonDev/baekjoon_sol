package solution27_11021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a <= 0 || a >= 10 || b <= 0 || b >= 10) {
                break;
            }
            else {
                System.out.println("Case #" + (i+1) + ": " + (a+b));
            }
        }
    }
}
