package hospital.Model.FileHandler;

import java.io.*;
import java.util.ArrayList;

// performing operations needed to read data from a file and store it in an instance of History
public class CSVFileRead {
    public void read() throws IOException {
        String file = "example.csc";
        BufferedReader reader = null;
        String line = "";
        var InputtedData = new ArrayList<ArrayList<String>>();
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] rows = line.split(",");
                ArrayList<String> rowData = new ArrayList<>();


                System.out.println();
            }
        } catch (FileNotFoundException f) {
            System.out.println();
            f.printStackTrace();
        } catch (SecurityException s) {
            System.out.println("Security Exception: " + s);

        } finally {
            assert reader != null;
            reader.close();
        }

    }
}
