import java.util.ArrayList;

/**
 * AccessLevel class defined access levels to patient's medical record.
 */
enum AccessLevel{FULL}
/**
 * CentralizedHealthCareSystem class implements a centralized health care system.
 * It holds a list of Patient's and acts on their medical records.
 * @author Asma
 * @version 1.0
 */
public class CentralizedHealthCareSystem {
    // stores name of CentralizedHealthCareSystem
    private final String name = "Health System";
    // stores a list of Patients
    private ArrayList<Patient> patients;

    /**
     * Create a new centralized health care system
     */
    public CentralizedHealthCareSystem(){
        patients = new ArrayList<>();
    }

    /**
     * Search patients list and if the patient is in the list return her/his medical record.
     * This method uses equals method in Patient's class.
     * This method can use logged in user's access level.
     * @param patient the patient we are looking for her/his medical record
     * @return patient's medical record
     */
    public MedicalRecord getPatientMedicalRecord(Patient patient){return patient.getMedicalRecord();}

    /**
     * Get patient's medical record by getPatientMedicalRecord method and
     * show it in an appropriate way to the user.
     */
    public void showMedicalRecord(){}

    /**
     * Set a access level for logged in user.
     * For a patient it's full access by default.
     * For a doctor it can get from patient's trustworthyDoctors field.
     * @param human the user for whom we want to set an access level
     */
    public void setAccessLevelForLoggedInUser(Human human){};

    /**
     * Set a password for every user.
     * The password should be checked to be a valid one.
     * @param human the user for whom we want to set a password
     */
    public void setPasswordForUser(Human human){}

    /**
     * Check for user's information and password validity and
     * if every thing is ok confirm login with a appropriate message and also
     * return true.
     * @return true if the user's logged in
     */
    public boolean confirmUserLogin(){return false;}
}
