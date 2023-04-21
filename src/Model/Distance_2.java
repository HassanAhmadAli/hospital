package Model;

import Interface.ISimilarity;

import java.util.ArrayList;

public class Distance_2 implements Interface.ISimilarity {
    @Override
    public double calcSimilarity(Patient x, Patient y) {
        double res = 0.0;
        ArrayList<Double> x_list = x.getTestResult();
        ArrayList<Double> y_list = y.getTestResult();
        for (int i = 0; i < 7; i++) {
            double Diff = (x_list.get(i) * x_list.get(i)) + (y_list.get(i) * y_list.get(i));
            res += Diff;
        }
        return Math.sqrt(res);
    }
}
