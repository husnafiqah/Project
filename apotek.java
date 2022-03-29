package Kelompok;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class apotek {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String pilihanUser;
        int total;
        int angka;
        int jumlah, cash, kembalian;
        int nama_obat;
        int harga_obat = 0;
        String a;
        String Obatnya;
        apotek tr = new apotek();
        node root = new node();
        int r = 1;
        int c;
        boolean bool = true;

        int[] harga = { 5000, 6000, 3000, 4000, 15000 };
        String[] obatt = { "Paracatamol", " Amoxicillin", " Asam mefenamat ", " Bodrex ", " Masker " };
        int[] stock = { 100, 300, 75, 90, 60 };

        Queue<String> namapelanggan = new LinkedList<>();
        Stack<String> masker = new Stack<String>();
        Stack<String> masker2 = new Stack<String>();

        System.out.println("\t\t\t\t======================================");
        System.out.println("\t\t\t\t            SELAMAT DATANG            ");
        System.out.println("\t\t\t\t======================================");
        System.out.println("\t\t\t\t------------APOTEK BERKAH-------------");
        System.out.println("\t\t\t\t======================================");

        System.out.println("\n\t\t\t\t======================================");
        System.out.println("\t\t\t\t            OBAT dan ITEM           ");
        System.out.println("\t\t\t\t======================================");
        System.out.println("\t\t\t\t 1. Pracatamol     ||  Rp5.000 ");
        System.out.println("\t\t\t\t 2. Amoxicillin    ||  Rp6.000");
        System.out.println("\t\t\t\t 3. Asam mefenamat ||  Rp3.000");
        System.out.println("\t\t\t\t 4. Bodrex         ||  Rp4.000");
        System.out.println("\t\t\t\t 5. Masker         ||  Rp15.000");
        System.out.println("\n\t\t\t\t======================================");
        System.out.println();

        Scanner pilih = new Scanner(System.in);
        Scanner Pilih = new Scanner(System.in);
        do {
            System.out.println("\n\t\t\t\t======================================");
            System.out.println("\t\t\t\t               MENU                 ");
            System.out.println("\t\t\t\t======================================");
            System.out.println("\t\t\t\t    1. Cek Stock obat/item");
            System.out.println("\t\t\t\t    2. Tambah stock obat/item");
            System.out.println("\t\t\t\t    3. Pembelian Obat/item");
            System.out.println("\t\t\t\t    4. Cek Antrian Pembelian");
            System.out.println("\t\t\t\t    5. Tutup ");

            System.out.print("\t\t\t\tMASUKAN PILIHAN [1-5]: ");
            pilihanUser = pilih.next();

            switch (pilihanUser) {
                case "1":

                    for (int i = 0; i < stock.length; i++) {
                        System.out.println("\t\t\t\tNama obat/item  : " + obatt[i] + " \t stock :" + stock[i]);
                        System.out.println();
                    }
                    break;

                case "2":
                    System.out.print("\n\t\t\t\t > Masukkan jenis Obat/Item : ");
                    nama_obat = pilih.nextInt();
                    pilih.nextLine();

                    if (nama_obat == 1) {
                        Obatnya = obatt[0];
                        System.out.println("\t\t\t\tNama obat : " + Obatnya);
                        System.out.print("\t\t\t\t > Masukkan stock yang di tambahkan : ");
                        angka = pilih.nextInt();
                        stock[0] = stock[0] + angka;
                        System.out.println("\t\t\t\tstock obat yang tersedia : " + stock[0]);
                        System.out.println();
                    } else if (nama_obat == 2) {
                        Obatnya = obatt[1];
                        System.out.println("\t\t\t\tnama obat : " + Obatnya);
                        System.out.print("\t\t\t\t > masukkan stock yang di tambahkan : ");
                        angka = pilih.nextInt();
                        stock[1] = stock[1] + angka;
                        System.out.println("\t\t\t\tstock obat yang tersedia : " + stock[1]);
                        System.out.println();
                    } else if (nama_obat == 3) {
                        Obatnya = obatt[2];
                        System.out.println("\t\t\t\tnama obat : " + Obatnya);
                        System.out.print("\t\t\t\t > masukkan stock yang di tambahkan : ");
                        angka = pilih.nextInt();
                        stock[2] = stock[2] + angka;
                        System.out.println("\t\t\t\tstock obat yang tersedia : " + stock[2]);
                        System.out.println();
                    } else if (nama_obat == 4) {
                        Obatnya = obatt[3];
                        System.out.println("\t\t\t\tnama obat : " + Obatnya);
                        System.out.print("\t\t\t\t > masukkan stock yang di tambahkan : ");
                        angka = pilih.nextInt();
                        stock[3] = stock[3] + angka;
                        System.out.println("\t\t\t\tstock obat yang tersedia : " + stock[3]);
                        System.out.println();
                    } else if (nama_obat == 5) {
                        Obatnya = obatt[4];
                        System.out.println("\t\t\t\tNama item : " + Obatnya);
                        System.out.print("\t\t\t\t > Masukkan stock yang di tambahkan : ");
                        angka = pilih.nextInt();
                        stock[4] = stock[4] + angka;

                        for (int b = 1; b <= angka; b++)// perulangan for
                        {
                            masker.push("\t\t\t\tKotak Masker " + b);// proses memasukkan data pada stack
                        }
                        System.out.println(
                                "\n\t\t\t\t== Kondisi Kotak Masker di Kardus ==\n\t\t\t\tTumpukan Kotak Masker di Kardus :");

                        for (int b = 1; b <= angka; b++)// perulangan for
                        {
                            System.out.println(masker.peek());
                            masker2.push(masker.pop());// proses pengeluaran data pada stack
                        }
                        System.out.println("\n\t\t\t\t<< DILAKUKAN PEMINDAHAKN >>\n");
                        System.out.println("\t\t\t\t== Kondisi Kotak Masker di Rak ==\n\t\t\t\tTumpukan Kotak Masker di rak :");
                        for (int b = angka - 1; b >= 0; b--) {
                            System.out.println(masker2.elementAt(b));
                        }
                        System.out.println("\t\t\t\tstock obat yang tersedia : " + stock[4]);
                        System.out.println();
                    } else {
                        System.out.println("\t\t\t\tNomor yang anda masukkan salah");
                        System.out.print("\n\t\t\t\t > Masukkan jenis obat : ");
                        nama_obat = pilih.nextInt();
                        pilih.nextLine();
                    }

                    break;

                case "3":
                    int n = 0;
                    n++;
                    for (int j = 0; j < n; j++) {
                        System.out.print("\t\t\t\tMasukkan Nama pelanggan : ");
                        a = pilih.next();
                        namapelanggan.add(a);
                    }

                    System.out.print("\t\t\t\tMasukkan No.Antrian : ");
                    c = tr.in.nextInt();
                    if (r == 1) {
                        root.input(c);
                        r--;
                    } else
                        tr.insert(root, c);
                    tr.view(root);
                    System.out.println(" ");

                    System.out.print("\n\t\t\t\t > Masukkan jenis Obat/Item : ");
                    nama_obat = pilih.nextInt();
                    pilih.nextLine();
                    System.out.print("\t\t\t\t Masukkan jumlah : ");
                    jumlah = Pilih.nextInt();

                    if (nama_obat == 1) {
                        harga_obat = harga[0];
                        stock[0] = stock[0] - jumlah;
                    } else if (nama_obat == 2) {
                        harga_obat = harga[1];
                        stock[1] = stock[1] - jumlah;
                    } else if (nama_obat == 3) {
                        harga_obat = harga[2];
                        stock[2] = stock[2] - jumlah;
                    } else if (nama_obat == 4) {
                        harga_obat = harga[3];
                        stock[3] = stock[3] - jumlah;
                    } else if (nama_obat == 5) {
                        harga_obat = harga[4];
                        stock[4] = stock[4] - jumlah;
                    } else {
                        System.out.println("\t\t\t\tNomor yang anda masukkan salah");
                        System.out.print("\n\t\t\t\t > Masukkan jenis Obat/item : ");
                        nama_obat = pilih.nextInt();
                        pilih.nextLine();
                    }

                    total = harga_obat * jumlah;
                    System.out.print("\t\t\t\t Total harga : Rp. " + total);
                    System.out.println("");
                    System.out.print("\t\t\t\t Cash : Rp. ");
                    cash = Pilih.nextInt();

                    if (total > cash) {
                        System.out.println("\t\t\t\t Uang anda kurang");
                        System.out.print("\n\t\t\t\t > Masukkan uang anda : ");
                        cash = pilih.nextInt();
                        pilih.nextLine();
                        System.out.println("");
                        kembalian = cash - total;
                        System.out.println("\t\t\t\tKembalian : Rp. " + kembalian);
                        System.out.println("");

                    } else {
                        kembalian = cash - total;
                        System.out.println("\t\t\t\tKembalian : Rp. " + kembalian);
                        System.out.println("");
                    }

                    break;

                case "4":
                    System.out.print("\t\t\t\t Cek antrian :  " + namapelanggan.isEmpty());
                    System.out.println("\t\t\t\t antrian : " + namapelanggan);
                    System.out.println();
                    break;

                case "5":
                    System.exit(0);
                    break;

                default:
                    System.err.println("\n\t\t\t\tInput anda tidak ditemukan\nInputkan [1-5]");
            }
        } while (bool);
    }

    public void insert(node c, int b) {
        if (b < c.value) {
            if (c.left != null)
                insert(c.left, b);
            else {
                c.left = new node();
                c.left.input(b);
                System.out.println("\n\t\t\t\tPosisi duduk Antrian " + b + " di kiri Antrian  " + c.value);
            }
        } else if (b > c.value) {
            if (c.right != null)
                insert(c.right, b);
            else {
                c.right = new node();
                c.right.input(b);
                System.out.println("\n\t\t\t\tPosisi duduk Antrian " + b + " di kanan Antrian " + c.value);
            }
        }
    }

    public void view(node c) {
        System.out.print("\t\t\t\tTampilan duduk menurut Pre Order  : ");
        preOrder(c);
        System.out.println(" ");
    }

    public void preOrder(node c) {
        if (c != null) {
            System.out.print(c.value + " ");
            preOrder(c.left);
            preOrder(c.right);
        }
    }
}

class node {
    node left, right;
    int value;

    public void input(int c) {
        value = c;
    }
}
