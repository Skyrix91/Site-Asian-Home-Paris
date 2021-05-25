package objects;

public class Reservation {

    private String userName;
    private int numOfGuests;

    Reservation(int numOfGuests, String userName) {
        this.numOfGuests = numOfGuests;
        this.userName = userName;
    }

    public String ToString() {
        return String.format("%d personnes au nom de :%s", numOfGuests,userName);
    }
}