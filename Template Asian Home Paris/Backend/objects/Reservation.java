package objects;

public class Reservation {

    private String userName;
    private int numOfGuests;
    private Object LocalDate;
    protected String date;


    Reservation(int numOfGuests, String userName, String date) {
        this.numOfGuests = numOfGuests;
        this.userName = userName;
        this.LocalDate = date;
    }

    public String ToString() {
        return String.format("%d personnes au nom de :%s", numOfGuests,userName);
    }

    public void setReservationDate(String date){
        this.date =date;
    }

    public String getReservationDate() {
        return date;
    }
}