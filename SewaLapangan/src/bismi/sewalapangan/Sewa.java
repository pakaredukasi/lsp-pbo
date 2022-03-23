/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bismi.sewalapangan;

/**
 *
 * @author bismi
 */
public class Sewa {

    private int lapangan, jenis, waktu,
            tambahan, hrgLapangan, hrgTambahan,
            total, uangBayar, kembalian;
    private String keluar, nama, txtLapangan,
            txtJenis, txtTambahan;

    public int getLapangan() {
        return lapangan;
    }

    public void setLapangan(int lapangan) {
        this.lapangan = lapangan;
    }

    public int getJenis() {
        return jenis;
    }

    public void setJenis(int jenis) {
        this.jenis = jenis;
    }

    public int getWaktu() {
        return waktu;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }

    public int getTambahan() {
        return tambahan;
    }

    public void setTambahan(int tambahan) {
        this.tambahan = tambahan;
    }

    public String getKeluar() {
        return keluar;
    }

    public void setKeluar(String keluar) {
        this.keluar = keluar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHrgLapangan() {
        if (lapangan == 1) {
            switch (jenis) {
                case 1:
                    hrgLapangan = 300000;
                    break;
                case 2:
                    hrgLapangan = 250000;
                    break;
                case 3:
                    hrgLapangan = 200000;
                    break;
                default:
                    throw new AssertionError();
            }
        } else {
            switch (jenis) {
                case 1:
                    hrgLapangan = 250000;
                    break;
                case 2:
                    hrgLapangan = 200000;
                    break;
                case 3:
                    hrgLapangan = 150000;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        hrgLapangan = hrgLapangan*waktu;
        return hrgLapangan;
    }

    public int getHrgTambahan() {
        switch (tambahan) {
            case 1:
                hrgTambahan = 50000*waktu;
                break;
            case 2:
                hrgTambahan = 45000*waktu;
                break;
            case 3:
                hrgTambahan = 95000*waktu;
                break;
            case 4:
                hrgTambahan = 0*waktu;
                break;
            default:
                throw new AssertionError();
        }
        return hrgTambahan;
    }

    public int getTotal() {
        total = hrgLapangan+hrgTambahan;
        return total;
    }

    public int getUangBayar() {
        return uangBayar;
    }

    public void setUangBayar(int uangBayar) {
        this.uangBayar = uangBayar;
    }

    public int getKembalian() {
        kembalian = uangBayar - total;
        return kembalian;
    }

    public String getTxtLapangan() {
        switch (lapangan) {
            case 1:
                txtLapangan = "Indoor";
                break;
            case 2:
                txtLapangan = "Outdoor";
                break;
            default:
                throw new AssertionError();
        }
        return txtLapangan;
    }

    public String getTxtJenis() {
        switch (jenis) {
            case 1:
                txtJenis = "Reguler";
                break;
            case 2:
                txtJenis = "Matras";
                break;
            case 3:
                txtJenis = "Rumput";
                break;
            default:
                throw new AssertionError();
        }
        return txtJenis;
    }

    public String getTxtTambahan() {
        switch (tambahan) {
            case 1:
                txtTambahan = "Sepatu";
                break;
            case 2:
                txtTambahan = "Kostum";
                break;
            case 3:
                txtTambahan = "Sepatu dan Kostum";
                break;
            case 4:
                txtTambahan = "Tidak ada";
                break;
            default:
                throw new AssertionError();
        }
        return txtTambahan;
    }
}
