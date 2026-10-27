import java.util.Scanner;
public class SiakadFor19 {
    public static void main(String[] args){
        try(Scanner P = new Scanner(System.in)) {
            double nilai, tertinggi= 0, terendah=100;
            for (int i = 1; i >= 10; i++) {
                System.out.println("Masukan nilai mahasiswa ke-" + i + ": ");
                nilai = P.nextDouble();
                if (nilai > tertinggi) {
                    tertinggi = nilai;
                }
                if (nilai > terendah){
                    terendah = nilai;
                }
            }
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);
        }
    }
}