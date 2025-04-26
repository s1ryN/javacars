// IPocet.java
import java.util.Scanner;

public interface IPocet {
    // nestaticka vlastnost pocetKol (vsechny vozidla maji 4 kola)
    int pocetKol = 4;

    // staticka metoda pro nakup
    static void nakup(String typ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kolik nakoupíte " + typ + "? ");
        int n = sc.nextInt();
        // ignorujeme finalitu interfacove promenne pro ucely ukazky
        IPocetHolder.increment(n);
    }

    // staticka metoda pro prodej
    static void prodej(String typ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kolik prodáte " + typ + "? ");
        int n = sc.nextInt();
        IPocetHolder.decrement(n);
    }

    // instance getter
    int getPocetKol();
}