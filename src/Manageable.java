// Słowo "interface" oznacza, że to nie jest zwykła klasa, tylko KONTRAKT (spis treści).
// Nie ma tu żadnego kodu wykonawczego, są tylko nazwy metod, które system musi posiadać.
interface Manageable {

    // To jest pierwsza metoda z kontraktu.
    // Zmusza system do posiadania funkcji dodawania rezerwacji.
    // Dopisek "throws HotelException" to ostrzeżenie: "Uwaga, ta metoda może wywołać nasz autorski błąd!".
    void dodajRezerwacje(Guest guest, Room room, int days) throws HotelException;

    // To jest druga metoda z kontraktu.
    // Zmusza system do posiadania funkcji wyświetlającej dane.
    void wyswietlWszystko();
}