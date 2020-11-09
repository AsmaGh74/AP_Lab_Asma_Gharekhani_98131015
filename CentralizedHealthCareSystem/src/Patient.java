import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * BasicInsurance class defines basic insurance types.
 */
enum BasicInsuranceType{}

/**
 * SupplementalInsurance class defines supplemental insurance types.
 */
enum SupplementalInsuranceType{}

/**
 * EducationDegree class defines different levels of degree of education
 */
enum EducationDegree{}
/**
 * Patient class stores a Patient's info and acts on them.
 * @author Asma
 * @version 1.0
 */
public class Patient extends Human{
    // stores Patient's birth date
    private JalaliCalendar birthDate;
    // stores Patient's basic insurance type
    private BasicInsuranceType basicInsuranceType;
    // stores Patient's supplemental insurance type
    private SupplementalInsuranceType supplementalInsuranceType;
    // stores Patient's education degree level
    private EducationDegree educationDegree;
    // stores Patient's job
    private String job;
    // stores Patient's home address ( for simplicity we define address as a String but we can have a HomeAddress class)
    private String homeAddress;
    // stores geographical location for Patient's home
    private GeographicalLocation geographicalLocation;
    // map of Patient's trustworthy Doctors and their access level to patient's medical record
    private HashMap<Doctor, AccessLevel> trustworthyDoctors;
    // stores Patient's medical record
    private MedicalRecord medicalRecord;

    /**
     * Create a new Patient with specific name, gender, and id.
     * @param firstName Patient's first name
     * @param lastName Patient's last name
     * @param gender Patient's gender
     * @param id Patient's id
     */
    public Patient(String firstName, String lastName, Gender gender, String id){
        super(firstName, lastName, gender, id);
        birthDate = new JalaliCalendar();
        trustworthyDoctors = new HashMap<>();
        super.setAccessLevel(AccessLevel.FULL);
    }
    /*****************************************************************************
     * Getter methods for Patient's fields
     *****************************************************************************/
    public MedicalRecord getMedicalRecord(){return medicalRecord;}
    /*****************************************************************************/
    /*****************************************************************************
     * Setter methods for Patient's fields
     *****************************************************************************/
    public void setBirthDate(JalaliCalendar birthDate){}
    public void setBasicInsuranceType(BasicInsuranceType basicInsuranceType){}
    public void setSupplementalInsuranceType(SupplementalInsuranceType supplementalInsuranceType){}
    public void setEducationDegree(EducationDegree educationDegree){}
    public void setJob(String job){}
    public void setHomeAddress(String homeAddress){}
    public void setGeographicalLocation(GeographicalLocation geographicalLocation){}
    /******************************************************************************/

    /**
     * Print Patient's info.
     */
    public void printInfo(){}

    /**
     * Check if two Patients are the same.
     * @param human Human to be checked
     * @return true if two Patients are the same
     */
    @Override
    public boolean equals(Human human) {
        return false;
    }

    /**
     * Take a doctor and return doctor's access level to patient's medical record.
     * @param doctor the doctor we are looking for his/her access level to patient's medical record.
     * @return  doctor's access level
     */
    public AccessLevel getDoctorAccessLevel(Doctor doctor){
        return trustworthyDoctors.get(doctor);
    }

    /**
     * Add a new doctor to patient's trustworthy doctors, also determine
     * the access level for doctor.
     * It should done by another doctor that is in the
     * patient's trustworthy doctors list.
     */
    public void addDoctor(){}

    /**
     * When patient visits a doctor add it to patient's medical record.
     * @param doctorVisit  DoctorVisit to be added to patient's medical record
     */
    public void addDoctorVisitToMedicalRecord(DoctorVisit doctorVisit){medicalRecord.addToDoctorVisits(doctorVisit);}
}
