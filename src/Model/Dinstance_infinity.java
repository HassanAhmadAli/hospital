package Model;
import Interface.ISimilarity;
public class Dinstance_infinity implements  Interface.ISimilarity {
    @Override
    public double calcSimilarity(Patient x, Patient y) {
        return 0;
    }
}
