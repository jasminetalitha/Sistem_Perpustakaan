package projectperpus;

public class Pengembalian {
    private String nama1;
    private String judul1;
    private int tgl_peminjam1;
    private int tgl_pengembalian;
    private int bulan_pengembalian;
    private int tahun_pengembalian;
    private int sewa;
    private int denda;
    private int total;


    //Construsctor
    public Pengembalian
    (String nama1, String judul1, int tgl_peminjam1, int tgl_pengembalian, int bulan_pengembalian, 
    int tahun_pengembalian, int sewa, int denda, int total)
    {
        this.nama1 = nama1;
        this.judul1 = judul1;
        this.tgl_peminjam1 = tgl_peminjam1;
        this.tgl_pengembalian = tgl_pengembalian;
        this.bulan_pengembalian = bulan_pengembalian;
        this.tahun_pengembalian = tahun_pengembalian;
        this.sewa = sewa;
        this.denda = denda;
        this.total = total;
    }

    //Setter
    public void setNama(String nama1){
        this.nama1 = nama1;
    }

    public void setJudul(String judul1){
        this.judul1 = judul1;
    }

    public void setPinjam(int tgl_peminjam1){
        this.tgl_peminjam1 = tgl_peminjam1;
    }

    public void setTanggal(int tgl_pengembalian){
        this.tgl_pengembalian = tgl_pengembalian;
    }

    public void setBulan(int bulan_pengembalian){
        this.bulan_pengembalian = bulan_pengembalian;
    }

    public void setTahun(int tahun_pengembalian){
        this.tahun_pengembalian = tahun_pengembalian;
    }

    public void setSewa(int sewa){
        this.sewa = sewa;
    }

    public void setDenda(int denda){
        this.denda = denda;
    }

    public void setTotal(int total){
        this.total = total;
    }

    //Getter
    public String getNama(){
        return nama1;
    }

    public String getJudul(){
        return judul1;
    }

    public int getTanggal(){
        return tgl_peminjam1;
    }

    public int getTanggal1(){
        return tgl_pengembalian;
    }
    
    public int getBulan(){
        return bulan_pengembalian;
    }
    
    public int getTahun(){
        return tahun_pengembalian;
    }

    public int getSewa(){
        return sewa;
    }

    public int getDenda(){
        return denda;
    }

    public int getTotal(){
        return total;
    }

    //toString
    public String toString(){
        return nama1+" Mengembalikan "+judul1+" Pada"+tgl_pengembalian+"-"+bulan_pengembalian+"-"+tahun_pengembalian+"-"+sewa+"-"
        +"-"+denda+"-"+total+"-";
    }

}

