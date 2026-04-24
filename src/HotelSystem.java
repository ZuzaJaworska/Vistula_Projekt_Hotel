import java.util.ArrayList;
import java.util.List;

class HotelSystem implements Manageable {

    private List<Room> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    // Metody i ich przeznaczenie:
    // Metoda: public <T> void displayData(List<T> list)  <- METODA GENERYCZNA
    // Używa pól: Przekazanej z zewnątrz listy (np. rooms lub reservations).
    // Działanie: Pętla FOR-EACH (pętla 1) iteruje po liście i wywołuje toString() każdego elementu.
    //
    // Metoda: @Override public void addReservation(Reservation res) throws HotelException
    // Używa pól: 'reservations'.
    // Działanie: Sprawdza czy rezerwacja istnieje. Jeśli tak -> throw new HotelException. Jeśli nie -> dodaje do listy.
    //
    // Metoda: public double calculateTotalExtraFees(Room[] roomArray) <- TABLICA 1
    // Używa pól: przekazanej tablicy polimorficznej pokoi.
    // Działanie: Pętla FOR (pętla 2). Wewnątrz sprawdza 'if(roomArray[i] instanceof Apartment)'.
    // Wtedy następuje DOWNCASTING: Apartment a = (Apartment) roomArray[i]; i wywołanie a.getMinibarFee().

}
