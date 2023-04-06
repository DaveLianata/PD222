package Latihan_pengulangan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        System.out.println(" Masukkan jumlah baris :");
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i  < n ; i++) {
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }


    }
}
