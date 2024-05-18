package utssriapril;

  import java.util.Scanner;
/**
 *
 * @author sriaprilyanti 2201010011
 * TGL : 2024-05-16
 */
public class KameraApp {
    private static final int MAX_RECORDS = 100;
    private KameraRecord[] records;
    private int numOfRecords;
    private Scanner scanner;

    public KameraApp() {
        records = new KameraRecord[MAX_RECORDS];
        numOfRecords = 0;
        scanner = new Scanner(System.in);
    }

    public void tambahRecord() {
        if (numOfRecords < MAX_RECORDS) {
            System.out.println("Masukkan data kamera:");
            System.out.print("Merek: ");
            String merek = scanner.nextLine();
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Tanggal Sewa (DD/MM/YYYY): ");
            String tanggalSewaStr = scanner.nextLine();
            System.out.print("Disewakan (true/false): ");
            boolean disewakan = scanner.nextBoolean();
            scanner.nextLine(); // Membuang newline

            // Parsing tanggal sewa
            // Anda perlu menambahkan logika untuk parsing tanggal, tergantung pada format yang Anda pilih
            // Contoh sederhana:
            // Date tanggalSewa = parseTanggal(tanggalSewaStr);
            // Jangan lupa untuk menangani exception jika parsing gagal

            records[numOfRecords++] = new KameraRecord(merek, model, null, disewakan);
            System.out.println("Data kamera berhasil ditambahkan.");
        } else {
            System.out.println("Batas maksimal data sudah tercapai.");
        }
    }

    public void tampilkanRecord() {
        System.out.println("Daftar Data Kamera:");
        for (int i = 0; i < numOfRecords; i++) {
            System.out.println("Data " + (i + 1) + ":");
            System.out.println(records[i].toString());
            System.out.println();
        }
    }

    public void jalankan() {
        int pilihan;

        do {
            System.out.println("Menu Aplikasi:");
            System.out.println("1. Tambah Data Kamera");
            System.out.println("2. Tampilkan Data Kamera");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1:
                    tambahRecord();
                    break;
                case 2:
                    tampilkanRecord();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 3);
    }

    public static void main(String[] args) {
        KameraApp kameraApp = new KameraApp();
        kameraApp.jalankan();
    }
}
