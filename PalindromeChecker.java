import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        if (isPalindrome(kata)) {
            System.out.println(kata + " adalah palindrome.");
        } else {
            System.out.println(kata + " bukan palindrome.");
        }

        input.close();
    }

    // Fungsi untuk memeriksa apakah sebuah kata adalah palindrome
    public static boolean isPalindrome(String kata) {
        // Menghapus spasi dan mengonversi semua huruf menjadi huruf kecil
        kata = kata.replaceAll("\\s", "").toLowerCase();

        int panjang = kata.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (kata.charAt(i) != kata.charAt(panjang - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}