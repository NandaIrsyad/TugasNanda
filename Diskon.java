import java.util.Scanner;
public class Diskon {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Double totalbelanja, Diskon;

        try (Scanner inputan = new Scanner(System.in)) {
            System.out.print("jumlah belanja: ");
            totalbelanja = inputan.nextDouble();
        }
        if (totalbelanja >= 100000) {
           Diskon = 90/100 * totalbelanja;
           totalbelanja = totalbelanja - Diskon;
        }

        System.out.println("total yang harus dibayar: " + totalbelanja);
    }
}