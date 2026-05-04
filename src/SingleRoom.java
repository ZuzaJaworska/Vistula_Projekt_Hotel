public class SingleRoom extends Room {

    private boolean hasSeaView;

    public SingleRoom(int roomNumber, double basePrice, RoomType roomType, boolean hasSeaView) {
        super(roomNumber, basePrice, roomType);
        this.hasSeaView = hasSeaView;
    }

    // Getter i Setter widoku na morze
    public boolean hasSeaView() {
        return hasSeaView;
    }

    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

    //Jeśli pokój ma widok na morze dodajemy 50 zł do ceny bazowej, jeżeli nie  zwracamy samą cenę bazową
    @Override
    public double calculateTotalCost() {
        if (hasSeaView) {
            return getBasePrice() + 50.0;
        }
        return getBasePrice();
    }

    @Override
    public String toString() {
        return "Pokój Standard:" +
                "\nNumer pokoju: " + getRoomNumber() +
                "\nCena: " + getBasePrice() +
                "\nTyp: " + getRoomType() +
                "\nWidok na morze: " + hasSeaView +
                "\nCena" + calculateTotalCost();
    }
}