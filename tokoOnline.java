import java.util.Scanner;

import Model.barang;

public class tokoOnline {

    private static void print(){
        System.out.println(
            "========= TokoPed Online =========="+"\n"+
            "==================================="+"\n"+
            "1. Kecap"+"\n"+
            "2. Minyak Goreng"+"\n"+
            "3. Daging"+"\n"+
            "4. Ikan");
    }
    public static void main(String[] args) {
        barang Kecap = new barang("kecap.img","Kecap", "Kecap adalah manis-manis", 2000, "Malika", "Tersedia");

        barang MinyakGoreng = new barang("MinyakG.img","Minyak Goreng", "Minyak Goreng adalah untuk menggoreng", 28000, "Indonesia", "Tersedia");

        barang Daging = new barang("Daging.img","Daging", "Daging Sapi", 30000, "Solo", "Tersedia");

        barang Ikan = new barang("ikan.img","Ikan", "Ikan Mas", 5000, "Banyumas","Tersedia");

        for(int i=1; i<= 2; i++){
        print();

        String angka;
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih Barang : ");
        angka = input.nextLine();
     
        
        if (angka.equals("1")){
            Kecap.printbarang();
        }else if (angka.equals("2")){
            MinyakGoreng.printbarang();
        }else if (angka.equals("3")){
            Daging.printbarang();
        }else if (angka.equals("4")){
            Ikan.printbarang();
        }else {
            System.out.println("Masukkan Anda Benar Benar Salah!");;
        }
    }

            
    
    }    
}
