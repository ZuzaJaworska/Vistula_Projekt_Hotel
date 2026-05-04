import java.util.Objects;

public abstract class Room {

    private int roomNumber;
    private double basePrice;
    private RoomType roomType;

    public Room(int roomNumber, double basePrice, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;
        this.roomType = roomType;
    }

    // Gettery
    public int getRoomNumber() {
        return roomNumber;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    // Settery
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    // Metoda abstrakcyjna

    public abstract double calculateTotalCost();

    // equals i hashCode oparte na roomNumber
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomNumber == room.roomNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber);
    }

    @Override
    public String toString() {
        return "Pokój standard" +
                "\nNumer pokoju: " + roomNumber +
                "\nCena: " + basePrice +
                "\nTyp: " + roomType;
    }
}