
package oopproject;


import java.util.*;

public class Main {
 
   public static void main(String[] args) { 
       String sell[] = {"puminan","praewrung"};
       String pass[] = {"026","045"};
   
   Login     l = new Login();
   Procedure   p = new Procedure();
    
   l.Login(sell,pass);
   p.Procedure();
   
   }
  
}