/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119025.adhirafahrigathan.no1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        Age age = new Age(date.getYear());
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scanner.nextInt());

        System.out.println("\n=====Hasil Perhitungan Umur====" +
                "\nTahun lahir anda : "+age.getYearBirth()+
                "\nHari ini Tahun : "+age.getYearNow()+
                "\nUmur kamu sampai hari ini adalah "+age.hitungUmur()+" tahun" +
                "\nTandanya Kamu "+age.tandanyaKamu(age.hitungUmur()));

    }
}
