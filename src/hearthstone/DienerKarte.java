package hearthstone;

public class DienerKarte extends Karte {

    // Attribute die nur von dieser Unterklasse benötigt werden
    private int angriff;
    private int leben;

    public DienerKarte(String name, String beschreibung, int manakosten, int angriff, int leben) {
        // Attribute kommen von der Parent Klasse (super) Karte
        super(name, beschreibung, manakosten);
        this.angriff = angriff;
        this.leben = leben;
    }
}
