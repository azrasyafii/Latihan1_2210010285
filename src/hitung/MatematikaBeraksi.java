
package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika azra = new Matematika(8,5);
        
        System.out.println("Hasil Penjumlahan: "+azra.setPenjumlahan());
        System.out.println("Hasil Pengurangan: "+azra.setPengurangan());
        System.out.println("Hasil Perkalian: "+azra.setPerkalian());
        System.out.println("Hasil Pembagian: "+azra.setPembagian());
        
    }
}
