package HomeWork7;

public class Patient {
    private int planHelping;
    private Doctor doctor;

    public Patient(int planHelping) {
        this.planHelping = planHelping;
    }

    public int getPlanHelping() {
        return planHelping;
    }

    public void setPlanHelping(int planHelping) {
        this.planHelping = planHelping;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
