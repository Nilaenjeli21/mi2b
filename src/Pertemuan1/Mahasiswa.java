package Pertemuan1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nila Enjeni
 */
public class Mahasiswa {
    String nama,nobp,kelas,prodi,jurusan;
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama ="Nila";
        mhs.nobp ="2101092012";
        mhs.kelas ="B";
        mhs.prodi ="MI";
        mhs.jurusan ="Teknologi Informasi";
        
        System.out.println("Nama : "+mhs.nama+"\n"
        +"NO BP   : "+mhs.nobp+"\n"
        +"Jurusan : "+mhs.jurusan+"\n"
        +"Prodi   : "+mhs.prodi+"\n"
        +"kelas   : "+mhs.kelas);
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama ="Rahmitul Hasanah";
        mhs2.nobp ="2101092016";
        mhs2.kelas ="B";
        mhs2.prodi ="MI";
        mhs2.jurusan ="Teknologi Informasi";
        
        System.out.println("\n");
        System.out.println("Nama : "+mhs2.nama+"\n"
        +"NO BP   : "+mhs2.nobp+"\n"
        +"Jurusan : "+mhs2.jurusan+"\n"
        +"Prodi   : "+mhs2.prodi+"\n"
        +"kelas   : "+mhs2.kelas);
        
        
        
       
    }
}
