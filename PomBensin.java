 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pombensin;

/**
 *
 * @author ROG
 */
import java.util.Scanner;
public class PomBensin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in =new Scanner (System.in);
        
        //deklarasi variable
        int pilihan, jumlahbarang, jumlahbarang1 = 0, jumlahbarang2, harga, diskon;
        
        //intro
        System.out.println("========== Pertamina Pamulang ==========");
        System.out.println("1. Solar               = Rp. 4500/Liter");
        System.out.println("2. Premium             = Rp. 6500/Liter");
        System.out.println("3. Pertalite           = Rp. 7500/Liter");
        System.out.println("4. Pertamax            = Rp. 8500/Liter");
        System.out.println("5. Pertamax Turbo      = Rp. 9500/Liter");
        System.out.println("========================================");
        
        //input user
        System.out.print("  Masukkan Pilihan BBM Dengan Angka = ");
        pilihan = in.nextInt();
        
        System.out.println("========================================");
        
        //proses
        switch (pilihan){
            case 1: System.out.println("        Anda akan membeli Solar");
                    System.out.print("Masukkan Jumlah Liter Solar = ");
                    jumlahbarang = in.nextInt();
                    System.out.println("========================================");
                    harga = 4500*jumlahbarang;
                    System.out.println("Harga Solar = Rp. "+harga);
                    if (jumlahbarang % 5 >= 0){
                        jumlahbarang1 = jumlahbarang/5;}
                        jumlahbarang2 = jumlahbarang + jumlahbarang1;
                  
                    System.out.println("Jumlah BBM yang didapat = "+jumlahbarang2+" Liter");
                    System.out.println("Anda harus membayar sejumlah Rp. "+harga+" untuk "+jumlahbarang2+" Liter Solar");
            break;
            case 2: System.out.println("       Anda akan membeli Premium");
                    System.out.print("Masukkan Jumlah Liter Premium = ");
                    jumlahbarang = in.nextInt();
                    System.out.println("========================================");
                    harga = 6500*jumlahbarang;
                    System.out.println("Harga Premium = Rp. "+harga);
                    if (jumlahbarang % 5 >= 0){
                        jumlahbarang1 = jumlahbarang/5;}
                        jumlahbarang2 = jumlahbarang + jumlahbarang1;
                      
                      
                    System.out.println("Jumlah BBM yang didapat = "+jumlahbarang2+" Liter");
                    System.out.println("Anda harus membayar sejumlah Rp. "+harga+" untuk "+jumlahbarang2+" Liter Premium");
            break;
            case 3: System.out.println("      Anda akan membeli Pertalite");
                    System.out.print("Masukkan Jumlah Liter Pertalite = ");
                    jumlahbarang = in.nextInt();
                    System.out.println("========================================");
                    harga = 7500*jumlahbarang;
                    System.out.println("Harga Pertalite = Rp. "+harga);
                    if (jumlahbarang % 5 >= 0){
                        jumlahbarang1 = jumlahbarang/5;}
                        jumlahbarang2 = jumlahbarang + jumlahbarang1;
                      
                      
                    System.out.println("Jumlah BBM yang didapat = "+jumlahbarang2+" Liter");
                    System.out.println("Anda harus membayar sejumlah Rp. "+harga+" untuk "+jumlahbarang2+" Liter Pertalite");
            break;
            case 4: System.out.println("      Anda akan membeli Pertamax");
                    System.out.print("Masukkan Jumlah Liter Pertamax = ");
                    jumlahbarang = in.nextInt();
                    System.out.println("========================================");
                    harga = 8500*jumlahbarang;
                    System.out.println("Harga Pertamax = Rp. "+harga);
                    if (jumlahbarang % 5 >= 0){
                        jumlahbarang1 = jumlahbarang/5;}
                        jumlahbarang2 = jumlahbarang + jumlahbarang1;
                      
                      
                    System.out.println("Jumlah BBM yang didapat = "+jumlahbarang2+" Liter");
                    System.out.println("Anda harus membayar sejumlah Rp. "+harga+" untuk "+jumlahbarang2+" Liter Pertamax");
            break;
            case 5: System.out.println("    Anda akan membeli Pertamax Turbo");
                    System.out.print("Masukkan Jumlah Liter Pertamax Turbo = ");
                    jumlahbarang = in.nextInt();
                    System.out.println("========================================");
                    harga = 9500*jumlahbarang;
                    System.out.println("Harga Pertamax Turbo = Rp. "+harga);
                    if (jumlahbarang % 5 >= 0){
                        jumlahbarang1 = jumlahbarang/5;}
                        jumlahbarang2 = jumlahbarang + jumlahbarang1;
                      
                    //output
                    System.out.println("Jumlah BBM yang didapat = "+jumlahbarang2+" Liter");
                    System.out.println("Anda harus membayar sejumlah Rp. "+harga+" untuk "+jumlahbarang2+" Liter Pertamax Turbo");
        }
    }
    
}
