public class Reservation {
  int nrOfNights;
  double pricePerNight;
  boolean isWeekend;
  String roomType;


  Reservation(
      int nrOfNights,
      String roomType,
      double pricePerNight,
      boolean isWeekend,
      double reservationTotalPrice) {
    this.nrOfNights = nrOfNights;
    this.roomType = roomType;
    this.pricePerNight = getPricePerNight();
    this.isWeekend = isWeekend();

    getReservationTotalPrice();
  }

  public int getNrOfNights() {
    return nrOfNights;
  }

  public void setNrOfNights(int nrOfNights) {
    this.nrOfNights = nrOfNights;
  }

  public String getRoomType() {
    this.roomType = roomType;
    return roomType;
  }

  public String setRoomType(String typeOfRoom) {
    if (typeOfRoom.equalsIgnoreCase("king")) {
      pricePerNight = 139;
    } else if (typeOfRoom.equalsIgnoreCase("double")) {
      pricePerNight = 124;
    }
    return roomType;
  }

  public double getPricePerNight() {
      return pricePerNight;
  }

  public double setPricePerNight() {
    if (roomType.equalsIgnoreCase("king")) {
      pricePerNight = 139;
    } else if (roomType.equalsIgnoreCase("double")) {
      pricePerNight = 124;
    }
    return pricePerNight;
  }

  public boolean isWeekend() {
      return isWeekend;
  }

  public boolean setIsWeekend(boolean isWeekend) {
    if (isWeekend) {
      pricePerNight = pricePerNight * 1.1;
    }
    return isWeekend;
  }

  public double getReservationTotalPrice() {
    double reservationTotalPrice = setPricePerNight() * nrOfNights;
    return reservationTotalPrice;
  }
}
