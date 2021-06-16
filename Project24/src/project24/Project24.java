/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project24;
import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project24 {
//harga = > 3000 . 
//kg => 5 
//uang =>25.000 
//=>Total  Harga  Gula = 5 * 30000 
//=>Kembalian = 25.000.000 - total Harga Gula ; 
//=> ongkos Perjalanan = 2* 3500 ; 
//=>Total Biaaya = kembalian - ongkos perjalanan  ;

    /**
     * @param args the command line arguments
     */
    static int totalBiaya (int uang , int kg){
    int totalHarga , kembalian , ongkosPerjalanan , totalBiaya;
    ongkosPerjalanan = 2 * 3500;
    int totalHargaGula = kg * 3000;
    kembalian = uang - totalHargaGula;
    totalBiaya = kembalian + ongkosPerjalanan;
    if (uang < totalHargaGula){
            System.out.println("Uang Saldo Tidak Cukup.");
               
    }
    if(kg > 5){
            totalHargaGula = kg * 3000 -(kg * 3000 * 10/100);
            kembalian = uang - totalHargaGula;
            totalBiaya = kembalian + ongkosPerjalanan;
            System.out.println("You will get the discount");
        
    }
    return totalBiaya;
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        int uang, kg;
        
        System.out.println("Berapa Uang Yang Anda Miliki = ");
        uang = scan.nextInt();
        System.out.println("Berapa Kg Gula Yang Ingin Dibeli = ");
        kg = scan.nextInt();
        totalBiaya(uang, kg);
        System.out.println("Total Biaya = "+totalBiaya(uang, kg));
           }
    }
    

