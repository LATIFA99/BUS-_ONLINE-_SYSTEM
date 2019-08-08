/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.online.system;
import java.util.Date;

/**
 *
 * @author 99929
 */
public class Booking {
    private int booking_ID;
    private String booking_title;
    private String booking_type;
    private int ticket_ID;
    private Date journey;
    private Date departing;
    
    public Booking(){
        
    }

    /**
     * @return the booking_ID
     */
    public int getBooking_ID() {
        return booking_ID;
    }

    /**
     * @param booking_ID the booking_ID to set
     */
    public void setBooking_ID(int booking_ID) {
        this.booking_ID = booking_ID;
    }

    /**
     * @return the booking_title
     */
    public String getBooking_title() {
        return booking_title;
    }

    /**
     * @param booking_title the booking_title to set
     */
    public void setBooking_title(String booking_title) {
        this.booking_title = booking_title;
    }

    /**
     * @return the booking_type
     */
    public String getBooking_type() {
        return booking_type;
    }

    /**
     * @param booking_type the booking_type to set
     */
    public void setBooking_type(String booking_type) {
        this.booking_type = booking_type;
    }

    /**
     * @return the ticket_ID
     */
    public int getTicket_ID() {
        return ticket_ID;
    }

    /**
     * @param ticket_ID the ticket_ID to set
     */
    public void setTicket_ID(int ticket_ID) {
        this.ticket_ID = ticket_ID;
    }

    /**
     * @return the journey
     */
    public Date getJourney() {
        return journey;
    }

    /**
     * @param journey the journey to set
     */
    public void setJourney(Date journey) {
        this.journey = journey;
    }

    /**
     * @return the departing
     */
    public Date getDeparting() {
        return departing;
    }

    /**
     * @param departing the departing to set
     */
    public void setDeparting(Date departing) {
        this.departing = departing;
    }
    
}
