class SingleRoom extends Room {

    private boolean hasSeaView; // można zmienić na jakąś inną cechę

    // Metody i ich przeznaczenie:
    // Konstruktor: wywołuje super() i ustawia 'hasSeaView'.
    //
    // Metoda: @Override public double calculateTotalCost()
    // Używa pól: getBasePrice() (z klasy bazowej) oraz 'hasSeaView'.
    // Działanie: Jeśli 'hasSeaView' jest true, dodaje do basePrice np. 50 PLN.
}
