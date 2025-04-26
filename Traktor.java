public class Traktor extends Auto implements IPocet {
    private boolean traktorSPrivesem;
    private int pocetKol = IPocet.pocetKol;

    public Traktor() {
        super();
        this.traktorSPrivesem = false;
    }

    public Traktor(String jmeno, int rychlostkmh, boolean prives) {
        super(jmeno, rychlostkmh);
        this.traktorSPrivesem = prives;
    }

    public boolean isTraktorSPrivesem() {
        return traktorSPrivesem;
    }

    public void setTraktorSPrivesem(boolean traktorSPrivesem) {
        this.traktorSPrivesem = traktorSPrivesem;
    }

    @Override
    public void informuj() {
        System.out.println("Traktor se jmenuje " + getJmeno()
            + " a jede rychlosti " + getRychlostkmh()
            + " km/h a prives ma je " + traktorSPrivesem
            + " a pocet kol je " + pocetKol + ".");
    }

    @Override
    public int getPocetKol() {
        return pocetKol;
    }
}