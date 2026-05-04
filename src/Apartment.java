public class Apartment extends Room {

    private double miniBarFee;
    private int parking;

    public Apartment(int roomNumber, double basePrice, RoomType roomType,
                     double miniBarFee, int parking) {
        super(roomNumber, basePrice, roomType);
        this.miniBarFee = miniBarFee;
        this.parking = parking;
    }

    // Gettery i Settery
    public double getMiniBarFee() {
        return miniBarFee;
    }

    public void setMiniBarFee(double miniBarFee) {
        this.miniBarFee = miniBarFee;
    }

    public int getParking() {
        return parking;
    }

    public void setParking(int parking) {
        this.parking = parking;
    }

    // Kluczowa metoda dla downcastingu
    //Sumujemy cenę bazową pobieraną getterem z Room z opłatą za minibar
    @Override
    public double calculateTotalCost() {
        return getBasePrice() + miniBarFee;
    }

    @Override
    public String toString() {
        return "Apartament BIZNES:" +
                "\nNumer pokoju: " + getRoomNumber() +
                "\nTyp: " + getRoomType() +
                "\nCena: " + getBasePrice() +
                "\nMiniBarek: " + miniBarFee +
                "\nNumer miejsca postojowego: " + parking;
    }
}