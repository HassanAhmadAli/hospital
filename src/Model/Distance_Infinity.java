package Model;

public class Distance_Infinity implements Interface.ISimilarity {
    @Override
    public double calcSimilarity(Patient x, Patient y) {
        return 0;
    }
}
