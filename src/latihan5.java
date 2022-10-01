/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class latihan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String abc = new String("Saya Suka Belajar Java");
        System.out.println("Panjang data String;"+abc.length());
        System.out.println("Penggabungan data String:"+abc.concat(" di LABKOM UBL"));
        System.out.println("Perbandingan data String abc dengan data:"+abc.equals("saya suka uang"));
        System.out.println("Perbandingan data String abc dengan data:"+abc.equals("Saya Suka Belajar Java"));
        System.out.println("Pergantian data  String untuk Karakter:"+abc.replace('S','D'));
        System.out.println("Pergantian data String untuk semua kata:"+abc.replaceAll("Saya Suka Belajar Java","Kami Senang Belajar"));
        System.out.println("Pergantian data String untuk 1 kata dalam kalimat:"+abc.replaceFirst("Saya","Kami"));
        System.out.println("Kapitalisme data String (menjadi huruf kecil semua):"+abc.toLowerCase());
        System.out.println("Kapitalisme data String (menjadi huruf besar semua):"+abc.toUpperCase());
        System.out.println("Sub String data String mulai dari huruf ke 5:"+abc.substring(5));
        System.out.println("Sub String data String mulai dari huruf ke 5 sampai huruf ke 9:"+abc.substring(5,9));
        System.out.println("Operasi Character mengambil huruf ke 5: "+abc.charAt(2));
        System.out.println("Operasi Character : "+abc.toCharArray());
        System.out.println("Konversi:"+String.valueOf(abc));
        System.out.println("Konversi:"+abc.toString());
        
        
        
        
        
        
    }
    
}
