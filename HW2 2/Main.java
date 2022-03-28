import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Employee> employees = new ArrayList<>();
        try {
            File file1 = new File("Cis3130_HW\\HW2\\Personell.txt");
            Scanner sc = new Scanner(file1);
            while (sc.hasNext()) {
                String employeeNumber = sc.nextLine();
                //System.out.println(employeeNumber);
                String names = sc.nextLine();
                //System.out.println(names);
                String[] namesArr = names.split(" ");
                Name name = new Name(namesArr[0], namesArr[1]);
                //System.out.println(name);

                String streetAndNumbers = sc.nextLine();
                String[] streetsAndNumbers = streetAndNumbers.split(" ");
                String number = streetsAndNumbers[0];
                String streetName = "";
                for (int i = 1; i < streetsAndNumbers.length; i++) {
                    streetName = streetName + streetsAndNumbers[i] + " ";
                }
                String cityStateZips = sc.nextLine();
                String[] citys = cityStateZips.split(",");
                String city = citys[0].toString();
                String stateAndZip = citys[1].toString();
                String[] stateAndZips = stateAndZip.split(" ");
                String state = "";
                for (int i = 0; i < stateAndZips.length - 1; i++) {
                    state = state + stateAndZips[i] + "";
                }
                String zip = stateAndZips[stateAndZips.length-1].toString();
                Address addresses = new Address(number, streetName, city, state, zip);
                //System.out.println(addresses);
                Employee employee = new Employee(employeeNumber, name, addresses);
                employees.add(employee);
                System.out.println(employee);
                

               
                //System.out.println(addresses);
                
                //System.out.println(cityStateZips);
                String payRates = sc.nextLine();
                //System.out.println(payRates);
                String emptyLine = sc.nextLine();
            }
            //Finished up reading Personell file to all classes.  is confirmed by printing employyes ArrayList.  Now on to calclating pay.
            
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
}
