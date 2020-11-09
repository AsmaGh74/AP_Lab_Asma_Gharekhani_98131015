import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;

/**
 * MedicalRecord class holds Patient's medical record and acts on them.
 * @author Asma
 * @version 1.0
 */
public class MedicalRecord {
    // stores a list of DoctorVisits for patient
    private ArrayList<DoctorVisit> doctorVisits;
    //stores a list of prescriptions. this field can be useful for pharmacy doctors.
    private ArrayList<Prescription> prescriptions;
    // stores a list of diseases that patient has had so far, this field can used for giving a brief description to patient
    private ArrayList<Disease> diseases;

    /**
     * Create a new MedicalRecord.
     */
    public MedicalRecord(){}

    /*****************************************************************************
     * Getter methods for DoctorVisit's fields
     *****************************************************************************/
    public ArrayList<Prescription> getPrescriptions(){return prescriptions;}
    /*****************************************************************************/

    /**
     * When Patient visits a doctor, it's details should be considered and stores here.
     * Also add the prescription of the DoctorVisit to prescriptions list.
     * @param doctorVisit  DoctorVisit to be added to the list
     */
    public void addToDoctorVisits(DoctorVisit doctorVisit){}

    /**
     * Add a new disease to patient's diseases list.
     */
    public void addToDisease(){}

    /**
     * Search prescriptions list based on date and doctor then return the matched prescription.
     * @param date prescription's date
     * @param doctor doctor who has written the prescription
     * @return matched prescription
     */
    public Prescription searchPrescriptionsList(JalaliCalendar date, Doctor doctor){return prescriptions.get(0); }// just for error fixing

    /**
     * Show doctorVisits list (in detail).
     */
    public void printDoctorVisits(){}
}
