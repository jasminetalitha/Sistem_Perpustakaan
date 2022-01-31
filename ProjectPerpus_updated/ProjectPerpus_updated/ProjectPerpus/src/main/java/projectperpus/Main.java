/*
Cahyo Aji Nugroho
Jasmine Talitha Zahrani
Theresia Febriani Jesica Puri
Tito Budi Yanto
*/
package projectperpus;

import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {
        Buku[] buku = new Buku[10];
        Member[] member = new Member[4];
        Pinjam[] pinjam = new Pinjam[2];
        Pengembalian[] pengembalian = new Pengembalian[6];
        Scanner input = new Scanner(System.in);
        int menu = 0;
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        
        //Tampilan Menu
        while(menu != 8){
        System.out.println("\n------------------------------------------");            
        System.out.println("\t  Sistem Perpustakaan");
        System.out.println("------------------------------------------");        
        System.out.println("\t\t Menu\n");
        System.out.println("1. Masukkan Data Buku");
        System.out.println("2. Daftar Buku");
        System.out.println("3. Masukkan Data Member");
        System.out.println("4. Daftar Member");
        System.out.println("5. Peminjaman");
        System.out.println("6. Daftar Peminjam");
        System.out.println("7. Pengembalian Buku");
        System.out.println("8. Quit");
        System.out.println("\nMasukkan pilihan anda : ");
        menu = input.nextInt();
        input.nextLine();
        
        //condition
        //masukan data buku
        switch(menu){
            case 1:
                if(counter < 10){
                    System.out.println("Masukkan Judul Buku: ");
                    String judul = input.nextLine();
                    System.out.println("Masukkan nama Pengarang: ");
                    String pengarang = input.nextLine();
                    System.out.println("Masukkan tahun terbit buku: ");
                    int tahunTerbit = input.nextInt();
                    buku[counter] = new Buku(judul, pengarang, tahunTerbit);
                    counter++;
                }
                else{
                    System.out.println("Data buku penuh");
                }
            break;
           
            //melihat daftar buku 
            case 2:
                System.out.println("\n------------------------------------------");
                System.out.println("\t\tDaftar Buku");
                System.out.println("------------------------------------------\n");  
                for (int i=0; i < counter; i++){
                    System.out.println(buku[i].toString());
                }
            break;
            
            //masukan data member 
            case 3:
                if (counter1 < 4){
                    System.out.println("\n------------------------------------------");
                    System.out.println("\t\tInput Member");
                    System.out.println("------------------------------------------");                    
                    System.out.println("Masukkan NIM member: ");
                    int nim = input.nextInt();
                    input.nextLine();
                    System.out.println("Masukkan nama member: ");
                    String nama = input.nextLine();
                    System.out.println("Masukkan jurusan member: ");
                    String jurusan = input.nextLine();
                    member[counter1] = new Member(nim, nama, jurusan);
                    counter1++;
                }
                else{
                    System.out.println("Data member penuh");
                }
            break;
            
            //melihat daftar member
            case 4:
                System.out.println("\n------------------------------------------");
                System.out.println("\t\tDaftar Member");
                System.out.println("------------------------------------------\n");  
                for (int i=0; i < counter1; i++){
                    System.out.println((i+1)+". "+member[i].toString());
                }
            break;
            
            //masukan data peminjam
            case 5:
                System.out.println("\n------------------------------------------");
                System.out.println("\t\tInput Peminjaman");
                System.out.println("------------------------------------------\n");  
                System.out.println("Masukkan nama peminjam: ");
                String nama = input.nextLine();
                System.out.println("Masukkan Judul Buku: ");
                String judul = input.nextLine();
                System.out.println("Masukkan tanggal peminjaman: ");
                int tgl_peminjam = input.nextInt();
                System.out.println("Masukkan bulan peminjaman: ");
                int bulan_peminjam = input.nextInt();
                System.out.println("Masukkan tahun peminjaman: ");
                int tahun_peminjam = input.nextInt();
                pinjam[counter2] = new Pinjam(nama, judul, tgl_peminjam, bulan_peminjam, tahun_peminjam);
                counter2++;
            break;
            
            //melihat data peminjam
            case 6:
                System.out.println("\n------------------------------------------");
                System.out.println("\t\tDaftar Peminjam");
                System.out.println("------------------------------------------\n");  
                for (int i=0; i < counter2; i++){
                    System.out.println((i+1)+". "+pinjam[i].toString());
                }
            break;
            
            //pengembalian buku
            case 7:   
                System.out.println("\n------------------------------------------");
                System.out.println("\n            Pengembalian Buku");
                System.out.println("\n------------------------------------------");
                System.out.println("Masukan Nama Peminjam");
                String nama1 = input.nextLine();
                System.out.println("judul Buku yang ingin di kembalikan: ");
                String judul1 = input.nextLine();
                System.out.println("Masukan Tanggal Pinjam: ");
                int tgl_peminjam1 = input.nextInt();
                System.out.println("Masukan tanggal sekarang: ");
                int tgl_pengembalian = input.nextInt();
                System.out.println("Masukan Bulan sekarang: ");
                int bulan_pengembalian = input.nextInt();
                System.out.println("Masukan Tahun sekarang: ");
                int tahun_pengembalian = input.nextInt();

            //DENDA
            int denda=(tgl_pengembalian-tgl_peminjam1-5)*2000;  
            if(tgl_pengembalian<=tgl_peminjam1+5)
            {
                System.out.println("\n------------------------------------------");
                System.out.println("Nama                 : "+nama1);
                System.out.println("Mengembalikan Buku   : "+judul1);
                System.out.println("Tanggal Pinjam       : "+tgl_peminjam1);
                System.out.println("Tanggal Pengembalian : "+tgl_pengembalian);
                System.out.println("Denda                : Tidak ada denda");
            }
            else
            {
                System.out.println("\n------------------------------------------");
                System.out.println("Nama                 : "+nama1);
                System.out.println("Mengembalikan Buku   : "+judul1);
                System.out.println("Tanggal Pinjam       : "+tgl_peminjam1);
                System.out.println("Tanggal Pengembalian : "+tgl_pengembalian);
                System.out.println("Denda anda sebesar   : Rp "+denda);
            }

            //SEWA
            int sewa=(tgl_pengembalian-tgl_peminjam1)*5000;
                System.out.println("Biaya sewa anda      : Rp "+sewa);

            //TOTAL
            int total=(sewa+denda);
            if(denda>0)
            {
                total=sewa+denda;
                System.out.println("Total harus bayar    : Rp "+total);
            }

            else if(denda<0)
            {
                total=total-denda;                
                System.out.println("Total harus bayar    : Rp "+sewa);
            }
            
            pengembalian[counter3] = new Pengembalian
            (nama1, judul1, tgl_pengembalian, tgl_peminjam1, bulan_pengembalian, tahun_pengembalian, sewa, denda, total);
            counter3++;
            break;
            

            //keluar dari program
            case 8: 
                System.out.println("\nAnda telah keluar.");
                System.exit(0);

            //input salah 
            default: System.out.println("\nInput anda salah!!");
            break;
            }
        }
    }
}


