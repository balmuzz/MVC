/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class latihan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer abc = new StringBuffer("Saya Suka Belajar Java");
        System.out.println("Panjang data StringBuffer:"+abc.length());
        System.out.println("Penggantian data StringBuffer:"+abc.replace(0,4,"kami"));
        System.out.println("Sub-String:"+abc.indexOf("a"));
        System.out.println("Sub-String:"+abc.charAt(2));
        System.out.println("Sub-String:"+abc.deleteCharAt(2));
         
        //panjang sebuah string baffer bisa di ubah, data yang ada tidak hilang
        //jika perubahan ukuran lebih panjang
        //berbeda dengan string, data menjadi hilang karena mengadopsi konsep array
        
        abc.setLength(60);
        System.out.println("panjang data StringBuffer:"+abc.length());
        System.out.println("panjang data StringBuffer:"+abc);
                                                                             
        
    }
    
}
