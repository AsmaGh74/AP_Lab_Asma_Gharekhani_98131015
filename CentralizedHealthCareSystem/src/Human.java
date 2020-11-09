/**
 * Gender class defines gender types
 */
enum Gender{
    MALE, FEMALE
}
/**
 * Human class stores a Human's common info like name, gender, and id.
 * @author Asma
 * @version 1.0
 */
public abstract class Human {
    // stores Human's first name
    private String firstName;
    // stores Human's last name
    private String lastName;
    // stores Human's gender
    private Gender gender;
    // stores Human's id
    private String id;
    // stores Human's access level. Patients always have full access level. For doctors we can get access level for any patient from
    // Patient class. For doctors who work in pharmacy we should define another level access. For a researcher we can define full access level and so on.
    private AccessLevel accessLevel;
    // stores Human's password. We can also have Password class to define and check for valid passwords.
    private Password password;

    /**
     * Create a new Human with specific name and gender
     * @param firstName Human's first name
     * @param lastName Human's last name
     * @param gender Human's gender
     * @param id Human's id
     */
    public Human(String firstName, String lastName, Gender gender, String id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.id = id;
    }

    /*****************************************************************************
     * Setter methods for Human's fields
     *****************************************************************************/
    public void setAccessLevel(AccessLevel accessLevel){}
    public void setPassword(Password password){}
    /*****************************************************************************/

    /*****************************************************************************
     * Getter methods for Human's fields
     *****************************************************************************/
    public AccessLevel getAccessLevel(){return accessLevel;}
    /*****************************************************************************/

    /**
     * Print Human's info (name and gender).
     */
    protected void printInfo(){
        System.out.print("Name: " + firstName +
                " " + lastName +
                " Gender: " + gender.toString().toLowerCase() +
                " ID: " + id);
    }

    /**
     * Check if two Humans are the same or not.
     * @param human Human to be checked
     * @return true if two Humans are the same
     */
    abstract public boolean equals(Human human);

}
