package Hotel;

public class Room {
    int numberOfBeds;
    double price;
    boolean occupied;
    boolean dirty;
    boolean available;
// this is the constructor with parameters
    Room (int numberOfBeds, double price, boolean occupied, boolean dirty, boolean available){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;

    }
    public int getNumberOfBeds() {
        this.numberOfBeds = numberOfBeds;
        return numberOfBeds;
    }
    public double getPrice() {
        this.price = price;
        return price;
    }
    public boolean isOccupied() {
        this.occupied = occupied;
        return occupied;
    }
    public boolean isDirty() {
        this.dirty = dirty;
        return dirty;
    }
    public boolean isAvailable() {
        if (isDirty() || isOccupied()) {
            available = false;
        } else {
            available = true;
        }
        return available;
    }
}
