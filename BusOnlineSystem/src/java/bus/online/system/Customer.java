
package bus.online.system;

/**
 *
 * @author Latifa Sally
 */
public class Customer {
     private int Customer_ID;
     private String Customer_name;
     private String Customer_email;
     private int Customer_phonenumber;
     private String password;
   
     
    public Customer(){
        
    }
    /**
     * @param Customer_ID the Customer_ID to set
     */
    public void setCustomer_ID(int Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    /**
     * @return the Customer_name
     */
    public String getCustomer_name() {
        return Customer_name;
    }

    /**
     * @return the Customer_email
     */
    public String getCustomer_email() {
        return Customer_email;
    }

    /**
     
     */
    public int getCustomer_phonenumber() {
        return Customer_phonenumber;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the Customer_ID
     */
    public int getCustomer_ID() {
        return Customer_ID;
    }

    /**
     * @param Customer_name the Customer_name to set
     */
    public void setCustomer_name(String Customer_name) {
        this.Customer_name = Customer_name;
    }

    /**
     * @param Customer_email the Customer_email to set
     */
    public void setCustomer_email(String Customer_email) {
        this.Customer_email = Customer_email;
    }

    /**
     * @param Customer_phonenumber the Customer_phonenumber to set
     */
    public void setCustomer_phonenumber(int Customer_phonenumber) {
        this.Customer_phonenumber = Customer_phonenumber;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
     
    
     
    
}
