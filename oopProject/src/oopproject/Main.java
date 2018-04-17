
package oopproject;

import java.util.*;

public class Main {
 
   public static void main(String[] args) { 
       
   ArrayList <String> cardg = new ArrayList();
   ArrayList <String> cards = new ArrayList();
   ArrayList <Integer> moneys = new ArrayList();
   ArrayList <Integer> moneyg = new ArrayList();
   ArrayList <String> names = new ArrayList();
   ArrayList <String> nameg = new ArrayList();
   
   cardg.add("g00000");
   cards.add("s00000");
   
//Print in the bill    
   //LocalDate today = LocalDate.now();
   //System.out.println("Date :" + today.getDayOfWeek().toString().toLowerCase() +" "+ today.getDayOfMonth()+"-"+today.getMonthValue()+"-"+today.getYear());
   
   boolean exit = true;
   
   Process p = new Process();
   
   do{
       
   switch (p.Menu()){
       case 1 : p.Register(cards , cardg , moneys , moneyg , names , nameg);   break;
       case 2 : p.Login(cards , cardg);      break;
       case 0 : exit = false; break;         
   }
   
   }while(exit == false);
   
   //switch(p.Menus()){
     //  case 1 : //Add money break;
                                
       //case 2 : //Choose Movie break;
                                
   //}
   
    }
  
}