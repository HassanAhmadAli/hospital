package hospital.Model.Similarity;

import hospital.Model.Patient;

import java.util.ArrayList;

public class Distance_2 implements hospital.Interface.ISimilarity {
    public static Distance_2 inistance = new Distance_2();
    Distance_2(){};
    @Override
    public double calcSimilarity(Patient x, Double[] y_list) {
        double res = 0.0;
        Double[] x_list = x.getTestResult();

        for (int i = 0; i < 7; i++) {
            res += (x_list[i] * x_list[i]) + (y_list[i] * y_list[i]);
        }
        return Math.sqrt(res);
    }
}
