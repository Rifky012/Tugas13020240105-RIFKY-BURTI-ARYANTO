// NIM: [13020240105]
// Nama: [RIFKY BURTI ARYANTO]
// Hari/Tanggal: jum'at, 04 April 2026
// Program: Menampilkan berbagai tipe data (integer, char, float, double)
public class ASIGNi {
    public static void main(String[] args) {
        // ========================
        // KAMUS (Deklarasi Variabel)
        // ========================
        short ks = 1;        // variabel tipe short (bilangan bulat kecil)
        int ki = 1;          // variabel tipe int (bilangan bulat)
        long kl = 10000;     // variabel tipe long (bilangan bulat besar)
        char c = 65;         // karakter dari kode ASCII (65 = 'A')
        char cl = 'z';       // karakter langsung
        double x = 50.2f;    // tipe double (bilangan desimal presisi tinggi)
        float y = 50.2f;     // tipe float (bilangan desimal)
        // ========================
        // ALGORITMA (Output)
        // ========================
        // Menampilkan karakter
        System.out.println("Karakter = " + c);   // output: A
        System.out.println("Karakter = " + cl);  // output: z
        // Ditampilkan ulang (duplikat output)
        System.out.println("Karakter = " + c);
        System.out.println("Karakter = " + cl);
        // Menampilkan bilangan integer
        System.out.println("Bilangan integer (short) = " + ks);
        System.out.println("\t(int) = " + ki);
        System.out.println("\t(long) = " + kl); // perbaikan: harusnya kl, bukan ki
        // Menampilkan bilangan real
        System.out.println("Bilangan Real x = " + x);
        System.out.println("Bilangan Real y = " + y);
    }
}