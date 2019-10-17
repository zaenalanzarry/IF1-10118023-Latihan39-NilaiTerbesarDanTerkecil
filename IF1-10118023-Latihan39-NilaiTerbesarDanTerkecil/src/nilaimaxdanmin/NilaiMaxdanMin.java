/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nilaimaxdanmin;

import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : (Object Oriented) Nilai Terbesar dan Terkecil
 */

public class NilaiMaxdanMin {
    public static String petugas;
    public static int[] nilaiMhs = new int[10];
    public static int nilaiMax = 0;
    public static int nilaiMin = 100;
    public static int banyakMhs;
    
    public static void main(String[] args) {
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama petugas : ");
        petugas = input.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyakMhs = input.nextInt();
                
        while(banyakMhs > 10){
            System.out.println("Maaf banyak nilai mahasiswa maksimal 10 ");
            System.out.print("Masukkan angka kembali : ");
            banyakMhs = input.nextInt();
        }
                     
        for (int i = 1; i <= banyakMhs; i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke - " + i + " : ");
            nilaiMhs[i] = input.nextInt();
            if(nilaiMhs[i] > nilaiMax ){
                nilaiMax  = nilaiMhs[i];
            } 
            else if(nilaiMhs[i] < nilaiMin){
                nilaiMin = nilaiMhs[i];
            }
        }
                           
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for(int i = 1; i<=banyakMhs; i++){
            System.out.println("Nilai Mahasiswa Ke - " + i + " = " + nilaiMhs[i]);
        }
        System.out.println("\nNilai Terbesar adalah " + nilaiMax);
        System.out.println("Nilai Terkecil adalah "  + nilaiMin);
        System.out.println();
        System.out.println("Petugas : " + petugas);
     
    }
    
}
