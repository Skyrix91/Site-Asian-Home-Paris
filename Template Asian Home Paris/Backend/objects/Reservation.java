package objects;
package objects.Client;

import javax.persistence.*;
import java.util.Objects;

public class Reservation {

    private String client;
    private int numOfGuests;
    private Object LocalDate;
    private String time;
    private int accepted;

    public Reservation( String time, int numOfGuests, int accepted, String client, String date) {
        this.time = time;
        this.numOfGuests = numOfGuests;
        this.accepted = accepted;
        this.client = client;
        this.LocalDate = date;
    }
    public String getReservationDate() {
        return date;
    }

    public void setReservationDate(String date){
        this.date =date;
    }

    public int getNumOfGuests(){
        return numOfGuests;
    }

    public void setNumOfGuests(int numOfGuests){
        this.numOfGuests = numOfGuests;
    }

    public int getAccepted(){
        return accepted;
    }

    public void setAccepted (int accepted){
        this.accepted = accepted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(time, that.time) &&
                Objects.equals(numberOfPersons, that.numberOfPersons) &&
                Objects.equals(accepted, that.accepted);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, time, numberOfPersons, accepted);
    }




}




