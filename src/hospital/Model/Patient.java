package hospital.Model;

import java.util.ArrayList;

//express some patient's data
public class Patient {
    //list of 7 double values (Medical Test Results)

    private ArrayList<Double> testResult;

    //a string determining patient's status
    private String Statue;


    public ArrayList<Double> getTestResult() {
        return testResult;
    }

    public void setTestResult(ArrayList<Double> testResult) {
        this.testResult = testResult;
    }

    public String getStatue() {
        return Statue;
    }

    public void setStatue(String statue) {
        Statue = statue;
    }

    public Patient() {
        setTestResult(new ArrayList<>(7));
    }

}
