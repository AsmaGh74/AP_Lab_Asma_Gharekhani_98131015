import ir.huri.jcal.JalaliCalendar;

/**
 * Prescription class stores a prescription and acts on it.
 * @author Asma
 * @version 1.0
 */
public class Prescription {
    // stores the date which doctor's written the prescription
    private JalaliCalendar date;
    // stores the doctor whom has written the prescription
    private Doctor doctor;
    // stores prescription (list of drugs and so on)
    private String prescription;
    // stored state of prescription (delivered or not). 0 for not-delivered and 1 for delivered.
    private int status;


    /**
     * Create a new Prescription
     */
    public Prescription(){}

    /*****************************************************************************
     * Setter methods for DoctorVisit's fields
     *****************************************************************************/
    public void setStatus(){}
    /*****************************************************************************/

    /**
     * Equality check based on date and doctor.
     * @return true if prescriptions are equal.
     */
    public boolean equals(Prescription prescription){return false;}
}
