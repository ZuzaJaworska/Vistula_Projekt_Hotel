abstract class Room {

    private int roomNumber;
    private double basePrice;
    private RoomType roomType;

    // Metody i ich przeznaczenie:
    // Konstruktor: inicjalizuje wszystkie powyższe pola.
    // Gettery i Settery: dostęp do pól (np. getBasePrice(), getRoomNumber()).
    //
    // Metoda: public abstract double calculateTotalCost();
    // Działanie: Każdy rodzaj pokoju inaczej liczy koszt ostateczny.
    //
    // Metoda: @Override public boolean equals(Object o) i hashCode()
    // Używa pól: 'roomNumber'.
    // Działanie: Zapobiega dodaniu dwóch pokoi o tym samym numerze.
}
