import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class VendingMachine implements Mesin {
    protected int uang;
    protected int kembali;

    @Override
    public void pilih() {
        Scanner in = new Scanner(System.in);
        System.out.println("Silahkan Pilih Pesanan Anda..... ");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Masukan Pilihan Anda : ");
        int pilih = in.nextInt();

        switch(pilih){
            case 1 :
                Barang makan = new Makanan();
                makan.display();
                break;
            case 2 :
                Barang minum = new Minuman();
                minum.display();
                break;
        }
    }
    @Override
    public void Uang() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Uang Anda : ");
        uang = in.nextInt();
        this.uang = uang;
    }


    @Override
    public void kembalian() {
        System.out.print("Kembalian anda : ");
        System.out.println(hitungKembali(uang, Barang.harga));
    }

    public int hitungKembali(int uang, int harga ){
        kembali=uang-harga;
        return (int) kembali;
    }
    public void struk() {
        File file = new File("Struk.txt");
        PrintWriter output;
        {
            try {
                output = new PrintWriter(file);
                output.println("\n||==================================================================||");
                output.println("||                      APLIKASI MESIN KANTIN                         ||");
                output.println("||==================================================================||");
                Scanner in = new Scanner(System.in);

                output.println("JENIS BARANG                       HARGA                     KEMBALIAN");
                output.println("======================================================================");
                output.println("\t" + Barang.namaBarang + "\t\t"   + Barang.harga + "\t\t"   + kembali );
                output.println("======================================================================");
                output.println("Uang Anda   : " + uang);
                output.println("======================================================================");
                output.close();

                System.out.println("Pemesanan Berhasil Struk Tercetak 'Struk.txt' ");
            } catch (FileNotFoundException e) {
                System.out.println("Pemesanan Gagal !");
                throw new RuntimeException(e);
            }
        }
    }
}