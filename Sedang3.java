package Sedang;
import java.util.Random;
import java.util.Scanner;
public class Sedang3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
    
        boolean lanjut = true;
        
        while (lanjut) {
            int bilPertama = random.nextInt(100);
            int bilKedua = random.nextInt(100);
                String operator = " ";
                int hasil = 0;
                   int operasi = random.nextInt(3); //untuk random 0. *, 1. /, 2. %
        
        switch (operasi) {
            case 0:
                operator = "*";
                hasil = bilPertama * bilKedua;
                break;
            case 1:
                operator = "/";
                hasil = bilPertama / bilKedua;
                break;
            case 2:
                operator = "%";
                hasil = bilPertama % bilKedua;
                break;
            }
            System.out.print(bilPertama + " " + operator + " " + bilKedua + " = ");
            int jawabanPengguna = scanner.nextInt();

            if (jawabanPengguna == hasil) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Hasil yang benar adalah: " + hasil);
            }

            System.out.print("Apakah Anda ingin melanjutkan kuis? (lanjut/tidak): ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("tidak")) {
                System.out.println("Okee nanti main lagi yak");
                lanjut = false;
        }
    
    }
    scanner.close();
}
}
