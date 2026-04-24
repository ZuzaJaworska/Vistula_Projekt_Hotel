class Apartment extends Room {

    private double miniBarFee; // można zmienić na coś innego
    private String conciergeName; // tak samo

    // Metody i ich przeznaczenie:
    // Konstruktor: wywołuje super() i ustawia unikalne pola apartamentu.
    //
    // Metoda: public double getMinibarFee()  <- KLUCZOWE DLA DOWNCASTINGU
    // Używa pól: 'minibarFee'.
    // Działanie: Zwraca opłatę za minibar (metoda niedostępna w zwykłym Room).
    //
    // Metoda: @Override public double calculateTotalCost()
    // Używa pól: getBasePrice() oraz 'minibarFee'.
    // Działanie: Sumuje cenę bazową i opłatę za minibar.
}
