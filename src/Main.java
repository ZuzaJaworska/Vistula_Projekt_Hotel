import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pola lokalne:
        // String[] menuOptions = {"1. Dodaj", "2. Sortuj", "3. Wyjdź"}; <- TABLICA 2
        // Room[] initialRooms = new Room[5]; <- TABLICA 3

        // Logika i wymagania:
        // TWORZENIE OBIEKTÓW: Tworzysz po min. 2 obiekty klas Guest, Employee, SingleRoom, Apartment (wymóg: po 2 z każdej).
        // UPCASTING: Wrzucasz SingleRoom i Apartment do tablicy 'initialRooms' typu Room[].
        // SORTOWANIE WBUDOWANE: Collections.sort(system.getReservations());
        //
        // PĘTLA: while(true)
        // Działanie: Główna pętla programu wyświetlająca menu z tablicy menuOptions.
        // Oczekuje na wejście ze Scannera. Używa bloków TRY-CATCH do przechwytywania HotelException.
        // Komunikaty w konsoli ułatwiają interakcję.

        List<Room> rooms = new ArrayList<>();
        rooms.add(new Apartment(101, 300.0, RoomType.SUITE, 50.0, 102));
        rooms.add(new SingleRoom(102, 150.0, RoomType.SINGLE, true));
        rooms.add(new SingleRoom(103, 150.0, RoomType.SINGLE, false));

        Apartment a1 = new Apartment(101, 300.0, RoomType.SUITE, 50.0, 105);
        Room r1 = new SingleRoom(101, 300.0, RoomType.SINGLE, true);

        for (Room room : rooms) {
            // Każdy pokój liczy koszt po swojemu — polimorfizm w akcji
          //  System.out.println("Pokój " + room.getRoomNumber() +
              //      " koszt: " + room.calculateTotalCost() + " PLN");
        }
        System.out.println(a1);
        System.out.println(r1);

    }
}