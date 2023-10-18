package luassegitiga;
import java.util.Scanner;
public class LuasSegitiga {
    public static void main(String[] args) {
        int alas,tinggi;
        
        Scanner input = new Scanner(System.in);        
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("========================");
        
        System.out.println("Masukan Alas = ");
        alas = input.nextInt();
        System.out.println("Masukan Tinggi = ");
        tinggi = input.nextInt();
        
        double luas;
        luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga Adalah = " + luas);
    }
    
}
