import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mesin mesin = new VendingMachine();
        User user = new User(mesin);

        Scanner input = new Scanner(System.in);
        String aksi;

        while(true) {
            System.out.println("\n==================================================================");
            System.out.println("                         SELAMAT DATANG DI                          ");
            System.out.println("         SISTEM APLIKASI KANTIN UNIVERSITAS AHMAD DAHLAN            ");
            System.out.println("====================================================================");
            user.pililhBarang();
            user.masukUang();

            user.uangKembali();
            System.out.println("Lanjut atau keluar y/t");

            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("t")) {
                user.pilihBarang();
                user.cetakStruk();
                System.exit(0);
            } else {
                System.out.println(" ");
            }
        }
    }
}