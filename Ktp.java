/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author mnasrulloh
 */
public class Ktp {
    private String nik;
    private String nama;
    protected String tempatTanggalLahir;
    private String jenisKelamin;
    private String alamat;
    private String rtRw;
    private String kelurahanDesa;
    private String kecamatan;
    private String agama;
    private String status;
    private String pekerjaan;
    public String kewarganegaraan;
    protected String berlakuHingga;

    public Ktp(String nik, String nama, String tempatTanggalLahir, String jenisKelamin, String alamat, String rtRw, String kelurahanDesa, String kecamatan, String agama, String statusNikah, String pekerjaan, String kewarganegaraan, String berlakuHingga) {
        this.nik = nik;
        this.nama = nama;
        this.tempatTanggalLahir = tempatTanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.rtRw = rtRw;
        this.kelurahanDesa = kelurahanDesa;
        this.kecamatan = kecamatan;
        this.agama = agama;
        this.status = statusNikah;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
        this.berlakuHingga = berlakuHingga;
    }

    public void tampilkanData() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Tempat/Tanggal Lahir: " + tempatTanggalLahir);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: "); //+ alamat
        System.out.println("RT/RW: " + rtRw);
        System.out.println("Kelurahan/Desa: " + kelurahanDesa);
        System.out.println("Kecamatan: " + kecamatan);
        System.out.println("Agama: " + agama);
        System.out.println("Status Nikah: " + status);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Kewarganegaraan: " + kewarganegaraan);
        System.out.println("Berlaku Hingga: " + berlakuHingga);
    }

    public void tambahData() {
        System.out.println("============================");
        System.out.println("Menambahkan data ...");
    }

    public void ubahData() {
        System.out.println("Mengubah data ...");
    }

    public void hapusData() {
        System.out.println("Menghapus data ...");
    }

    public static void main(String[] args) {
        Ktp penduduk = new Ktp("1234567890123456", "Zhai Xiao", "Purwokerto, 23 November 2004", "Laki-laki", "Jl. Merdeka No. 10", "001/002", "Purwokerto Selatan", "Banyumas", "Islam", "Belum Menikah", "Bos BUMN", "Indonesia", "Seumur Hidup");
        penduduk.tampilkanData();
        penduduk.tambahData();
        penduduk.ubahData();
        penduduk.hapusData();
    }
}

