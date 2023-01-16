import java.util.Scanner;
public class Minuman extends Barang {
    protected int harga;
    protected String namaBarang;

    @Override
    void display() {
        System.out.println("================================================================");
        System.out.println("                       DAFTAR PEMESANAN OBAT  ");
        System.out.println("================================================================");
        System.out.println("NAMA MINUMAN        HARGA");
        System.out.println("1. Es Teh         Rp. 3.000");
        System.out.println("2. Es Jeruk       Rp. 3.000");
        System.out.println("3. Air Mineral    Rp. 3.000");
        System.out.println("4. Susu Milo      Rp. 5.000");
        System.out.println("5. Jus Jambu      Rp. 7.000");
        System.out.println("6. Jus Alpukat    Rp. 8.000");
        System.out.println("7. Jus Strawberry Rp. 8.000");
        pilihBarang();
    }

    @Override
    void pilihBarang() {
        System.out.println("Pilih Minuman :");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Pilihan Anda : ");
        int pilih = input.nextInt();
        switch (pilih){
            case 1 :
                System.out.println("Anda Memilih Es Teh ");
                Barang.namaBarang = "Es Teh ";
                Barang.harga = 3000;
                break;
            case 2 :
                System.out.println("Anda Memilih Es Jeruk");
                Barang.namaBarang = "Es Jeruk";
                Barang.harga = 3000;
                break;
            case 3 :
                System.out.println("Anda Memilih Air Mineral");
                Barang.namaBarang = "Air Mineral";
                Barang.harga = 3000;
                break;
            case 4 :
                System.out.println("Anda Memilih Susu Milo");
                Barang.namaBarang = "Susu Milo";
                Barang.harga = 5000;
                break;
            case 5 :
                System.out.println("Anda Memilih Jus Jambu ");
                Barang.namaBarang = "Jus Jambu ";
                Barang.harga = 7000;
                break;
            case 6 :
                System.out.println("Anda Memilih Jus Alpukat");
                Barang.namaBarang = "Jus Alpukat";
                Barang.harga = 8000;
                break;
            case 7 :
                System.out.println("Anda Memilih Jus Strawberry");
                Barang.namaBarang = "Jus Strawberry";
                Barang.harga = 8000;
                break;
        }
    }
}