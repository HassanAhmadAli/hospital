package hospital.Model.Similarity;

import hospital.Model.Patient;

import java.util.ArrayList;

public class Distance_1 implements hospital.Interface.ISimilarity {
    public static Distance_1 inistance = new Distance_1();

    Distance_1() {
    }

    ;

    @Override
    public double calcSimilarity(Patient x, Double[] y_list) {
        double res = 0.0;
        Double[] x_list = x.getTestResult();

        for (int i = 0; i < 7; i++) {
            res += Math.abs(x_list[i] - y_list[i]);
        }
        return 0;
    }
}
