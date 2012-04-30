
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhatti
 */
public class WriteManager {

    public WriteManager() {
    }

    public void save(String n, String m) {

        try{
        // Create file 
            FileWriter fstream = new FileWriter("OUT.txt");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(n);
            //Close the output stream
            out.close();
    }catch (Exception e){//Catch exception if any
        System.err.println("Error: " + e.getMessage());
    }

    }
}
