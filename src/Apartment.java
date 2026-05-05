public class Apartment extends Room {

    private double miniBarFee;
    private int parking;

    //Konstruktor Apartamentu
    public Apartment(int roomNumber, double basePrice, RoomType roomType,
                     double miniBarFee, int parking) {
        super(roomNumber, basePrice, roomType);
        this.miniBarFee = miniBarFee;
        this.parking = parking;
    }

    //Gettery i Settery
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

    //Metoda do downcastingu
    //Sumujemy cenę bazową pobieraną getterem z Room z opłatą za minibar
    @Override
    public double calculateTotalCost() {
        return getBasePrice() + miniBarFee;
    }

    //Nadpisanie metody toString
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