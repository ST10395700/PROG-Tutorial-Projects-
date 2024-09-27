/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventmanagement;


import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tvnmt
 */
public class Artist {
    public String Name;
    public String Genre;
    public String Type;
    public static Scanner readLn = new Scanner (System.in);
    

    public Artist(String name,String genre,String type)
    {
        this.Name = name;
        this.Genre = genre;
        this.Type = type;
        
    }
    
     public static  void registerArtist()
     {
         
         System.out.println(" Enter Artist name ");
         String AtristName = readLn.nextLine();
         
         
         System.out.println(" Enter Artist Genre ");
         String AtristGenre = readLn.nextLine();
         
         
         System.out.println(" Enter Artist Type ");
         String AtristType = readLn.nextLine();
         
         Artist newArtist = new Artist(AtristName, AtristGenre, AtristType);
         Program.Artists.add(newArtist);
     }

}
