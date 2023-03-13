import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           your name
 *  Class:          CS20S
 * 
 *  Assignment:     EOF of int example
 * 
 *************************************************************/

public class CS20SEOFLooprOfIntData {

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
        
        int n = 0;              // number read from the data file
        int sum = 0;            // sum of the numbers in the data file

        // ***** objects *****
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        BufferedReader fin = new BufferedReader(new FileReader("FileOfInts.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  int eof example" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);
        //fout.print(banner);

        // ***** Get Input *****
        // ***** Main Processing *****
        
        // pre-loop processing
        sum = 0;
        
        // eof loop
        strin = fin.readLine();
        // parse input data
        /* the following is for non-eof
         * loops, the termination condition
         * might be someting like n == 0
         */
        //n = Integer.parseInt(strin);
        
        while(strin != null){
            System.out.println(strin);
            
            // parse input data
            n = Integer.parseInt(strin);
                        
            // add the numbers
            sum += n;
            
            // update loop control
            strin = fin.readLine();
            
            /* the following is for non-eof
             * loops, the termination condition
             * might be someting like n == 0
             */
            //n = Integer.parseInt(strin);
        }// end eof
        
        // post loop
        System.out.println("Sum = " + sum);

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
