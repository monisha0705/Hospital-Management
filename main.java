public class main {
    public static void main(String args[]){
        doctor d1 = new doctor();
        d1.setDoctorid(1);
        d1.setName("Dr.Monisha");
        d1.setAge(21);
        d1.setGender("Female");
        d1.setSpecialization("Cardiology");

        patient p1 = new patient();
        p1.setPatientid(201);
        p1.setName("John Doe");
        p1.setAge(30);
        p1.setGender("Male");
        p1.setDisease("Heart Problem");

        appointment a1 = new appointment();   // default constructor is used
        a1.bookAppointment(301, d1, p1, "2025-08-20");  
        a1.showAppointmentDetails();

    }

}
