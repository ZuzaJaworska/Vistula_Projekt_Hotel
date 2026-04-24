class Reservation implements Comparable<Reservation> {

    private Guest guest;
    private Room room;
    private int durationDays;

    // Metody i ich przeznaczenie:
    // Konstruktor: łączy obiekt 'Guest' z obiektem 'Room' na dany czas.
    //
    // Metoda: @Override public int compareTo(Reservation o)
    // Używa pól: 'durationDays'.
    // Działanie: Pozwala na sortowanie rezerwacji w kolekcji od najkrótszych do najdłuższych.
    //
    // Metoda: @Override public String toString()
    // Używa pól: 'guest', 'room', 'durationDays'.
    // Działanie: Wypisuje ładnie sformatowany rachunek (wywołuje wewnętrznie toString gościa i pokoju).

    // szybki override metod z Comparable żeby nie wyrzucało błędu w kompilacji
    @Override
    public int compareTo(Reservation o) {
        return 0;
    }
}
