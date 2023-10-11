public class parkir {
    public static void main(String[]args){
        int jam_masuk = 7; //variabel
        int jam_keluar = 12;
        int biayaPerjam = 2000;
        int total_jam_parkir = jam_keluar - jam_masuk; //Perhitungan Jam Parkir
        int H = total_jam_parkir * biayaPerjam; //Perhitungan Total Biaya Bayar
         //By. Nanda Irsayd Muzammil
         System.out.println("SELAMAT JALAN");
         System.out.println("----------------------------------------------");
         System.out.println("Biaya Yang Harus Di Keluarkan Sebesar RP." +H); //Cetak Hasil
    }
}