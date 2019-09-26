/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan2.deklarasivariabel;

/**
 *
 * @author USER
 * NAMA   : Rycho Rantung
 * KELAS  : IF-1
 * NIM    : 10118005
 * Deskripsi Program : Program ini berisi program untuk menampilkan deklarasi variabel dan pengaksesannya
 */
public class IF110118005Latihan2DeklarasiVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Deklarasi Variabel
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        
        //memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menampilkan Hasil
        System.out.println();
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel logika = " + nilaiLogika);
        System.out.println("Isi variabel karakter = " + nilaiKarakter);
    }
    
}
