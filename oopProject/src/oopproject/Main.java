
package oopproject;

import java.util.*;

public class Main {
 
   public static void main(String[] args) { 
       
   ArrayList <String> cardg = new ArrayList();
   ArrayList <String> cards = new ArrayList(); 
   
   cardg.add("g1300");
   
//Print in the bill    
   //LocalDate today = LocalDate.now();
   //System.out.println("Date :" + today.getDayOfWeek().toString().toLowerCase() +" "+ today.getDayOfMonth()+"-"+today.getMonthValue()+"-"+today.getYear());
   
   boolean exit = true;
   
   Process p = new Process();
   
   do{
       
   switch (p.Menu()){
       case 1 : p.Register(cards , cardg);   break;
       case 2 : p.Login(cards , cardg);      break;
       case 0 : exit = false; break;         
   }
   
   }while(exit != false);
   
   switch(p.Main()){
       case 1 : //Add money break;
                                
       case 2 : //Choose Movie break;
                                
   }
   
    }
  
}