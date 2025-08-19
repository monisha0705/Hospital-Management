public class appointment {
    private int appointmentId;
    private doctor Doctor;
    private patient Patient;
    private String date;

    public int getAppointmentId() {
        return appointmentId;
    }
    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }
    public doctor getDoctor() {
        return Doctor;
    }
    public void setDoctor(doctor doctor) {
        Doctor = doctor;
    }
    public patient getPatient() {
        return Patient;
    }
    public void setPatient(patient patient) {
        this.Patient = patient;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    void bookAppointment(int id, doctor doc, patient pat, String dt){
        this.appointmentId=id;
        this.Doctor = doc;
        this.Patient = pat;
        this.date = dt;
    }

    void showAppointmentDetails(){
        System.out.println("Id: " +appointmentId);
        System.out.println("Doctor: " + Doctor.getName() + "specilization: " + Doctor.getSpecialization());
        System.out.println("Patient "+ Patient.getName() + "Disease: " + Patient.getDisease());
        System.out.println("Date of the appointment: "+ date);
    }
    
}
