// ZavodniAuto.java
public class ZavodniAuto extends Auto implements IPocet {
    private int cisloAuta;
    private int pocetKol = IPocet.pocetKol;

    public ZavodniAuto() {
        super();
        this.cisloAuta = 0;
    }

    public ZavodniAuto(String jmeno, int rychlostkmh, int cislo) {
        super(jmeno, rychlostkmh);
        this.cisloAuta = cislo;
    }

    @Override
    public void informuj() {
        System.out.println("Zavodni auto cislo " + cisloAuta
            + " se jmenuje " + getJmeno()
            + " a jede rychlosti " + getRychlostkmh()
            + " km/h a pocet kol je " + pocetKol + ".");
    }

    @Override
    public int getPocetKol() {
        return pocetKol;
    }
}