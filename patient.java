public class patient extends person {
    private int patientid;
    private String disease;

    public int getPatientid() {
        return patientid;
    }
    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    @Override
    void showDetails(){
        System.out.println("Name of the patient: "+ getName());
        System.out.println("Age: "+ getAge());
        System.out.println("Gender: "+getGender());
        System.out.println("Id: "+ getPatientid());
        System.out.println("Disease: "+getDisease());
    }
}
