package hearthstone;

public abstract class Karte {

    // Attribute
    // Die Attribute werden von den Unterklassen geteilt, deswegen werden Sie hier in der Parent Klasse definiert
    private String name;
    private String beschreibung;
    private int manakosten;

    public Karte(String name, String beschreibung, int manakosten) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.manakosten = manakosten;
    }

    public String getName() {
        return name;
    }
}
