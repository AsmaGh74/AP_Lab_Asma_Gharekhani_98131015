import ir.huri.jcal.JalaliCalendar;

/**
 * Disease defines different kinds of diseases.
 */
enum Disease {}

/**
 * This class defines security level for every disease.
 * Some disease like common cold have low security level and it is ok if other people know about it.
 * But some other disease like AIDS have high security level and it is important to remain as a secret.
 */
enum DiseaseSecurityLevel{}
/**
 * DoctorVisit class records all details when patient visits a doctor.
 * @author Asma
 * @version 1.0
 */
public class DoctorVisit {
    // stores the date which the patient's visited the doctor
    private JalaliCalendar date;
    // stores the doctor whom the patient's visited
    private Doctor doctor;
    // stores disease type
    private Disease diseaseType;
    // stores patient history. information that patient gives to doctor
    private String patientHistory;
    // stores doctor's
    private String doctorDiagnosis;
    // stores security level of the disease
    private DiseaseSecurityLevel diseaseSecurityLevel;
    // stores doctor's prescription
    private Prescription prescription;

    /**
     * Create a new DoctorVisit
     */
    public DoctorVisit(){}

    /*****************************************************************************
     * Getter methods for DoctorVisit's fields
     *****************************************************************************/
    public Prescription getPrescription(){return prescription;}
    /*****************************************************************************/

    /**
     * Print all details about DoctorVisit.
     */
    public void printInfo(){}


}
