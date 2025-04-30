public class Surat19 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin; 
    int durasi;

    public Surat19(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilkan() {
        System.out.println("ID: " + idSurat + ", Nama: " + namaMahasiswa + ", Kelas: " + kelas +
                           ", Jenis Izin: " + jenisIzin + ", Durasi: " + durasi + " hari");
    }
}
