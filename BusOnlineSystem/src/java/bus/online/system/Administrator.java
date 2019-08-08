
package bus.online.system;

/**
 *
 * @author 99929
 */
public class Administrator {
    private int admin_ID;
    private String password;
    public Administrator(){
    }

    /**
     * @return the admin_ID
     */
    public int getAdmin_ID() {
        return admin_ID;
    }

    /**
     * @param admin_ID the admin_ID to set
     */
    public void setAdmin_ID(int admin_ID) {
        this.admin_ID = admin_ID;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
