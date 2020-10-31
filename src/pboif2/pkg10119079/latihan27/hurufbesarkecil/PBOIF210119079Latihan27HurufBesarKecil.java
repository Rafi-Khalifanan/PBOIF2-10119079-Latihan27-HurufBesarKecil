package pboif2.pkg10119079.latihan27.hurufbesarkecil;

import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:   codingan mengubah huruf besar menjadi huruf kecil
 *
 */
public class PBOIF210119079Latihan27HurufBesarKecil {

    public static void main(String[] args) {
        
        String kalimat,a,b;
        
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        kalimat = input.next();
        System.out.println();
        a = kalimat.toUpperCase();
        b = kalimat.toLowerCase();

        System.out.println("====Hasil Formating====" );
        System.out.println("Huruf Besar : " + a);
        System.out.println("Huruf Kecil : " + b);
    }
    
}
