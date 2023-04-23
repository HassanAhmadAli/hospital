package hospital.Model;

//express some patient's data
public class Patient {


    public Double[] getTestResult() {
        return testResult;
    }

    public boolean isDanger() {
        return isDanger;
    }

    /**
     * list of 7 double values (Medical Test Results)
     */
    protected final Double[] testResult;
    /**
     * a bool determining patient's status
     */
    protected final boolean isDanger;

    public Patient(Double[] testResult, boolean isDanger) {
        this.isDanger = isDanger;
        this.testResult = testResult;
    }

    @Override
    public String toString() {
        String res = "";
        res += ("Results: \n");
        for (int i = 0; i < 6; i++)
            res += ((this.testResult[i]).toString() + ",");
        res += (this.testResult[7].toString() + "\n Statue: ");
        if (this.isDanger) res += ("Danger\n");
        else res += ("Not In Danger\n");
        return res;
    }
}
