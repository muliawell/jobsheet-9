import java.util.Scanner;
public class MahasiswaDemo19 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int pilih;

    StackTugasMahasiswa19 stack = new StackTugasMahasiswa19(5);
    do {
        System.out.println("\nMenu:");
        System.out.println("1. Mengumpulkan Tugas");
        System.out.println("2. Menilai Tugas");
        System.out.println("3. Melihat Tugas Teratas");
        System.out.println("4. Melihat Daftar Tugas");
        System.out.println("5. Melihat Tugas Terbawah");
        System.out.println("6. Melihat Jumlah Tugas yang Sudah Dikumpulkan");
        System.out.print("Pilih: ");
        pilih = scan.nextInt();
        scan.nextLine();
        switch (pilih) {
            case 1:
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                System.out.print("NIM: ");
                String nim = scan.nextLine();
                System.out.print("Kelas: ");
                String kelas = scan.nextLine();
                Mahasiswa19 mhs = new Mahasiswa19 (nama, nim, kelas);
                stack.push(mhs);
                System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                break;
            case 2:
                Mahasiswa19 dinilai = stack.pop();
                if (dinilai != null) {
                    System.out.println("Menilai tugas dari " + dinilai.nama);
                    System.out.print("Masukkan nilai (0-100): ");
                    int nilai = scan.nextInt();
                    dinilai.tugasDinilai(nilai);
                    System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);

                    StackKonversi19 konversi = new StackKonversi19();
                    String biner = konversi.konversiDesimalKeBiner(nilai);
                    System.out.println("Nilai Biner Tugas: " + biner);
                }
                break;
            case 3:
                Mahasiswa19 lihat = stack.peek();
                if (lihat != null) {
                    System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                }
                break;
            case 4:
                System.out.println("Daftar semua tugas");
                System.out.println("Nama\tNIM\tKelas");
                stack.print();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
            
            case 5:
    Mahasiswa19 terbawah = stack.bottom();
    if (terbawah != null) {
        System.out.println("Tugas pertama dikumpulkan oleh " + terbawah.nama);
    }
    break;

    case 6:
    System.out.println("Jumlah tugas saat ini: " + stack.jumlahTugas());
    break;
        }
    } while (pilih >= 1 && pilih <= 6);

}
}