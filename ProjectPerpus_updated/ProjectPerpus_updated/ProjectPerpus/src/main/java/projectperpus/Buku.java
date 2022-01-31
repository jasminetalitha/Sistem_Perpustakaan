/*
Cahyo Aji Nugroho
Jasmine Talitha Zahrani
Theresia Febriani Jesica Puri
Tito Budi Yanto
*/
package projectperpus;

public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    
    
    //Constructornya
    public Buku(String judul, String pengarang, int tahunTerbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    
    //Setter
    public void setJudul(String judul){
        this.judul=judul;
    }
    
    public void setPengarang(String pengarang){
        this.pengarang=pengarang;
    }
    
    public void setTahunTerbit(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }
    
    //Getter
    public String getJudul(){
        return judul;
    }
    
    public String getPengarang(){
        return pengarang;
    }
    
    public int getTahunTerbit(){
        return tahunTerbit;
    }
    
    //toString
    public String toString(){
        return "Buku "+ judul + " karya "+ pengarang +" "+ tahunTerbit;
    }
}
