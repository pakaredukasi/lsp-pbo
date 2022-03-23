/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bismi.sewalapangan;

import java.util.Scanner;

/**
 *
 * @author bismi
 */
public class SewaLapangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kinput = new Scanner(System.in);
        int lapangan, jenis, waktu, tambahan, bayar;
        String keluar, nama, ulang;
        boolean jalan = true;

        while (jalan) {
            System.out.println("================"
                    + "Aplikasi Penyewaan Lapangan================");
            System.out.println("1. Lapangan Indoor");
            System.out.println("2. Lapangan Outdoor");
            System.out.println("3. Keluar");
            System.out.print("Pilih lapangan : ");
            lapangan = kinput.nextInt();
            if (lapangan == 3) {
                System.out.print("Apakah yakin ingin keluar? (y/n) : ");
                keluar = kinput.next();
                if (keluar.toLowerCase().equals("y")) {
                    System.exit(0);
                }
            }

            System.out.println("===========================================================");
            System.out.println("1. Reguler");
            System.out.println("2. Matras");
            System.out.println("3. Rumput");
            System.out.print("Pilih jenis lapangan : ");
            jenis = kinput.nextInt();

            System.out.println("===========================================================");
            System.out.print("Lama sewa (jam) : ");
            waktu = kinput.nextInt();

            System.out.println("===========================================================");
            System.out.println("1. Sepatu");
            System.out.println("2. Kostum");
            System.out.println("3. Sepatu dan Kostum");
            System.out.println("4. Tidak ada tambahan");
            System.out.print("Pilih tambahan sewa : ");
            tambahan = kinput.nextInt();

            System.out.println("===========================================================");
            System.out.print("Nama penyewa : ");
            nama = kinput.next();

            Sewa sewa = new Sewa();
            sewa.setNama(nama);
            sewa.setWaktu(waktu);
            sewa.setLapangan(lapangan);
            sewa.setJenis(jenis);
            sewa.setTambahan(tambahan);

            System.out.println("================"
                    + "Detail Pemesanan Lapangan================");
            System.out.println("Nama pemesan                       : "
                    + sewa.getNama());
            System.out.println("Lama sewa                          : "
                    + sewa.getWaktu());
            System.out.println("Lapangan " + sewa.getTxtLapangan()
                    + " (" + sewa.getTxtJenis() + ")           : "
                    + sewa.getHrgLapangan());
            System.out.println("Tambahan " + sewa.getTxtTambahan() + "    : "
                    + sewa.getHrgTambahan());
            System.out.println("---------------------------------------------");
            System.out.println("Total bayar                        : "
                    + sewa.getTotal());
            System.out.print("Uang pembayaran                    : ");
            bayar = kinput.nextInt();
            sewa.setUangBayar(bayar);
            System.out.println("---------------------------------------------");
            System.out.println("Kembalian                          : "
                    + sewa.getKembalian());
            System.out.print("Apakah ada pemesanan lain? (y/n)   : ");
            ulang = kinput.next();
            
            jalan = (ulang.toLowerCase().equals("n") ? false : true);
//            if (ulang.toLowerCase().equals("n")) {
//                jalan = false;
//                System.exit(0);
//            }
        }
    }

}
