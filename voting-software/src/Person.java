/**
 * Person class stores every person's information like first name and last name.
 *
 * @author Asma
 */

public class Person {
    private String firstName;
    private String lastName;

    /**
     * Create a new person with specified details.
     * @param firstName  person's first name
     * @param lastName  person's last name
     */
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Get person's first name.
     * @return  person's first name
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * Get person's last name.
     * @return  person's last name
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Print person's information.
     */
    public void print(){
        System.out.println("Fist name:  " + firstName +
                "    Last name:  " + lastName);
    }

    /**
     * Equality check. If first name and last name are the same return true, else return false.
     * @param person  who we want to check
     * @return  true if first and last name are the same
     */
    public boolean equals(Person person){
        if (this.firstName.equals(person.getFirstName())){
            if (this.lastName.equals(person.lastName)) return true;
        }
        return false;
    }
}
