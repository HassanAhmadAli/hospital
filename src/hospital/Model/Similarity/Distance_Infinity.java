package hospital.Model.Similarity;

import hospital.Model.Patient;
public class Distance_Infinity implements hospital.Interface.ISimilarity {
    @Override
    public double calcSimilarity(Patient x, Patient y) {
        double res = 0.0;
        Double[] x_list = x.getTestResult();
        Double[] y_list = y.getTestResult();
        double Diff = 0;

        for (int i = 0; i < 7; i++) {
            Diff = Math.abs(x_list[i] - y_list[i]);
            if (Diff > res) res = Diff;
        }
        return res;
    }
}
