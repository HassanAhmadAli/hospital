package hospital.Model.Similarity;

import hospital.Model.Patient;

import java.util.ArrayList;

public class Distance_1 implements hospital.Interface.ISimilarity {
    @Override
    public double calcSimilarity(Patient x, Patient y) {
        double res = 0.0;
        ArrayList<Double> x_list = x.getTestResult();
        ArrayList<Double> y_list = y.getTestResult();
        for (int i = 0; i < 7; i++) {
            double abs = Math.abs(x_list.get(i) - y_list.get(i));
            res += abs;
        }

        return 0;

    }


}
