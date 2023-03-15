import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           sveinson
 *  Class:          CS20S
 * 
 *  Assignment:     Parsing external mixed data example
 * 
 *************************************************************/

public class CS20SParsingExternalMixedData {

    public static void main(String[] args) throws IOException{
        // ***** constants *******
        // a new line character that works on every computer system
        final String nl = System.lineSeparator();
        // ***** variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        // employee input variables
        String firstName = "";
        String lastName = "";
        int yearlySalary = 0;
        double bonusAmount = 0.0;

        // ***** objects *****
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        BufferedReader fin = new BufferedReader(new FileReader("empData.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  Parsing External Data" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);
        //fout.print(banner);

        // ***** Get Input *****
        // ***** Main Processing *****

        strin = fin.readLine();
        //System.out.println(strin);

        while(strin != null){
            //System.out.println(strin);

            // parse input record
            tokens = strin.split(delim);

            try{
                //get name
                firstName = tokens[0];
                lastName = tokens[1];

                // get salary and bonus
                yearlySalary = Integer.parseInt(tokens[2]);
                bonusAmount = Double.parseDouble(tokens[3]);

                System.out.println(firstName + " " + lastName);
                System.out.println(yearlySalary + " " + bonusAmount);
            }// end try
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("incomplete data record, skipping current employee");
            }// end catch arry index exception
            catch(NumberFormatException e){
                System.out.println("invalid number format, skipping current employee");
            }// end catch number format exception
            
            // *** perform calculations ***
            
            
            // update control
            strin = fin.readLine();
        }// end eof

        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate
