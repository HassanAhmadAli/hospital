package hospital.Model;

import hospital.Exceptions.ElementNotExistException;
import hospital.Exceptions.WrongFileException;
import hospital.Interface.ISimilarity;

import java.io.IOException;
import java.util.Scanner;

// from ali.saeed
public class Run {
    public History history;

    public Run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a csv file path (default is \"example.csv\") :");
        try {
            String str = sc.nextLine();
            if (str.equals(""))
                str = "example.csv";
//            while (history == null)
            history = new History(str);
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch (WrongFileException e) {
            System.out.println("Wrong File Exception");
        } catch (ElementNotExistException e) {
            System.out.println("Element Not Exist Exception");
        } finally {

        }
    }

    public boolean GetExpectation(ISimilarity similarity, Double[] res) {

        return GetExpectation.get_Expectation(similarity, res, history);
    }

}
