/*
Cahyo Aji Nugroho
Jasmine Talitha Zahrani
Theresia Febriani Jesica Puri
Tito Budi Yanto
*/
package projectperpus;

public class Pinjam {
    private String judul;
    private String nama;
    private int biayaSewa = 5000;   
    private int denda = 2000;
    private int tgl_pinjam;
    private int bulan_pinjam;
    private int tahun_pinjam;
    
    
    //Construsctor
    public Pinjam(String nama, String judul, int tgl_pinjam, int bulan_pinjam, int tahun_pinjam){
        this.nama = nama;
        this.judul = judul;
        this.tgl_pinjam = tgl_pinjam;
        this.bulan_pinjam = bulan_pinjam;
        this.tahun_pinjam = tahun_pinjam;
    }
    
    //Setter
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setJudul(String judul){
        this.judul = judul;
    }
    
    public void setTanggal(int tgl_pinjam){
        this.tgl_pinjam = tgl_pinjam;
    }
    
    public void setBulan(int bulan_pinjam){
        this.bulan_pinjam = bulan_pinjam;
    }
    
    public void setTahun(int tahun_pinjam){
        this.tahun_pinjam = tahun_pinjam;
    }
    
    //Getter
    public String getNama(){
        return nama;
    }
    
    public String getJudul(){
        return judul;
    }
    
    public int getTanggal(){
        return tgl_pinjam;
    }
    
    public int getBulan(){
        return bulan_pinjam;
    }
    
    public int getTahun(){
        return tahun_pinjam;
    }

    //toString
    public String toString(){
        return nama+" meminjam buku"+judul+" Pada "+tgl_pinjam+"-"+bulan_pinjam+"-"+tahun_pinjam+
                " dengan biaya sewa per hari "+biayaSewa+" apa bila melebihi 5 hari maka denda per hari sebesar "+denda;
    }
    
}
