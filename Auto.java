public class Auto {
    private int rychlostkmh;
    private String jmeno;

    public Auto() {
        this.jmeno = "Noname";
        this.rychlostkmh = 0;
    }

    public Auto(String jmeno, int rychlostkmh) {
        this.jmeno = jmeno;
        this.rychlostkmh = rychlostkmh;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getRychlostkmh() {
        return rychlostkmh;
    }

    public void setRychlostkmh(int rychlostkmh) {
        this.rychlostkmh = rychlostkmh;
    }

    public void informuj() {
        System.out.println("Auto se jmenuje " + jmeno + " a jede rychlosti " + rychlostkmh + " km/h.");
    }

    // prevod na metry za sekundu
    public void metryZaSekundu() {
        double mps = rychlostkmh / 3.6;
        System.out.println("Rychlost auta " + jmeno + " je " + mps + " m/s.");
    }
}