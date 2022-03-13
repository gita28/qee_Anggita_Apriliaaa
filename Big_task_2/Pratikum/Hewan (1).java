public class Hewan {
 
    // Properti 
    double tinggi = 19;
    double berat = 5;
 
    // Inisialisasi properti melalui konstruktor
    int umur;

    Hewan(int umur) {
        this.umur = umur;
    }
 
    void lari() {
        System.out.println("Berlari dengan sangat cepat..");
    }
 
    void jalan() {
        System.out.println("Berjalan sambil melompat.");
    }
 
    void makan() {
        System.out.println("Makan wortel dengan menggunakan mulutnya");
    }
 
    int getUmur() {
        return umur;
    }
 
    double getBerat() {
        return berat;
    }
 
    double getTinggi() {
        return tinggi;
    }
 
}