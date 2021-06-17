package com.Konsep;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int nilai,nilai1,nilai2,nilai3,nilai4,nilai5,nilai6, hasil,hasil1,hasil2,hasil3,hasil4,hasil5,hasil6;


        //Array
        double[] y = new double[7];
        y[0] = 0.4;
        y[1] = 0.1;
        y[2] = 0.3;
        y[3] = 0.05;
        y[4] = 0.05;
        y[5] = 0.08;
        y[6] = 0.02;

        System.out.print("Nama: ");
        String nama = String.valueOf(bf.readLine());
        System.out.print("Pendapatan: Rp");
        double pendapatan = Double.parseDouble(bf.readLine());

        double simpanan = 0.4;
        double dana  = 0.1;
        double pengeluaran = 0.3;
        double invest = 0.05;
        double asuransi = 0.05;
        double rencana = 0.08;
        double hiburan = 0.02;

        nilai = (int) (simpanan * pendapatan);
        hasil = (int) (pendapatan - nilai);

        nilai1 = (int) (dana * hasil);
        hasil1 = hasil - nilai1;

        nilai2 = (int) (pengeluaran * hasil1);
        hasil2 = hasil1 - nilai2;

        nilai3 = (int) (invest * hasil2);
        hasil3 = hasil2 - nilai3;

        nilai4 = (int) (asuransi * hasil3);
        hasil4 = hasil3 - nilai4;

        nilai5 = (int) (rencana * hasil4);
        hasil5 = hasil4 - nilai5;

        nilai6 = (int) (hiburan * hasil5);
        hasil6 = hasil5 - nilai6;

        System.out.println("Simpanan: " + hasil);
        System.out.println("Dana Cadangan: "+ hasil1);
        System.out.println("Pengeluaran: " + hasil2);
        System.out.println("Investasi: " + hasil3);
        System.out.println("Asuransi: " + hasil4);
        System.out.println("Rencana: " + hasil5);
        System.out.println("Hiburan: " + hasil6);



//        System.out.println("Simpanan: ");
//        double simpanan = Double.parseDouble(bf.readLine());
//        System.out.println("Dana Cadangan: ");
//        double dana = Double.parseDouble(bf.readLine());
//        System.out.println("Pengeluaran: ");
//        double pengeluaran = Double.parseDouble(bf.readLine());
//        System.out.println("invest: ");
//        double invest = Double.parseDouble(bf.readLine());
//        System.out.println("asuransi: ");
//        double asuransi = Double.parseDouble(bf.readLine());
//        System.out.println("rencana: ");
//        double rencana = Double.parseDouble(bf.readLine());
//        System.out.println("hiburan: ");
//        double hiburan = Double.parseDouble(bf.readLine());

       // nilai = (simpanan * y[0]) + (dana* y[1]) + (pengeluaran * y[2] + (invest * y[3]) + (asuransi * y[4]) + (rencana * y[5]) + (hiburan * y[6]));


 //       System.out.println("Hasil: " + nilai);
    }
}
