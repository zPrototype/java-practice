package hearthstone;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        DienerKarte eisgigant = new DienerKarte("Thorsten", "Frisst den Streußelkuchen", 5, 3, 4);
        DienerKarte totem = new DienerKarte("Adolf", "Vernichtet die Juden", 8, 5, 10);
        DienerKarte murlock = new DienerKarte("Hopfenkrieger", "Trinkt ein ganzes Fass", 2, 1, 3);

        ZauberKarte feuerball = new ZauberKarte("Feuerball", "Macht 6 Schaden", 6);

        deck.addKarte(eisgigant);
        deck.addKarte(totem);
        deck.addKarte(murlock);
        deck.addKarte(feuerball);
        deck.shuffle();

        Game game = new Game(deck);

        game.ausgabe();
        game.karteZiehen();
        game.ausgabe();
        game.karteZiehen();
        game.ausgabe();
        game.karteZiehen();
        game.ausgabe();
        game.karteZiehen();
        game.ausgabe();

    }
}
