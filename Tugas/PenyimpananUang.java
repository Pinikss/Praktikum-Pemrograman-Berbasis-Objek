/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author HP
 */
public class PenyimpananUang extends Tabungan {
    private double tingkatBunga;

    public PenyimpananUang(int saldo, double tingkatBunga) {
        super(saldo);
        this.tingkatBunga = tingkatBunga;
    }
    
     public double cekUang() {
        return saldo + (saldo * tingkatBunga);
    }
}
