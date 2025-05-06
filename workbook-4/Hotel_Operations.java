public class Hotel_Operations {

    //use the main() method in the Main class to create and test your logic in the classes
    //create each class and add all necessary backing variables. each class should have a constructor that sets the initial value of each backing variable

public static void main(String[] args){
    Room room1 = new Room(1, 199, false, true, false);
    Room room2 = new Room(2, 249,true, true, false);
    Room room3 = new Room(3, 299, true, true, false);

    Employee frontDesk1 = new Employee(20, 40, 20);
    Employee housekeepingStaff1 = new Employee(25, 40, 25);

    Reservation sarahsVacation = new Reservation(2, "king", 139, true, 0);
    System.out.println(sarahsVacation.getReservationTotalPrice());
    System.out.println(room1.isAvailable());
}








}
