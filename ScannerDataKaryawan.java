package com.day.studies;
import java.util.Scanner;
public class ScannerDataKaryawan {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        String nama,alamat;
        int noHp, gaji;
        
        System.out.println("PENDATAAN KARYAWAN PT. BERKAH");
        System.out.println("=============================");
        
        System.out.print("Masukan Nama anda : ");
        nama = userInput.nextLine();
        System.out.print("Masukan Alamat anda : ");
        alamat = userInput.nextLine();
        System.out.print("Masukan NO. HP anda : ");
        noHp = userInput.nextInt();
        System.out.print("Masukan gaji anda : ");
        gaji = userInput.nextInt();
        
        System.out.println("=============================");
        System.out.println("Nama          : " + nama);
        System.out.println("Alamat        : " + alamat);
        System.out.println("No. Handphone : " + noHp);
        System.out.println("Gaji          : " + gaji);
        
        
    
    }
}
