import java.util.Scanner;
public class Makanan extends Minuman {
    protected int harga;
    protected String namaBarang;

    @Override
    void display() {
        System.out.println("================================================================");
        System.out.println("                       DAFTAR NAMA MAKANAN                      ");
        System.out.println("================================================================");
        System.out.println("NAMA MAKANAN :       ");
        System.out.println("1. NASI AYAM GEPREK");
        System.out.println("2. NASI UDUK AYAM GORENG");
        System.out.println("3. NASI PUTIH SAMBEL AYAM GORENG");
        System.out.println("4. SOTO");
        System.out.println("5. BAKSO ");
        System.out.println("6. MIE AYAM ");
        pilihBarang();
    }

    @Override
    void pilihBarang() {
        System.out.println("Pilih Makanan ");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Pilihan Anda : ");
        int pilih = input.nextInt();
        switch (pilih){
            case 1 :
                System.out.println("NASI AYAM GEPREK");
                Barang.namaBarang = "NASI AYAM GEPREK ";
                Barang.harga = 15000;
                break;
            case 2 :
                System.out.println("NASI UDUK AYAM GORENG");
                Barang.namaBarang = "NASI UDUK AYAM GORENG";
                Barang.harga = 13000;
                break;
            case 3 :
                System.out.println("NASI PUTIH SAMBEL AYAM GORENG");
                Barang.namaBarang = "NASI PUTIH SAMBEL AYAM GORENG\"";
                Barang.harga = 10000;
                break;
            case 4 :
                System.out.println("SOTO)");
                Barang.namaBarang = "SOTO";
                Barang.harga = 10000;
                break;
            case 5 :
                System.out.println("BAKSO");
                Barang.namaBarang = "BAKSO";
                Barang.harga = 10000;
                break;
            case 6 :
                System.out.println("MIE AYAM");
                Barang.namaBarang = "MIE AYAM";
                Barang.harga = 8000;
                break;
        }
    }
}