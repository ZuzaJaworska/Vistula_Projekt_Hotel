abstract class Person {

    private String firstName;
    private String lastName;

    // Metody i ich przeznaczenie:
    // Konstruktor: inicjalizuje pola 'firstName' i 'lastName'.
    // Gettery i Settery: zapewniają bezpieczny dostęp do 'firstName' i 'lastName' (hermetyzacja).
    //
    // Metoda: public abstract void displayRole();
    // Działanie: Wymusza na klasach dziedziczących zdefiniowanie swojej roli w systemie.
    //
    // Metoda: @Override public String toString()
    // Używa pól: 'firstName', 'lastName'.
    // Działanie: Zwraca czytelny ciąg znaków z imieniem i nazwiskiem (np. do metody generycznej).
}
