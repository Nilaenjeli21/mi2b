package Pertemuan1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nila Enjeli
 */
public class Pendaftaran {
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
}
}