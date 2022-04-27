import java.io.*;
public class Konversi_huruf
        public static void main(String[] args) {
            Scanner x = new Scanner(System.in);
            System.out.println("Program Konversi Nilai Ke Huruf Mahasiswa");
            System.out.println("Masukkan Sebuah Nilai = ");
            int a = x.nextInt();
            if (a >= 80) {
                System.out.println("Nilai Anda A");
            } else if (a >= 76 && a <= 79) {
                System.out.println("Nilai Anda B+");
            } else if (a >= 71 && a <= 64) {
                System.out.println("Nilai Anda B");
            } else if (a >= 66 && a <= 49) {
                System.out.println("Nilai Anda C");
            } else {
                (a >= 41 && a <= 34) {
                    System.out.println("Nilai Anda D");
                }
            }

        }
