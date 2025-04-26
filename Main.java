public class Main {
    public static void main(String[] args) {
        // bod 1
        Auto a1 = new Auto("BMW", 120);
        a1.informuj();
        Traktor t1 = new Traktor("JohnDeere", 25, true);
        t1.informuj();

        // bod 2
        Auto a2 = new Auto();
        a2.setJmeno("Skoda");
        a2.setRychlostkmh(100);
        a2.informuj();
        Traktor t2 = new Traktor();
        t2.setJmeno("Zetor");
        t2.setRychlostkmh(36);
        t2.setTraktorSPrivesem(false);
        t2.informuj();

        // bod 3
        t2.metryZaSekundu();

        System.out.println("----------------------------------");

        // bod 5+6
        System.out.println("100 zavodnich aut:");
        ZavodniAuto[] zavodak = new ZavodniAuto[100];
        for (int i = 0; i < 100; i++) {
            zavodak[i] = new ZavodniAuto();
            zavodak[i].setJmeno("Noname");
            zavodak[i].setRychlostkmh(0);
            // cisla od 1 do 100
            zavodak[i] = new ZavodniAuto("Noname", 0, i+1);
            zavodak[i].informuj();
        }

        System.out.println("-----------------------------------");

        // bod implementace nakupu/prodeje
        // traktory
        IPocetHolder.reset();
        IPocet.nakup("traktoru");
        IPocet.prodej("traktoru");
        System.out.println("Máte tento pocet traktoru: " + IPocetHolder.getPocetAut());

        // zavodni auta
        IPocetHolder.reset();
        IPocet.nakup("zavodnich aut");
        IPocet.prodej("zavodnich aut");
        System.out.println("Máte tento pocet zavodnich aut: " + IPocetHolder.getPocetAut());
    }
}
