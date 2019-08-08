
package bus.online.system;

import java.util.Date;

/**
 *
 * @author Latifa Sally
 */
public class Ticket {
    private int ticket_ID;
    private int seat_ID;
    private Date  journey;
    private Date  departing;
   private int Bus_ID;

    /**
     * @return the ticket_ID
     */
    public int getTicket_ID() {
        return ticket_ID;
    }

    /**
     * @return the seat_ID
     */
    public int getSeat_ID() {
        return seat_ID;
    }

    /**
     * @return the journey
     */
    public Date getJourney() {
        return journey;
    }

    /**
     * @return the departing
     */
    public Date getDeparting() {
        return departing;
    }

    /**
     * @return the Bus_ID
     */
    public int getBus_ID() {
        return Bus_ID;
    }
    
    
    
}
