/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan28.gantikata;
/**
 * @author  
 * Nama  : Aditiya Musthafa Kamil
 * Kelas : PBOIF2
 * NIM   : 10119075
 * Deskripsi Program : Program ini berisi program yang  menampilkan penggantian suku kata
 **/

import java.util.Scanner;
public class PBOIF210119075Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String kalimat,ganti,menjadi;
        
        System.out.println("====Program Mengganti Kata=====");
        System.out.print("Masukkan Kalimat : ");
        kalimat = input.nextLine();
        System.out.print("Ganti Kata : ");
        ganti = input.nextLine();
        System.out.print("Menjadi Kata : ");
        menjadi = input.nextLine();
        
        System.out.println("===Hasil Formating===");
        System.out.println("Kalimat Awal : " + kalimat);
        System.out.print("Kalimat Baru : " + kalimat.replace(ganti,menjadi));
        
        System.out.println("===============================================");
        System.out.println("Developed by Aditiya Musthafa Kamil");
        
    }
    
}
