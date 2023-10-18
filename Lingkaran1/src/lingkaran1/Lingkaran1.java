/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lingkaran1;

import java.util.Scanner;
public class Lingkaran1 {

    public static void main(String[] args) {
        //deklarasi 
        double phi = 3.14;
        double r,Luas,Keliling;
        
        //input 
        Scanner input = new Scanner(System.in);
        
        //intro 
        System.out.println("Keliling dan Luas Lingkaran");
        System.out.println("===========================\n");
        
        System.out.print("masukan jari-jari = ");
        r = input.nextDouble();
        
        //proses and output
        Luas = (phi * r * r); 
        System.out.println("Luas lingkaran = " + Luas + "cm");
        
        Keliling = (2 * phi * r);
        System.out.println("Keliling lingkaran = " + Keliling + "cm");
    
    }
    
}
