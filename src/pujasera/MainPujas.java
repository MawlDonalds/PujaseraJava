package pujasera;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPujas {
    public static void main(String[] args){  
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Bi Oneng");
        System.out.println("2. Pak Yitno");
        System.out.println("3. Pak De");
        System.out.print("Pilih Warung : ");
        int warung = scanner.nextInt();
        scanner.nextLine();
        
        MainPujas mainpujas = new MainPujas();
        switch (warung) {
            case 1:
                System.out.println("\nWarung Bi Oneng");
                mainpujas.menus("Warung Buoneng");
                break;
            case 2:
                System.out.println("\nWarung Pak Yitno");
                mainpujas.menus("Warung Pak Yitno");
                break;
            case 3:
                System.out.println("\nWarung Pakde");
                mainpujas.menus("Warung Pakde");
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void menus(String namawarung) {
        MainPujas mainpujas = new MainPujas();
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Pujasera> daftarmenu = new ArrayList<>();
            int totalKeseluruhan = 0;
            while (true) {
                System.out.print("Masukan Nama Menu: ");
                String vmenu = scanner.nextLine();
                System.out.print("Masukan harga : ");
                int vharga = scanner.nextInt();
                System.out.print("Masukan Jumlah :");
                int vjumlah = scanner.nextInt();
                scanner.nextLine();
                
                Pujasera pujas = new Pujasera(vmenu,vharga,vjumlah);
                daftarmenu.add(pujas);
                
                totalKeseluruhan += pujas.hitungtotal();
                
                System.out.print("Apakah anda ingin menambah Menu? [y/n]:" );
                String jawaban = scanner.nextLine();
                if(jawaban.equalsIgnoreCase("n")){
                    break;
                }
            }
            System.out.println("\nDetail Pembelian di " + namawarung + " :");
            for (Pujasera pujasera : daftarmenu) {
                System.out.println("Nama: "+pujasera.getMenu() + " \nJumlah:"+pujasera.getJumlah() + " \nHarga:"+pujasera.getHarga() 
                        + " \nTotal: RP."+pujasera.hitungtotal());
            }
            System.out.println("Total Harga : "+ totalKeseluruhan);
            System.out.print("Bayar : ");
            int bayar = scanner.nextInt();
            int kembalian =0;
            
            if (bayar > totalKeseluruhan) {
                 kembalian = bayar - totalKeseluruhan;
            }else{
                System.out.println("uang tidak cukup Tidak bisa ngutang");
                System.out.print("Bayar : ");
                bayar = scanner.nextInt();
                kembalian = bayar - totalKeseluruhan;        
            }
           
            System.out.println("Uang anda : "+bayar);
            System.out.println("Kembalian : "+kembalian);
        }
    }
}
