package pujasera;

import java.util.ArrayList;
import java.util.Scanner;

public class Pujasera {  
    private String warung;
    private String Menu;
    private int jumlah;
    private int harga;
    
    public Pujasera(String vmenu, int vjumlah, int vharga){
        this.Menu = vmenu;
        this.jumlah = vjumlah;
        this.harga = vharga;
    }
    
    public void setMenu(String vmenu){
        this.Menu = vmenu;
    }
    
    public String getMenu(){
        return Menu;
    }
       
    public void setJumlah(int vjumlah){
        this.jumlah = vjumlah;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
    public void setHarga(int vharga){
        this.harga = vharga;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public int hitungtotal(){
        return harga * jumlah;
    }
    
}
