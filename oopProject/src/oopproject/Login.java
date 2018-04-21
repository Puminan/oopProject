package oopproject;

import java.util.*;

public class Login {
    
    int touch;
    String user;
    String password;
       
//Scanner int        
        Scanner touchs = new Scanner(System.in);
//scanner String
        Scanner fulls = new Scanner(System.in);
    

   
    public void Login(String sell[] , String pass[]){
        int i = 0;
        int j = 0;
        
        System.out.println("======= L O G I N =======\n");
        do{
        System.out.print("Enter Username >> " );
        user = fulls.nextLine().toLowerCase();
        System.out.print("Enter Password >> ");
        password = fulls.nextLine();
        
        for(; i<sell.length && i<pass.length  ;i++){
            if(sell[i].equals(user) && pass[i].equals(password)){
             j=1;
        }
        }i=0;
        
        }while(j == 0);
       
    }
}
        