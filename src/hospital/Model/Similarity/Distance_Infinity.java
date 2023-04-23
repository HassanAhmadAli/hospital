package hospital.Model.Similarity;

import hospital.Model.Patient;

public class Distance_Infinity implements hospital.Interface.ISimilarity {
    public static Distance_Infinity inistance = new Distance_Infinity();

    Distance_Infinity() {
    }

    ;

    @Override
    public double calcSimilarity(Patient x, Double[] y_list) {
        double res = 0.0;
        Double[] x_list = x.getTestResult();
                double Diff = 0;

        for (int i = 0; i < 7; i++) {
            Diff = Math.abs(x_list[i] - y_list[i]);
            if (Diff > res) res = Diff;
        }
        return res;
    }
}
