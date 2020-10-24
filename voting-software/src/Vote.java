import ir.huri.jcal.JalaliCalendar;

/**
 * Vote class represents a single vote.
 *
 * @author Asma
 */

public class Vote {
    private Person person;  // who voted
    private String date;  // voting date

    /**
     * Create a new Vote with specified details.
     * @param person  who voted
     * @param date  voting date
     */
    public Vote(Person person, String date){
        this.person = person;
        this.date = date;
    }

    /**
     * Get who voted.
     * @return  person who voted
     */
    public Person getPerson(){
        return person;
    }

    /**
     * Get voting date.
     * @return  voting date
     */
    public String getDate(){
        return date;
    }

//    public boolean equals(Vote vote){ return false;}  // complete this if needed.



}
