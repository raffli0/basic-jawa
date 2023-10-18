package volpersegipanjang;

import java.util.Scanner; // import Scanner
public class VolPersegiPanjang {

    public static void main(String[] args) {
        int panjang,lebar,tinggi;
        
        Scanner input = new Scanner(System.in); //create a scanner object (input) name can change what ever you want
        
        System.out.println("Masukan Panjang = ");
        panjang = input.nextInt(); // Read user input
        System.out.println("Masukan Lebar = ");
        lebar = input.nextInt();
        System.out.println("Masukan tinggi = ");
        tinggi = input.nextInt();
        
        int luas;
        luas = panjang * lebar * tinggi;
        System.out.println("Luas Persegi Panjang = " + luas); //output user input
             
                
              
    }
    
}
