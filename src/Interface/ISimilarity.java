package Interface;
import Model.Patient;
// organizing similarity -aka calcSimilarity-
public interface ISimilarity {
    //a method to measure similarity -aka calcSimilarity-
    double calcSimilarity(Patient x , Patient y);
}
