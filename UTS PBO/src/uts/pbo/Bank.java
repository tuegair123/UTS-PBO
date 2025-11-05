package uts.pbo;
class AkunBank {
    private double saldo = 1000;
    protected String namaPemilik = "Tegarwbsn";
    public String namaBank = "BRI";
    
    void tampilkanSaldo(){
        System.out.println("Saldo saat ini      : RP." + saldo);
    }
}

class RekeningTabungan extends AkunBank {
    void infoRekening() {
        System.out.println("Nama Pemilik        : " + namaPemilik);
        System.out.println("Nama Bank           : " + namaBank);
    }
}

public class Bank {
    public static void main(String[] args) {
        RekeningTabungan rt = new RekeningTabungan();
        
        rt.infoRekening();
        rt.tampilkanSaldo();
    }
}