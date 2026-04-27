class Guest extends Person {

    private int guestId;
    private boolean isVIP;

    public Guest(String firstName, String lastName, int guestId, boolean isVIP) {
        super(firstName, lastName);
        this.guestId = guestId;
        this.isVIP = isVIP;
    }

    // Metody i ich przeznaczenie:
    // Konstruktor: wywołuje super(firstName, lastName) i inicjalizuje 'guestId' oraz 'isVIP'.
    //
    // Metoda: @Override public void displayRole()
    // Używa pól: dziedziczonych ('firstName', 'lastName') oraz 'isVIP'.
    // Działanie: Wypisuje w konsoli, czy gość jest zwykłym klientem, czy klientem VIP.
    //
    // Metoda: @Override public boolean equals(Object o) i hashCode()
    // Używa pól: 'guestId'.
    // Działanie: Pozwala poprawnie porównywać gości – dwóch gości jest identycznych, jeśli mają to samo ID.
}
