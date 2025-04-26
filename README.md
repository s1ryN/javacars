## javacars
- Program Auta
# Zadání
1. Vytvořte třídu Auto, která bude jako vlastnosti obsahovat public int rychlostkmh (v km za hodinu) a public String jmeno, dále pak dva konstruktory (z toho jeden bezparametrový) a  metody setJmeno(), getJmeno(), setRychlostkmh(), getRychlostkmh() a informuj(). Poslední metoda vypíše všechny známé informace o autě na monitor. Od třídy Auto děděním vytvořte třídu Traktor, která bude mít navíc vlastnost public boolean traktorSPrivesem. Pro novou třídu vytvořte 2 konstruktory (z toho jeden bezparametrový), dále pak metody setTraktorSPrivesem(), getTraktorSPrivesen() a informuj().  Poslední metoda vypíše všechny známé informace o traktoru. V metodě main vytvořte jeden objekt typu Auto a jeden typu Traktor (vždy použijte parametrizovaný konstruktor) a informace o nich vypište na obrazovku pomocí metod informuj().

2. V metodě main vytvořte další Auto a Traktor, tentokrát použijte konstruktory, které jste nepoužili v bodě 1. Traktoru pak změňte jméno na "Zetor".

3. Ve třídě Auto napište metodu metryZaSekundu(), která převede rychlost v km/h na m/s a vytiskne výsledek na monitor. Metodu použijte ukázkově pro auto, které se jmenuje "Zetor" v metodě main.

- Nápověda: 1 Kilometr za hodinu = 1/ (3,6)   metrů za sekundu 

- 1 km = 1000 m
- 1 h = 60 · 60 s = 3600 s

 

4. Změňte přístup u všech třech vlastností z public na private. Upravte program tak, aby výstup z něj byl shodný jako dříve.

5.  Od třídy Auto děděním vytvořte třídu ZavodniAuto, která bude mít navíc vlastnost private int cisloAuta. Pro novou třídu vytvořte dva konstruktory (z toho jeden bezparametrový) a jednu metodu informuj().  Metoda vypíše všechny známé informace o závodním autě. 

6. V metodě main vytvořte 100 závodních aut pomocí bezparametrického konstruktoru a vypište na obrazovku informace o všech těchto 100 závodních autech. Vzhledem k počtu objektů všechny závodní auta uložte do pole ZavodniAuto []  zavodak. Využijte cyklus for.

- Nápověda jak vytvořit instance:  

- ZavodniAuto[] zavodak= new ZavodniAuto[100];

- zavodak[1] = new ZavodniAuto();
- zavodak[2] = new ZavodniAuto();


- Následně implementujte do tříd Traktor a ZavodniAuto interface IPocet obsahující statickou vlastnost int pocetAut a neststickou vlastnost int pocetKol. A dále obsahující statickou metodu nakup() a statickou metodu prodej(). 

- Tyto nové metody implementujte následovně:

- Metoda nakup(), vyzve uživatele, aby do příkazového řádku zadal hodnotu čísla int, které představuje nakoupené množství traktorů (závodních aut). Následně metoda inkrementuje vlastnost pocetAut.  

- Metoda prodej(), se chová opačné - odečítá z počtu traktorů (závodních aut) zadanou hodnotu int z klávesnice. Případně uživatelsky i ošetřete, aby v metodě prodej() nemohlo dojít při zadávání hodnoty představující prodané množství ke stavu, že bude následný počet traktorů (závodních aut) menší než 0. 

- Metodu informuj() ze tříd Traktor a ZavodniAuto aktualizujte doplněním vlastnosti int pocetKol.

- Ve třídě Main poté otestujte, že se program chová dle zadání voláním nových metod, které přidáte za volané stávající metody:

- Zavolejte nakup() pro třídu Traktor. Zavolejte prodej() pro třídu Traktor.

- Vypište počet traktorů na monitor.

- Zavolejte nakup() pro třídu ZavodniAuta. Zavolejte prodej() pro třídu ZavodniAuta.

- Vypište počet závodních aut na monitor.

# Výstup
Auto se jmenuje BMW a jede rychlosti 120 km/h.

Traktor se jmenuje JohnDeere a jede rychlosti 25 km/h a prives ma je true a pocet kol je 4.

Auto se jmenuje Skoda a jede rychlosti 100 km/h.

Traktor se jmenuje Zetor a jede rychlosti 36 km/h a prives ma je false a pocet kol je 4.

Rychlost auta Zetor je 10.0 m/s.

----------------------------------

100 zavodnich aut:

Zavodni auto cislo 1 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 2 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 3 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 4 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 5 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 6 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 7 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 8 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 9 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 10 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 11 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 12 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 13 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 14 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 15 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 16 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 17 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 18 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 19 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 20 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 21 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 22 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 23 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 24 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 25 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 26 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 27 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 28 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 29 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 30 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 31 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 32 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 33 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 34 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 35 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 36 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 37 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 38 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 39 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 40 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 41 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 42 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 43 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 44 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 45 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 46 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 47 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 48 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 49 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 50 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 51 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 52 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 53 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 54 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 55 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 56 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 57 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 58 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 59 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 60 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 61 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 62 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 63 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 64 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 65 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 66 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 67 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 68 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 69 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 70 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 71 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 72 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 73 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 74 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 75 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 76 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 77 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 78 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 79 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 80 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 81 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 82 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 83 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 84 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 85 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 86 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 87 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 88 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 89 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 90 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 91 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 92 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 93 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 94 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 95 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 96 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 97 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 98 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 99 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

Zavodni auto cislo 100 se jmenuje Noname a jede rychlosti 0 km/h a pocet kol je 4.

-----------------------------------

Kolik nakoupíte traktorů?

20

Kolik prodáte traktorů?

15

Máte tento pocet traktoru: 5

Kolik nakoupíte závodních aut?

12

Kolik prodáte závodních aut?

4

Máte tento pocet zavodnich aut: 8



 
