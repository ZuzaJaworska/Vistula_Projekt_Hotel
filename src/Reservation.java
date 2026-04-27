import java.util.Objects;

// "implements Comparable" to dopisek, który uczy tę klasę, jak ma się domyślnie sortować.
// W nawiasach <Reservation> podajemy, z czym będziemy ją porównywać (z inną rezerwacją).
public class Reservation implements Comparable<Reservation> {

    // --- HERMETYZACJA ---
    // Zmienne są "private", czyli ukryte. Nikt z zewnątrz (np. z innej klasy) nie może 
    // ich bezczelnie zmienić (np. zrobic guest = null). To chroni nasze dane.
    private Guest guest;
    private Room room;
    private int durationDays;

    // --- KONSTRUKTOR ---
    // Służy do "lepienia" nowej rezerwacji. Gdy ktoś wpisze "new Reservation(...)", 
    // to musi podać gościa, pokój i liczbę dni, a my to zapisujemy do naszych prywatnych zmiennych.
    public Reservation(Guest guest, Room room, int durationDays) {
        this.guest = guest; // "this.guest" to nasza ukryta zmienna wyżej, a "guest" to to, co ktoś nam podał.
        this.room = room;
        this.durationDays = durationDays;
    }

    // --- GETTERY I SETTERY ---
    // Ponieważ zmienne są "private", musimy dać legalny sposób na ich odczytanie (get) 
    // lub podmianę (set). Te metody są "public", więc działają jak "okienko w banku".

    // Pobiera gościa
    public Guest getGuest() {
        return guest;
    }

    // Ustawia/zmienia gościa
    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    // Pobiera pokój
    public Room getRoom() {
        return room;
    }

    // Ustawia pokój
    public void setRoom(Room room) {
        this.room = room;
    }

    // Pobiera liczbę dni
    public int getDurationDays() {
        return durationDays;
    }

    // Ustawia liczbę dni
    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    // --- SORTOWANIE WBUDOWANE (Wymóg z Comparable) ---
    // Ta metoda uruchomi się automatycznie, gdy ktoś każe posortować listę rezerwacji.
    // Bierze naszą rezerwację (this) i porównuje z inną (o).
    @Override
    public int compareTo(Reservation o) {
        // Zwracamy Integer.compare, który sprawdza:
        // - jeśli nasze dni są mniejsze niż inne, daje wynik ujemny (lądujemy wyżej na liście)
        // - jeśli są równe, daje 0
        // - jeśli nasze są większe, daje wynik dodatni (lądujemy niżej)
        // Efekt: rezerwacje układają się rosnąco po liczbie dni.
        return Integer.compare(this.durationDays, o.durationDays);
    }

    // --- ZAMIANA NA TEKST (Wymóg) ---
    // Gdy ktoś napisze w kodzie np. System.out.println(rezerwacja), to Java nie wypisze 
    // dziwnych znaczków z pamięci RAM, tylko dokładnie ten sformatowany ładnie tekst poniżej.
    @Override
    public String toString() {
        return "--- RACHUNEK ZA REZERWACJĘ ---\n" +
                "Gość: " + guest.toString() + "\n" +
                "Pokój: " + room.toString() + "\n" +
                "Długość pobytu: " + durationDays + " dni.";
    }

    // --- PORÓWNYWANIE OBIEKTÓW (Wymóg) ---
    // Metoda equals mówi systemowi, po czym poznać, że dwie rezerwacje to ta sama rezerwacja.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Jeśli to dosłownie to samo miejsce w pamięci, to prawda.
        if (o == null || getClass() != o.getClass()) return false; // Jeśli to coś innego, to fałsz.
        Reservation that = (Reservation) o; // Przerabiamy ten inny obiekt na typ rezerwacji

        // Zwracamy prawdę (true), tylko jeśli wszystkie 3 zmienne (dni, gość, pokój) są identyczne.
        return durationDays == that.durationDays &&
                Objects.equals(guest, that.guest) &&
                Objects.equals(room, that.room);
    }

    // HashCode zawsze idzie w parze z equals. Tworzy z naszych danych (gość, pokój, dni) 
    // unikalny numer (taki "pesel" obiektu), żeby system mógł go szybko odnaleźć w pamięci.
    @Override
    public int hashCode() {
        return Objects.hash(guest, room, durationDays);
    }
}