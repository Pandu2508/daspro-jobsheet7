import java.util.Scanner;

public class penjualanTiket {
    public static void main(String[] args) {
        try (Scanner p = new Scanner(System.in)) {
            int harTik = 50000;
            int totTikJual = 0; 
            double totHarTik = 0;
        
            while (true) {
                System.out.print("Masukkan jumlah tiket (ketik 0 untuk selesai): ");
                int jmlTik = p.nextInt();

                if (jmlTik == 0) {
                    break;
                }

                if (jmlTik < 0) {
                    System.out.println("Jumlah tiket tidak valid! Masukkan kembali.");
                    continue;
                }

                double harSubtotal = jmlTik * harTik;
                double diskon = 0;

                if (jmlTik > 10) {
                    diskon = 0.15;
                } else if (jmlTik > 4) {
                    diskon = 0.10;
                }

                double totalBayar = harSubtotal - (harSubtotal * diskon);

                // Tambahkan ke akumulasi harian
                totTikJual += jmlTik;
                totHarTik += totalBayar;

                System.out.println("Total harga : Rp " + totalBayar);
            }
            
            System.out.println("\nTotal tiket terjual: " + totTikJual);
            System.out.println("Total pendapatan harian: Rp " + totHarTik);
        }
    }
}