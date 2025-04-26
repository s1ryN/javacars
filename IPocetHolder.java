// IPocetHolder.java
// pomocna trida k udrzeni mutable promenne (protoze interface pole jsou final)
public class IPocetHolder {
    private static int pocetAut = 0;
    public static void increment(int n) {
        pocetAut += n;
    }
    public static void decrement(int n) {
        if (n > pocetAut) {
            System.out.println("Nelze prodat více, než je k dispozici.");
        } else {
            pocetAut -= n;
        }
    }
    public static int getPocetAut() {
        return pocetAut;
    }
    public static void reset() {
        pocetAut = 0;
    }
}