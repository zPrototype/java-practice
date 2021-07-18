package hearthstone;

public class Game {

    private Hand hand;
    private Deck deck;

    public Game(Deck deck) {
        this.hand = new Hand();
        this.deck = deck;
    }

    public void karteZiehen() {
        hand.addCard(deck.getRandomCard());
    }

    public void ausgabe() {
        System.out.println("Aktuelle Hand: " + hand.toString());
        System.out.println("Anzahl Karten im Deck: " + deck.getVorrat());
    }
}
