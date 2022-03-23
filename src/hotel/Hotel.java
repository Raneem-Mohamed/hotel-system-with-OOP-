/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.util.ArrayList;

/**
 *
 * @author Electronica
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="#floors: 3"+"\n "
                + "Floor#1, #Rooms: 3"+"\n"
                + "Standard, 101, 2, 25."+"\n "
                + "Standard, 102, 3, 25."+"\n "
                + "Conference, 103, 30, 5."+"\n "
                + "Floor#2, #Rooms: 2"+"\n"
                + "Standard, 201, 1, 25. "+"\n "
                + "Sweet, 202, 300"+"\n "
                + "Floor#3,#Rooms: 2"+"\n"
                + "Standard, 301, 3, 25."+"\n "
                + "Sweet, 302, 400 "+"\n ";
     String[] splited = s.split(":+");
     
     for(int i =0;i<splited.length;i++)
     {
         System.out.println(splited[i]);
         
     }
     ArrayList arrl = new ArrayList( );
      for(int i =0;i<splited.length;i++)
     {
         arrl.add(splited[i]);
         
     }
       for(int i =0;i<arrl.size();i++)
     {
         System.out.println(arrl.get(i));
         
     }
     
     
     
     
    }
    
}
