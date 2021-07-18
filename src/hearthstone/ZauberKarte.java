package hearthstone;

public class ZauberKarte extends Karte {
    public ZauberKarte(String name, String beschreibung, int manakosten) {
        // Attribute kommen von der Parent Klasse (super) Karte
        super(name, beschreibung, manakosten);
    }
}
