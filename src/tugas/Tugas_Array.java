package tugas;

public class Tugas_Array {
    public static void main(String[] args) {
        String mahasiswa[] = new String[3];

        mahasiswa[0] = "Sulaiman";
        mahasiswa[1] = "yahya";
        mahasiswa[2] = "yusuf";

        System.out.println("============================================");
        for (int i = 0;
             i < mahasiswa.length;
             i++) {

            System.out.println(
                    "Mahasiswa peringkat ke-" + (i + 1) + " adalah " + mahasiswa[i]);
        }
    }
}
