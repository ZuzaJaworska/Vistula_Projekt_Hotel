import java.util.Objects;

class Guest extends Person {

    private int guestId;
    private boolean isVIP;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return guestId == guest.guestId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(guestId);
    }

    public Guest(String firstName, String lastName, int guestId, boolean isVIP) {
        super(firstName, lastName);
        this.guestId = guestId;
        this.isVIP = isVIP;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    @Override
    public void displayRole() {
        if (isVIP) {
            System.out.println("Gość VIP");
        } else {
            System.out.println("Gość standardowy");
        }
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestId=" + guestId +
                ", isVIP=" + isVIP +
                '}';
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
