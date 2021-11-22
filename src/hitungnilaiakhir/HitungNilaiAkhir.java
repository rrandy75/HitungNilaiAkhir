/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungnilaiakhir;

/**
 *
 * @author rezky randy
 */
import java.util.Scanner;
public class HitungNilaiAkhir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        String Nama,Nim;
        Scanner keyboard = new Scanner(System.in);
        double nilai,UTS, UAS;
        Scanner sc = new Scanner(System.in);
        // INPUT NILAI UTS DAN UAS 
       
        System.out.print("Masukkan Nama = ");
        Nama = keyboard.nextLine();
        System.out.print("Masukkan Nim = ");
        Nim = keyboard.nextLine();
        System.out.println("---------------------------");
        System.out.print("Masukkan nilai UTS = ");
        UTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS = ");
        UAS = sc.nextDouble();
        System.out.println("---------------------------");
        System.out.println("Nama :" + Nama);
        System.out.println("Nim :" + Nim);

        // RUMUS menghitung NILAI
        //Nilai UTS 50%,UAS 50%
        nilai = (((50 * UTS) + (50 * UAS))) / 100;
        //KETENTUAN Grade hasil dari perhitungan rumus menghitug NILAI
               if (nilai >= 80 && nilai <= 100) {//jika nilai antara 80-100 maka grade A
            System.out.println("Grade = A");
        } else if (nilai < 80 && nilai > 75) {//jika nilai dibawah 80 dan di atas 75 maka grade B
            System.out.println("Grade = B ");
        } else if (nilai < 75 && nilai > 65) {//jika nilai dibawah 75 dan di atas 65 maka grade C
            System.out.println("Grade = C ");
        } else if (nilai < 65 && nilai > 50) {//jika nilai dibawah 65 dan di atas 50 maka grade D
            System.out.println("Grade = D "); 
        }else if (nilai < 50 && nilai >-1) {//jika nilai dibawah 50 dan di atas 0 maka grade E
            System.out.println("Grade = E ");
        }
               
        if (nilai > 65 && nilai < 100) {
            System.out.println("Selamat Anda Lulus ");
        }else if (nilai < 65 && nilai > 50){
            System.out.println("Maaf Nilai Anda Masih Kurang ");
        }else if (nilai < 50 && nilai >-1){
            System.out.println("Maaf Anda Belum Lulus ");
        }else {
            System.out.println("Maaf Nilai Tidak Valid ");
        }
  
}
}
