package hospital.Model;

import java.util.LinkedList;

//expresses all patients' data that are dealt with to generate expectations
public class History {
    //linked list of patients
    LinkedList<Patient> Patients;

    History() {
        Patients = new LinkedList<>();
    }

}
