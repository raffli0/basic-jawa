/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pombensin1;

/**
 *
 * @author ROG
 */
import java.util.Scanner;
public class PomBensin1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pilihan;
        double uang;
        double harga;

        System.out.println("========== Pertamina Pamulang ==========");
        System.out.println("1. Solar               = Rp. 4500/Liter");
        System.out.println("2. Premium             = Rp. 6500/Liter");
        System.out.println("3. Pertalite           = Rp. 7500/Liter");
        System.out.println("4. Pertamax            = Rp. 8500/Liter");
        System.out.println("5. Pertamax Turbo      = Rp. 9500/Liter");
        System.out.println("========================================");

        System.out.print("Masukkan Pilihan BBM Dengan Angka = ");
        pilihan = in.nextInt();

        System.out.print("Masukkan Jumlah Uang Anda = Rp. ");
        uang = in.nextDouble();

        System.out.println("========================================");

        switch (pilihan) {
            case 1:
                harga = uang / 4500;
                break;
            case 2:
                harga = uang / 6500;
                break;
            case 3:
                harga = uang / 7500;
                break;
            case 4:
                harga = uang / 8500;
                break;
            case 5:
                harga = uang / 9500;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        int jumlahbarang = (int) Math.floor(harga); // Ambil bilangan bulat
        double totalHarga = jumlahbarang * (pilihan == 1 ? 4500 : (pilihan == 2 ? 6500 : (pilihan == 3 ? 7500 : (pilihan == 4 ? 8500 : 9500))));

        System.out.println("Jumlah BBM yang didapat = " + jumlahbarang + " Liter");
        System.out.println("Anda harus membayar sejumlah Rp. " + totalHarga);
    }

}
