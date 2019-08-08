package bus.online.system;

/**
 *
 * @author Latifa Sally
 */
public class Refund {
    private float refund_amount;
    private int Customer_ID;
    private int ticket_ID;
    /**
     * @return the refund_amount
     */
    public float getRefund_amount() {
        return refund_amount;
    }

    /**
     * @return the Customer_ID
     */
    public int getCustomer_ID() {
        return Customer_ID;
    }

    /**
     * @param ticket_ID the ticket_ID to set
     */
    public void setTicket_ID(int ticket_ID) {
        this.ticket_ID = ticket_ID;
    }
    
            
       
}
