public class User {
    private Mesin mesin;
    public User(Mesin mesin){
        this.mesin = mesin;
    }
    void pililhBarang(){
        this.mesin.pilih();
    }
    void masukUang(){
        this.mesin.Uang();
    }
    void uangKembali(){
        this.mesin.kembalian();
    }

    void cetakStruk(){
        this.mesin.struk();
    }

    public void pilihBarang() {
        this.mesin.pilih();
    }
}