package HomeWork7;

public class Therapist extends Doctor {
    @Override
    void help() {
        System.out.println("I'm all helping");
    }

    void planHelping (Patient p) {
       if (p.getPlanHelping() == 1) {
           p.setDoctor(new Surgeon());
           p.getDoctor().help();
       } else if (p.getPlanHelping() == 2) {
           p.setDoctor(new Dentist());
           p.getDoctor().help();
       } else {
           p.setDoctor(new Therapist());
           p.getDoctor().help();
       }
    }
}
