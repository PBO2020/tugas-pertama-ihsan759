package kalkulator;
import java.util.Scanner;
public class Kalkulator {
    static Scanner s = new Scanner(System.in);
    public static void menu(){
        setget g = new setget();
        System.out.println("Selamat datang di kalkulator sederhana ^_^");
        System.out.println("[1] Pertambahan");
        System.out.println("[2] Pengurangan");
        System.out.println("[3] Perkalian");
        System.out.println("[4] Pembagian");
        System.out.println("[5] keluar");
        System.out.print("Silahkan pilih menu : ");
        int c = s.nextInt();
        switch(c){
            case 1 :System.out.println("Pertambahan");
                    System.out.print("Angka pertama : ");
                    int d = s.nextInt();
                    System.out.print("Angka kedua   : ");
                    int f = s.nextInt();
                    g.settotaltambah(d, f);
                    System.out.println("jawabannya "+ d + " + " + f + " = " + g.gettotal());
                    menu();
            break;
            case 2 :System.out.println("Pengurangan");
                    System.out.print("Angka pertama : ");
                    int h = s.nextInt();
                    System.out.print("Angka kedua   : ");
                    int i = s.nextInt();
                    g.settotalkurang(h, i);
                    System.out.println("jawabannya "+ h + " - " + i + " = " + g.gettotal());
                    menu();
            break;
            case 3 :System.out.println("Perkalian");
                    System.out.print("Angka pertama : ");
                    int p = s.nextInt();
                    System.out.print("Angka kedua   : ");
                    int o = s.nextInt();
                    g.settotalkali(p, o);
                    System.out.println("jawabannya "+ p + " x " + o + " = " + g.gettotal());
                    menu();
            break;
            case 4 :System.out.println("Pembagian");
                    System.out.print("Angka pertama : ");
                    double q = s.nextDouble();
                    System.out.print("Angka kedua   : ");
                    double w = s.nextDouble();
                    g.settotalbagi(q, w);
                    System.out.println("jawabannya "+ q + " / " + w + " = " + g.gettotalbagi());
                    menu();
            break;
            case 5 :System.out.println("Sampai jumpa");
                    System.exit(0);
            default :System.out.println("Maaf pilihan anda salah silahkan coba kembali ^_^");
                     menu();
        }
    }
    public static void main(String[] args) {
        menu();
    }
    
}
