package hospital.Model.Similarity;

import hospital.Model.Patient;

import java.util.ArrayList;

public class Distance_1 implements hospital.Interface.ISimilarity {
    @Override
    public double calcSimilarity(Patient x, Patient y) {
        double res = 0.0;
        Double[] x_list = x.getTestResult();
        Double[] y_list = y.getTestResult();
        for (int i = 0; i < 7; i++) {
            res += Math.abs(x_list[i] - y_list[i]);
        }
        return 0;
    }
}
