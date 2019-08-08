
package bus.online.system;

/**
 *
 * @author Latifa Sally
 */
public class Seat_Module {
      private int ticket_ID;
      private String seat_description;
      private String seat_type;

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
     * @return the seat_description
     */
    public String getSeat_description() {
        return seat_description;
    }

    /**
     * @param seat_description the seat_description to set
     */
    public void setSeat_description(String seat_description) {
        this.seat_description = seat_description;
    }

    /**
     * @return the seat_type
     */
    public String getSeat_type() {
        return seat_type;
    }

    /**
     * @param seat_type the seat_type to set
     */
    public void setSeat_type(String seat_type) {
        this.seat_type = seat_type;
    }
      
    
}
