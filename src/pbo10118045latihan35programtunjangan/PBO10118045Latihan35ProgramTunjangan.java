/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan35programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : program tunjangan
 */
public class PBO10118045Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tunjangan tunjangan = new Tunjangan();
        
        System.out.println("========Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp.");
        Scanner scanner = new Scanner(System.in);
        tunjangan.setGaji(scanner.nextDouble());
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        Scanner scanner1 = new Scanner(System.in);
        tunjangan.setStatus(scanner1.next());
        tunjangan.tampilGaji();
    }
    
}
