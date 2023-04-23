package hospital.Model;

// performing the algorithm needed to achieve our goal

import hospital.Model.Similarity.Distance_1;
import hospital.Interface.ISimilarity;

public class GetExpectation {
    public static boolean GetExpectation(ISimilarity T, Patient x, History history) {
        double res = 0;
        Patient Nearest_Patient = history.Patients.get(0);
        double temp_res;
        for (Patient p : history.Patients) {
            temp_res = T.calcSimilarity(x, p);
            if (temp_res < res) {
                res = temp_res;
                Nearest_Patient = p;
            }
        }
        return Nearest_Patient.isDanger;

    }
// list of k patients is the nearest among all patients in an instance of history (using some similarity methods)
}