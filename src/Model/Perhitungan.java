package Model;

import Interface.ContohInterface;

public class Perhitungan implements ContohInterface {
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int _a, int _b, int _hasil) {
        this.a = _a;
        this.b = _b;
        _hasil = 0;
        this.hasil = _hasil;
        printJudulClass("Print Judul dalam Class Perhitungan");
    }

    private void printJudulClass(String jdl) {
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        // TODO Auto-generated method stub

    }

    @Override
    public void HitungTambah() {
        // TODO Auto-generated method stub
        this.hasil = this.a + this.b;
    }

    @Override
    public void HitungKali() {
        // TODO Auto-generated method stub
        this.hasil = this.a * this.b;
    }

    public int HasilTmbh(int x1, int y1) {
        this.a = x1;
        this.b = y1;
        HitungTambah();
        return this.hasil;
    }

    public int HasilKali(int c2, int d2) {
        this.a = c2;
        this.b = d2;
        HitungKali();
        return this.hasil;
    }
}
