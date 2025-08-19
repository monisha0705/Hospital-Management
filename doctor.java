public class doctor extends person{
    private String specialization;
    private  int doctorid;
    
    public int getDoctorid() {
        return doctorid;
    }
    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    void showDetails(){
        System.out.println("Doctorid is "+ doctorid);
        System.out.println("Doctor name is "+getName());
        System.out.println("Doctor age is "+getAge());
        System.out.println("Doctor gender is "+getGender());
        System.out.println("Doctor Specialization is "+getSpecialization());
    }
}