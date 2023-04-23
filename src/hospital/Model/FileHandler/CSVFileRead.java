package hospital.Model.FileHandler;

import java.io.BufferedReader;
import java.io.FileReader;

// performing operations needed to read data from a file and store it in an instance of History
public class CSVFileRead {
    public static void main(String[] args) {
        String file = "example.csc";
        BufferedReader reader = null;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                for (String index : row) {
                    System.out.print("%-10s");
                }
                System.out.println();
            }
        } catch (Exception e) {

        } finally {

        }

    }
}
