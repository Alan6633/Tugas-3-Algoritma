import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class gajiKaryawan {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Data Array
        int[] gaji = {5000000, 6500000, 9500000};
        int[] lembur = {30, 32, 34, 36, 38};

        System.out.print("Masukan golongan (A/B/C): ");
        String golongan = input.next().toUpperCase();

        System.err.print("Masukan Jumlah Lembur: ");
        int jamLembur = input.nextInt();

        int indeks = -1;

        //Menentukan Golongan Karyawan

        if (golongan.equals("A")){
            indeks = 0;
        } else if (golongan.equals("B")){
            indeks = 1;
        } else if (golongan.equals("C")){
            indeks = 2;
        }

        if (indeks == -1){
            System.out.println("Golongan Tidak Valid!");
        } else if (jamLembur < 0){
            System.out.println("Jumlah Jam Lembur Tidak Valid");
        } else{

        //Mengambil Data Array Gaji Pokok
        
        int gajiPokok = gaji[indeks];

        //Menentukan Persentase Lembur

        int persen = 0;

        if (jamLembur == 1){
            persen = lembur[0];
        } else if (jamLembur == 2){
            persen = lembur [1];
        } else if (jamLembur == 3){
            persen = lembur [2];
        } else if (jamLembur == 4){
            persen = lembur [3];
        } else if (jamLembur >= 5){
            persen = lembur [4];
        }

        //Menentukan Gaji Lembur

        double gajiLembur = gajiPokok * persen / 100;

        //Menghitung Total Gaji
        double totalGaji = gajiPokok + gajiLembur;

        NumberFormat rupiah = NumberFormat.getNumberInstance(new Locale ("id", "ID"));

        System.out.println("\n===============Hasil Perhitungan GAJI==================");
        System.out.println("Golongan: " + golongan);
        System.out.println("Rp " + rupiah.format(gajiPokok));
        System.out.println("Jam Lembur: " + jamLembur + "Jam");
        System.out.println("Persentase : " + persen + "%");
        System.out.println("Gaji Lembur : Rp" + rupiah.format(gajiLembur));
        System.out.println("Total Gaji: Rp" + rupiah.format(totalGaji));

        input.close();
    }
}
}