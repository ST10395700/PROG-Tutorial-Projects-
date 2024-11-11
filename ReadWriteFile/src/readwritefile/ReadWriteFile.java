/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readwritefile;
import java.io.BufferedInputStream.*;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author tvnmt
 */
public class ReadWriteFile {

    /**
     * @param args the command line arguments
     */
    
    public void writeFile()
    {
        File myFile = new File("C:\\Users\\tvnmt\\OneDrive\\Desktop\\Tutor\\PROG\\Prog Tutoral Repo\\PROG-Tutorial-Projects-\\ReadWriteFile");
        
        if(!myFile.exists())
        {
            try {
                myFile.createNewFile();
            } catch (IOException e) {
            }
        }
    }
      public void readFile()
    {
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
