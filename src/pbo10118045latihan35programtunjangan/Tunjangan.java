/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan35programtunjangan;

/**
 *
 * @author Ilham
 */
public class Tunjangan {
    private double gaji, gajiTotal, tunjangan;
    private String status;

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private double hitungTunjangan(){
        if(status.equals("Menikah")||(status.equals("menikah"))) return(gaji*0.35);
        else return 0;
    }
    
    public void tampilGaji(){
        tunjangan = hitungTunjangan();
        gajiTotal = gaji + tunjangan;
        
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok\t\t: Rp. "+gaji);
        System.out.println("Tunjangan\t\t: Rp. " +tunjangan);
        System.out.println("Total Gaji\t\t: Rp. " +gajiTotal);
        System.out.println("(Developer by : Muhammad Ilham Apriyadi)");
        
    }
    
    
}
