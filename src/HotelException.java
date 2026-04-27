// Słowo "extends" oznacza, że nasza klasa "dziedziczy" po głównej klasie błędów w Javie (Exception).
// Dzięki temu nasz HotelException jest traktowany przez system jak pełnoprawny błąd.
public class HotelException extends Exception {

    // To jest konstruktor. Uruchamia się, gdy chcemy "wyrzucić" nowy błąd.
    // W nawiasie przyjmuje tekst (message), np. "Ten pokój jest już zajęty!".
    public HotelException(String message) {

        // Słowo "super" wywołuje konstruktor z klasy wyżej (czyli z Exception).
        // Przekazujemy ten tekst dalej, żeby Java wiedziała, co wypisać czerwoną czcionką w konsoli.
        super(message);
    }
}