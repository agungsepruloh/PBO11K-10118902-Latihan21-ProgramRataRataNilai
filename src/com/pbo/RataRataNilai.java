package com.pbo;

import java.util.Locale;
import java.util.Scanner;

/*
 * #Author
 * Name  : Agung Sepruloh
 * Class : IF-11K
 * NIM   : 10118902
 * Deskripsi program: program ini menghitung nilai rata-rata mahasiswa sesuai dengan jumlah dan nilai dari input
 *
 */

public class RataRataNilai {

    public static void main(String[] args) {
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        Scanner scanner = new Scanner(System.in);
        int jumlahMahasiswa = scanner.nextInt();
        float totalNilai = 0;

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print(String.format("Nilai Mahasiswa ke-%d : ", i));
            Scanner scanner1 = new Scanner(System.in);
            float nilai = scanner.nextInt();
            totalNilai += nilai;
        }

        System.out.println(String.format(Locale.US,"Rata-rata nilainya adalah %.1f", totalNilai / jumlahMahasiswa));
    }
}