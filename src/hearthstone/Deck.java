package hearthstone;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Karte> karten;

    public Deck() {
        this.karten = new ArrayList<>();
    }

    public void addKarte(Karte karte) {
        this.karten.add(karte);
    }

    public Karte getRandomCard() {
        if (karten.size() > 0) {
            Karte karte = karten.get(0);
            karten.remove(0);
            return  karte;
        }
        return null;
    }

    public int getVorrat() {
        return karten.size();
    }

    public void shuffle() {
        Collections.shuffle(karten);
    }
}
