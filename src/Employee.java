import java.util.Objects;

class Employee extends Person {

    private String position;
    public static int totalEmployees = 0;
    public static final String HOTEL_NAME = "Nasza nazwa hotelu do zmiany";

    public Employee(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }



    // Metody i ich przeznaczenie:
    // Konstruktor: inicjalizuje 'position' i wykonuje totalEmployees++ (zlicza pracowników).
    //
    // Metoda: public static void displayHotelInfo()    // STATYCZNA METODA nr 1
    // Używa pól: 'HOTEL_NAME'.
    // Działanie: Wyświetla statyczną wizytówkę hotelu w menu głównym.
    //
    // Metoda: public static int getTotalEmployees()    // STATYCZNA METODA nr 2
    // Używa pól: 'totalEmployees'.
    // Działanie: Zwraca aktualną liczbę zatrudnionych osób.
    //
    // Metoda: @Override public void displayRole()
    // Używa pól: 'position'.
    // Działanie: Informuje, na jakim stanowisku pracuje dana osoba.
}
