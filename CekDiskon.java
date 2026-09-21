import java.util.Scanner;
public class CekDiskon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan status member (GOLD/SILVER/BRONZE/REGULAR): ");
        String status = scan.nextLine();
        int diskon;
        scan.close();

        if (status.equals("GOLD")) {
            diskon = 20;
        } else if (status.equals("SILVER")) {
            diskon = 15;
        } else if (status.equals("BRONZE")) {
            diskon = 10;
        } else {
            diskon = 0;
        } 
        System.out.println("Status member: " + status);
        System.out.println("Diskon: " + diskon + "%");
    }
}
