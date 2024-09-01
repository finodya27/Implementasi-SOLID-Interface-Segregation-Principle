/*
Nama: Finodya Yahdun
NIM: 21120122130065
*/

interface Fasilitas {
    String getFasilitas();
}

class PilihKursi implements Fasilitas {
    public String getFasilitas() { return "Kursi dipilih"; }
}

class PilihMakanan implements Fasilitas {
    public String getFasilitas() { return "Makanan dipilih"; }
}

class PilihTempatTidur implements Fasilitas {
    public String getFasilitas() { return "Tempat tidur dipilih"; }
}

class PilihHiburan implements Fasilitas {
    public String getFasilitas() { return "Hiburan dipilih"; }
}

class PilihBagasi implements Fasilitas {
    public String getFasilitas() { return "Bagasi ditambahkan"; }
}

class Kendaraan {
    private final String nama;
    private final Fasilitas[] fasilitas;

    public Kendaraan(String nama, Fasilitas... fasilitas) {
        this.nama = nama;
        this.fasilitas = fasilitas;
    }

    public void tampilkanFasilitas() {
        System.out.println("Fasilitas " + nama + " yang dipilih:");
        for (int i = 0; i < fasilitas.length; i++) {
            System.out.println((i + 1) + ". " + fasilitas[i].getFasilitas());
        }
        System.out.println("----------");
    }
}

public class Main {
    public static void main(String[] args) {
        new Kendaraan("Pesawat", new PilihKursi(), new PilihMakanan(), new PilihHiburan(), new PilihBagasi()).tampilkanFasilitas();
        new Kendaraan("Kereta", new PilihKursi(), new PilihTempatTidur(), new PilihMakanan()).tampilkanFasilitas();
        new Kendaraan("Bus", new PilihKursi(), new PilihBagasi()).tampilkanFasilitas();
        new Kendaraan("Kapal Laut", new PilihKursi(), new PilihMakanan(), new PilihHiburan()).tampilkanFasilitas();
        new Kendaraan("Pesawat Pribadi", new PilihKursi(), new PilihMakanan(), new PilihHiburan(), new PilihTempatTidur(), new PilihBagasi()).tampilkanFasilitas();
        new Kendaraan("Helikopter", new PilihKursi(), new PilihBagasi()).tampilkanFasilitas();
    }
}
