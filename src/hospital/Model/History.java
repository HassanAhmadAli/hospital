package hospital.Model;

import hospital.Exceptions.ElementNotExistException;
import hospital.Exceptions.WrongFileException;
import hospital.Model.FileHandler.CSV_Patient_Data_Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
//expresses all patients' data that are dealt with to generate expectations
public class History {
    //linked list of patients
    LinkedList<Patient> Patients;
    String[] names;


    History(String file) throws IOException, WrongFileException, ElementNotExistException {
        Patients = new LinkedList<>();
        ArrayList<String[]> set = CSV_Patient_Data_Reader.read(file);
        boolean isHeaders = true;
        names = new String[7];


        String temp_dangerState_String;
        Double[] temp_res = new Double[7];
        boolean temp_dangerState_boolean;

        int i;


        for (String[] element : set) {
            if (isHeaders) {
                isHeaders = false;
                {
                    if (element.length == 7)
                        names = element;
                    else throw new WrongFileException();
                }

            } else {
                for (i = 0; i < 7; i++) {
                    temp_res[i] = Double.parseDouble(element[i]);
                }
                // check the state of Danger of the Patient
                {
                    temp_dangerState_String = (element[7]);
                    if ((temp_dangerState_String.equalsIgnoreCase("high")) || (temp_dangerState_String.equalsIgnoreCase("is high")) || (temp_dangerState_String.equalsIgnoreCase("true")))
                        temp_dangerState_boolean = true;
                    else if ((temp_dangerState_String.equalsIgnoreCase("low")) || (temp_dangerState_String.equalsIgnoreCase("is low")) || (temp_dangerState_String.equalsIgnoreCase("false")))
                        temp_dangerState_boolean = false;
                    else throw new WrongFileException();
                }
                Patient temp = new Patient(temp_res, temp_dangerState_boolean);
                Patients.add(temp);
            }
        }
    }


}