import java.util.Comparator;

class PriceComparator implements Comparator<Room> {

    // Pola: Brak (klasa narzędziowa).

    // Metody i ich przeznaczenie:
    // Metoda: @Override public int compare(Room r1, Room r2)
    // Używa pól: wywołuje r1.calculateTotalCost() oraz r2.calculateTotalCost().
    // Działanie: Definiuje drugi, alternatywny sposób sortowania (wymóg projektu) - po cenie pokoi.

    // szybki override metod z Comparator żeby nie wyrzucało błędu w kompilacji
    @Override
    public int compare(Room o1, Room o2) {
        return 0;
    }
}
