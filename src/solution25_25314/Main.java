package solution25_25314;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = n / 4;
        System.out.print("long ".repeat(div) + "int");
    }
}
