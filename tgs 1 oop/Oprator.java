// NIM: [13020240105]
// Nama: [RIFKY BURTI ARYANTO]
// Hari/Tanggal: jum'at, 04 April 2026
/* Contoh pengoperasian variabel bertype dasar */
public class Oprator {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        boolean Bool1, Bool2, TF;
        int i, j, hsl;
        float x, y, res;
        /* Algoritma */
        System.out.println("Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");
        Bool1 = true;
        Bool2 = false;
        TF = Bool1 && Bool2; /* Boolean AND */
        TF = Bool1 || Bool2; /* Boolean OR */
        TF = !Bool1;         /* NOT */
        TF = Bool1 ^ Bool2;  /* XOR */
        /* operasi numerik */
        i = 5; j = 2;
        hsl = i + j;
        hsl = i - j;
        hsl = i / j;
        hsl = i * j;
        hsl = i / j;   /* pembagian bulat */
        hsl = i % j;   /* sisa modulo */
        /* operasi numerik float */
        x = 5; y = 5;
        res = x + y;
        res = x - y;
        res = x / y;
        res = x * y;
        /* operasi relasional numerik */
        TF = (i == j);
        TF = (i != j);
        TF = (i < j);
        TF = (i > j);
        TF = (i <= j);
        TF = (i >= j);
        /* operasi relasional float */
        TF = (x != y);
        TF = (x < y);
        TF = (x > y);
        TF = (x <= y);
        TF = (x >= y);
        /* Menampilkan hasil operasi */
        System.out.println("=== Operasi Boolean ===");
        System.out.println("Bool1 = " + Bool1 + ", Bool2 = " + Bool2);
        System.out.println("Bool1 && Bool2 (AND) = " + (Bool1 && Bool2));
        System.out.println("Bool1 || Bool2 (OR)  = " + (Bool1 || Bool2));
        System.out.println("!Bool1 (NOT)         = " + (!Bool1));
        System.out.println("Bool1 ^ Bool2 (XOR)  = " + (Bool1 ^ Bool2));
        System.out.println("\n=== Operasi Numerik Integer ===");
        System.out.println("i=" + i + ", j=" + j);
        System.out.println("i + j = " + (i + j));
        System.out.println("i - j = " + (i - j));
        System.out.println("i * j = " + (i * j));
        System.out.println("i / j = " + (i / j));
        System.out.println("i % j = " + (i % j));
        System.out.println("\n=== Operasi Numerik Float ===");
        System.out.println("x=" + x + ", y=" + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("\n=== Operasi Relasional Integer ===");
        System.out.println("i == j : " + (i == j));
        System.out.println("i != j : " + (i != j));
        System.out.println("i <  j : " + (i < j));
        System.out.println("i >  j : " + (i > j));
        System.out.println("i <= j : " + (i <= j));
        System.out.println("i >= j : " + (i >= j));
    }
}