import java.util.Scanner;
public class Nilai_ujian {
    public static void main(String[] args) throws Exception {
        /* menghitung bilangan ganjil/genap */
        Double nilai;
        String indeksNilai;

        try (Scanner inputan = new Scanner(System.in)) {
            System.out.print("masukkan nilai: ");
            nilai = inputan.nextDouble();
        }
        if (nilai >= 75) {
            indeksNilai = "A";
        } else if (nilai >= 65) {
            indeksNilai = "B";
        } else if (nilai >= 55) {
            indeksNilai = "C";
        } else {
            indeksNilai = "D";
        }

            System.out.println("indeks nilai: " + indeksNilai);
    }
}
