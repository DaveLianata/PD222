package Tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IPS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float b_indo, mat, diti, lap, stat, odm;

        int sks;


        System.out.println("Masukkan nilai SKS / mata kuliah :");
        sks = Integer.parseInt(br.readLine());
        System.out.println("Masukkan nilai Bahasa Indonesia :");
        b_indo = Float.parseFloat(br.readLine());
        System.out.println("Masukkan nilai Organisasi dan Manajemen :");
        odm = Float.parseFloat(br.readLine());
        System.out.println("Masukkan nilai Statistika dan Probabilitas :");
        stat = Float.parseFloat(br.readLine());
        System.out.println("Masukkan nilai Logika dan Algoritma pemrograman :");
        lap = Float.parseFloat(br.readLine());
        System.out.println("Masukkan nilai Matematika Dasar :");
        mat = Float.parseFloat(br.readLine());
        System.out.println("Masukkan nilai Dasar Infrastruktur Teknologi Informasi :");
        diti = Float.parseFloat(br.readLine());

        float ips = ((b_indo * sks) + (odm * sks) + (stat * sks) + (lap * sks) + (mat * sks) + (diti * sks)) / 18;
        System.out.print("IPS semester ini adalah " + ips);

        System.out.println("\nJumlah SKS yang dapat diambil semester depan adalah :");

        if ( ips >= 3.5){
            System.out.println("24 SKS ");
        }else if ( ips >= 3.00 && ips <= 3.49) {
            System.out.println("22 SKS ");
        } else if (ips >= 2.00 && ips <= 2.99) {
            System.out.println("20 SKS ");
        } else if (ips <= 2.00) {
            System.out.println("18 SKS ");

        }

    }


    }

