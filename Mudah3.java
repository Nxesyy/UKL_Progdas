public class Mudah3 {
    public static void main(String[] args) {
        //Menggunakan for untuk mengulang angka
        for (int i = 50; i >= 2; i--) {

            //Menggunakan Operator modulo untuk membedakan ganjil genap
            if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 33");
            } else {
               
                if (i % 2 == 0) {
                    System.out.println(i + ". saya anak moklet");
                } else {
                    System.out.println(i + ". saya anak wikusama");
                }
            }
        }
        System.out.println("1. saya senang");
    }
}