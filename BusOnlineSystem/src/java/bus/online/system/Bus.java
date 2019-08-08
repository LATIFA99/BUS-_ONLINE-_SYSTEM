
package bus.online.system;

/**
 *
 * @author Latifa Sally
 */
public class Bus {
    private int Bus_ID;
    private int seat_ID;
    private String Bus_type;
    public Bus(){
        
    }

    /**
     * @param Bus_ID the Bus_ID to set
     */
    public void setBus_ID(int Bus_ID) {
        this.Bus_ID = Bus_ID;
    }

    /**
     * @param seat_ID the seat_ID to set
     */
    public void setSeat_ID(int seat_ID) {
        this.seat_ID = seat_ID;
    }

    /**
     * @return the Bus_type
     */
    public String getBus_type() {
        return Bus_type;
    }

    /**
     * @return the Bus_ID
     */
    public int getBus_ID() {
        return Bus_ID;
    }

    /**
     * @return the seat_ID
     */
    public int getSeat_ID() {
        return seat_ID;
    }

    /**
     * @param Bus_type the Bus_type to set
     */
    public void setBus_type(String Bus_type) {
        this.Bus_type = Bus_type;
    }
    
}
