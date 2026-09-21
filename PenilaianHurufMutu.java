import java.util.Scanner;
public class PenilaianHurufMutu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = scan.nextInt();
        char huruf;
        scan.close();

        if (nilai >= 85) {
            huruf = 'A';
        }
        else if (nilai >=70) {
            huruf = 'B';
        }
        else if (nilai >=55) {
            huruf = 'C';
        }
        else if (nilai >=40) {
            huruf = 'D';
        }
        else {
            huruf = 'E';
        }
        System.out.println("Huruf mutu: " + huruf);
    }
}