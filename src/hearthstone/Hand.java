package hearthstone;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Karte> karten;

    public Hand() {
        this.karten = new ArrayList<>();
    }

    public void addCard(Karte randomCard) {
        karten.add(randomCard);
    }

    // Überschreiben der toString methode um ein custom output format zu erzeugen
    @Override
    public String toString() {
        // StringBuilder da dieser deutlich schneller ist als ein gewöhnlicher String concat
        // Siehe package start, Klasse TestingStringBuilder
        StringBuilder darstellung = new StringBuilder();

        for (Karte karte : karten) {
            darstellung.append(karte.getName());
            darstellung.append(", ");
        }

        return darstellung.toString();
    }
}
