import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       // ini No. 1 a

       System.out.println("=== No. 1 ===\n");
       System.out.println("* 1. a");
       System.out.print("Masukan nama anda = ");
       String name = input.nextLine();
       String sentence = "Selamat datang di bootcamp Kawah Edukasi, ";

       System.out.println(sentence + name + ".\n");

       // ini No. 1 b

       // variabel untuk tipe data Short
       System.out.println("* 1. b");
       short varShort = 10;
       short varShort2 = 100;

       // variabel untuk tipe data Double
       double varDouble = 2.5;
       double varDouble2 = 10.5;

       // variabel untuk tipe data Char
       char varChar = 'x';
       char varChar2 = 'y';

       // variabel untuk tipe data Boolean
       boolean varBoolean = true;
       boolean varBoolean2 = false;

       // print hasil tipe data diatas

       System.out.println("Tipe data Short   : " + varShort);
       System.out.println("Tipe data Short   : " + varShort2);
       System.out.println("Tipe data Double  : " + varDouble);
       System.out.println("Tipe data Double  : " + varDouble2);
       System.out.println("Tipe data Char    : " + varChar);
       System.out.println("Tipe data Char    : " + varChar2);
       System.out.println("Tipe data Boolean : " + varBoolean);
       System.out.println("Tipe data Boolean : " + varBoolean2 + "\n");

       // ini No. 1 c

       System.out.println("* 1. c");
       String value = "Saya senang ";
       String value2 = "belajar ";
       String value3 = "Java Language.";
       String result = value + value2 + value3;

       System.out.println(result);

   }
}
