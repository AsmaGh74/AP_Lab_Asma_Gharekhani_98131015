/**
 * Specialty class defines different types of Doctor's specialties.
 */
enum Specialty {}

/**
 * Doctor class stores a Doctor's info and acts on them.
 * @author Asma
 * @version 1.0
 */
public class Doctor extends Human{
    // stores Doctor's specialty
    private Specialty specialty;

    /**
     * Create a new Doctor with specific name, gender, and id.
     * @param firstName Doctor's first name
     * @param lastName Doctor's last name
     * @param gender Doctor's gender
     * @param id Doctor's id
     */
    public Doctor(String firstName, String lastName, Gender gender, String id){
        super(firstName, lastName, gender, id);
    }

    /*****************************************************************************
     * Setter methods for Doctor's fields
     *****************************************************************************/
    public void setSpecialty(Specialty specialty){}
    /*****************************************************************************/

    /**
     * Print Doctor's info.
     */
    public void printInfo(){}

    /**
     * Check if two Doctors are the same.
     * @param human Human to be checked
     * @return true if two Doctors are the same.
     */
    @Override
    public boolean equals(Human human) {
        return false;
    }

    /**
     * Create a new DoctorVisit for patient and set the prescription for it.
     * Also add created DoctorVisit to patient's medical record.
     */
    public void prescribe(){}

    /**
     * Add a new doctor to patient's trustworthy doctors, also determine
     * the access level for doctor.
     */
    public void addNewDoctorToPatientDoctors(){}
}
