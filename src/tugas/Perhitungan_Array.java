package tugas;
import java.util.Scanner;
public class Perhitungan_Array {

    public static void main(String[] maruf) {

        String nama , nim ;

        final double n_tugas , n_uts , n_kuis , n_uas , n_akhir;

        Scanner input = new Scanner(System.in);

        System.out.println("=====Menghitung Nilai Mahasiswa=====\n");

        System.out.println("Masukan nama : ");

        nama = input.nextLine();

        System.out.println("Masukan nim : ");

        nim = input.nextLine();

        System.out.println("Nilai tugas : ");

        n_tugas = input.nextInt();

        System.out.println("Nilai kuis : ");

        n_kuis = input.nextInt();

        System.out.println("Nilai uts : ");

        n_uts = input.nextInt();

        System.out.println("Nilai uas = ");

        n_uas = input.nextInt();

        n_akhir = (0.15 * n_tugas + 0.29 * n_kuis + 0.30 * n_uts + 0.35 * n_uas);

        System.out.println(nama+" dengan Nim" +nim+" memiliki nilai akhir "+n_akhir);

    }
}
