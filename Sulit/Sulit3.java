package Sulit;

import java.util.Arrays;
import java.util.Scanner;

public class Sulit3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan jumlah elemen
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scanner.nextInt();
        
        // Membuat array dengan ukuran yang ditentukan
        int[] angka = new int[n];
        boolean[] diHitung = new boolean[n];
        
        // Meminta pengguna untuk memasukkan elemen array
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            angka[i] = scanner.nextInt();
        }
         System.out.println("Array: " + Arrays.toString(angka));
       
         // Menghitung frekuensi setiap elemen
        for (int i = 0; i< n; i++){ 
            if (!diHitung[i]) { // Di jalankan jika angka belum di hitung atau false
                int hitung = 1; // angka yang yang muncul cuman 1 / dirinya sendiri
                for (int j = i + 1; j < n; j++) { // Mencari angka sama
                    if (angka[i] == angka[j]) { // angka yang sama akan tambahkan ke hitung
                            hitung++;  // Angka di tambah setiap ada angka yang sama
                                diHitung[j] = true; // Angka yang sudah di hitung akan di lewati
                    }
                }
                System.out.println(angka[i] + " muncul " + hitung + " kali");
            }
        }
        scanner.close();
    }
}
