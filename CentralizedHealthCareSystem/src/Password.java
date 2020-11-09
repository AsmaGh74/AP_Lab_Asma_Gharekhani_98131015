/**
 * Password class holds a password and also checks for a valid password.
 * @author Asma
 * @version 1.0
 */
public class Password {
    // stores password
    private String password;

    /**
     * Create a new password.
     * @param password
     */
    public Password(String password){
        this.password = password;
    }

    /**
     * Check if the password entered by new user is a valid one or not.
     * @param password password to be checked
     * @return  true if the password is valid
     */
    public boolean checkPasswordValidity(Password password){return false;}

    /**
     * Check if two passwords are the same.
     * Used for password matching.
     * @param password password to be checked
     * @return  true if two passwords are the same
     */
    public boolean equals(Password password){ return false;}
}
