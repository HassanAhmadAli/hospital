package hospital.Model.FileHandler;

import hospital.Exceptions.ElementNotExistException;
import hospital.Exceptions.WrongFileException;

import java.io.*;
import java.util.ArrayList;

// performing operations needed to read data from a file and store it in an instance of History
public class CSV_Patient_Data_Reader {

    public static ArrayList<String[]> read(String file) throws IOException, ElementNotExistException, WrongFileException {
        BufferedReader reader = null;
        String line = "";
        var res = new ArrayList<String[]>();
        try {
            reader = new BufferedReader(new FileReader(file));
            boolean isHeader = true;
            while ((line = reader.readLine()) != null) {
                String[] strings = line.split(",");
                if (isHeader) {
                    isHeader = false;
                    if (strings.length == 7) {
                        res.add(strings);
                    } else
                        throw new ElementNotExistException();
                } else {
                    if (strings.length == 8) {
                        res.add(strings);
                    } else {
                        throw new ElementNotExistException();
                    }
                }


            }
        } catch (
                FileNotFoundException f) {
            throw new WrongFileException();
        } finally {
            if (reader != null)
                reader.close();
        }
        return res;
    }
//

}
