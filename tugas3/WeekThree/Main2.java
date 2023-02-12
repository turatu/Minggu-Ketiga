import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // luas lingkaran

        System.out.println("=== Menghitung Luas Lingkaran ===");
        System.out.print("\nMasukan jari-jari lingkaran : ");
        double r = input.nextDouble();
        double luas = Math.PI * Math.pow(r, 2);

        System.out.println("Luas Lingkaran adalah       : " + luas);

        // volume balok

        System.out.println("\n=== Menghitung Volume Balok ===");
        System.out.print("\nMasukan panjang balok : ");
        double p = input.nextDouble();

        System.out.print("Masukan lebar balok   : ");
        double l = input.nextDouble();

        System.out.print("Masukan tinggi balok  : ");
        double t = input.nextDouble();

        double volume = p * l * t;
        System.out.println("Volume Balok adalah   : " + volume);

    }
}
