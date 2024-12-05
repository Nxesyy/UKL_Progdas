package Sedang;

import java.util.Scanner;

public class Sedang1 {
    public static long menghitung(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
 
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Bilangan Bulat Positif");
        int n = scanner.nextInt();

        long faktorial = menghitung(n);
        System.out.println("faktorial dari " + n + " adalah " + faktorial);

        scanner.close();

    }
}
