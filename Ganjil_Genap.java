import java.util.Scanner;

public class Ganjil_Genap {
    public static void main(String[] args) throws Exception {
        try (Scanner inputan = new Scanner(System.in)) {
            System.out.print("Masukkan Angka : ");
            int Angka = inputan.nextInt();
            
            if (Angka % 2 == 0) {
                System.out.println("Bilangan Genap");            
            } else {
                System.out.println("Bilangan Ganjil");
                
            
        }
    }
        
    }
}
