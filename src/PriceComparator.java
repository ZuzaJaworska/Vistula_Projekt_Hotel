import java.util.Comparator;

// "implements Comparator" oznacza, że to jest ODDZIELNE NARZĘDZIE do sortowania.
// Pokoje normalnie mogą sortować się po numerze pokoju, ale gdy użyjemy tego narzędzia,
// zignoruje ono domyślne ustawienia i posortuje pokoje po cenie.
public class PriceComparator implements Comparator<Room> {

    // Metoda compare bierze dwa Pokoje do ręki (r1 oraz r2).
    @Override
    public int compare(Room r1, Room r2) {

        // Najpierw wyciąga cenę z pokoju pierwszego, używając metody, którą napisała Osoba 3.
        double cena1 = r1.calculateTotalCost();

        // Potem wyciąga cenę z pokoju drugiego.
        double cena2 = r2.calculateTotalCost();

        // Na koniec każe systemowi porównać te dwie liczby (typu double).
        // Wynik podpowiada systemowi sortującemu, który pokój ułożyć na liście jako pierwszy.
        return Double.compare(cena1, cena2);
    }
}