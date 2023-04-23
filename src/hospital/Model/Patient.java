package hospital.Model;

//express some patient's data
public class Patient {

    public Double[] getTestResult() {
        return testResult;
    }
    public boolean isDanger() {
        return isDanger;
    }
    public String getName() {
        return Name;
    }
    /**
     *list of 7 double values (Medical Test Results)
     */
    protected final Double[] testResult;
    /**
     * a bool determining patient's status
     */
    protected final boolean isDanger;
    /**
     * the Name of the Patient
     */
    protected final String Name;

    public Patient(Double[] testResult, boolean isDanger, String name) {
        this.isDanger = isDanger;
        this.Name = name;
        this.testResult = testResult;
    }

}
