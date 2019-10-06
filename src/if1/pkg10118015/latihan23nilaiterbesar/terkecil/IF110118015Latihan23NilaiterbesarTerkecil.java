/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan23nilaiterbesar.terkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program mencari nilai terbesar dan terkecil
*/
public class IF110118015Latihan23NilaiterbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int terbesar = 0,terkecil = 100;
        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai Mahasiswa======");
	System.out.print("Masukkan Nama Petugas : ");
	Scanner input = new Scanner(System.in);
	String petugas = input.next();
	System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
	int jumlahmhs = input.nextInt();
	int[] nilaimhs = new int[jumlahmhs];
	for( int i = 0; i < jumlahmhs; i++){
		System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + " : " );
		nilaimhs[i] =  input.nextInt();
		if(nilaimhs[i] > terbesar)
			terbesar = nilaimhs[i];
		if(nilaimhs[i] < terkecil)
			terkecil = nilaimhs[i];
	}
        System.out.println();
	System.out.println("Nilai Terbesar adalah " + terbesar);
	System.out.println("Nilai Terkecil adalah " + terkecil);
        System.out.println();
        System.out.println("Petugas : "+ petugas);
        System.out.println("(Developed by : Adi Chandra Nugraha)");
    }
}
    
