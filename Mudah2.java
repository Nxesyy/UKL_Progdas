import java.util.Scanner;
public class Mudah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Memasukkan Bilangan
        System.out.println("Masukkan Bilangan:");
        
        int data = input.nextInt();
        
        //Menghitung dan print ganjil genap    
        if (data % 2 != 0) {
                System.out.print(data + " bilangan adalah Ganjil ");
            }else{
                System.out.println(data + " Bilangan adalah Genap");
         }
        input.close();
    }    
}