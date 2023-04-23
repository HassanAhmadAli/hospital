package hospital.Model;

import hospital.Exceptions.ElementNotExistException;
import hospital.Exceptions.WrongFileException;
import hospital.Interface.ISimilarity;
import hospital.Model.FileHandler.CSV_Patient_Data_Reader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import hospital.Interface.ISimilarity;
//expresses all patients' data that are dealt with to generate expectations
public class History {
    //linked list of patients
    LinkedList<Patient> Patients;
    String[] names;
    int size;

    History(String file) throws IOException, WrongFileException, ElementNotExistException {
        size = 0;
        ArrayList<String[]> set = CSV_Patient_Data_Reader.read(file);
        boolean isHeaders = true;
        names = new String[7];
        int nameIndex = -1;
        int StateOfDangerIndex = -1;
        String temp_name = "";
        String temp_dangerState_String = "";
        Double[] temp_res = new Double[7];
        boolean temp_dangerState_boolean = true;

        int i = 0;
        int j = 0;

        for (String[] element : set) {
            if (isHeaders) {
                isHeaders = false;
                {
                    for (i = 0; i < 9; i++) {
                        if ((element[i].equalsIgnoreCase("name")) || (element[i].equalsIgnoreCase("names")))
                            nameIndex = i;
                        else if ((element[i].equalsIgnoreCase("danger")) || (element[i].equalsIgnoreCase("dangerous")) || (element[i].equalsIgnoreCase("is danger")) || (element[i].equalsIgnoreCase("is dangerous")))
                            StateOfDangerIndex = i;
                        else names[j] = element[i];

                    }
                    if (nameIndex == -1 || StateOfDangerIndex == -1) {
                        throw new WrongFileException();
                    }
                }

            } else {
                size++;
                j = 0;


                for (i = 0; i < 9; i++) {
                    if (((i != nameIndex)) && (i != StateOfDangerIndex)) {
                        temp_res[j] = Double.parseDouble(element[i]);
                        j++;
                    }
                }
                // check the state of Danger of the Patient
                {
                    temp_dangerState_String = (element[StateOfDangerIndex]);
                    if ((temp_dangerState_String.equalsIgnoreCase("high")) || (temp_dangerState_String.equalsIgnoreCase("is high")) || (temp_dangerState_String.equalsIgnoreCase("true")))
                        temp_dangerState_boolean = true;
                    else if ((temp_dangerState_String.equalsIgnoreCase("low")) || (temp_dangerState_String.equalsIgnoreCase("is low")) || (temp_dangerState_String.equalsIgnoreCase("false")))
                        temp_dangerState_boolean = false;
                    else throw new WrongFileException();
                }
                Patient temp = new Patient(temp_res, temp_dangerState_boolean, element[nameIndex]);
            }
        }
    }


}