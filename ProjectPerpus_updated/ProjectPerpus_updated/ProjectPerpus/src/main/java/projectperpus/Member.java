/*
Cahyo Aji Nugroho
Jasmine Talitha Zahrani
Theresia Febriani Jesica Puri
Tito Budi Yanto
*/
package projectperpus;

public class Member {
    private int nim;
    private String nama;
    private String jurusan;
    
    //Construct
    public Member(int nim, String nama, String jurusan){
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }
    
    //Setter
    public void setNim(int nim){
        this.nim = nim;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    
    //Getter
    public int getNim(){
        return nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getJurusan(){
        return jurusan;
    }
    
    //toString
    public String toString(){
        return nim+" "+nama+" jurusan "+jurusan;
    }
}
