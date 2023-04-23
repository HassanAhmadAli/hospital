import hospital.Model.Run;
import hospital.Model.Similarity.Distance_1;

public class Main {

    public static void main(String[] args) {
        Run run = new Run();
        Double[] res = new Double[7];
        for (int i = 0; i < 7; i++)
            res[i] = (double) i;
        res[4] = Double.valueOf(8);
        System.out.println(run.GetExpectation(Distance_1.inistance, res));
    }
}
/*
 *todo:
 *
 *
 *
 *
 */