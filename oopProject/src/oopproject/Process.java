package oopproject;

import java.util.*;

public class Process {
    
    //Cheack member of card
        String card;
    //create cards and cardg
        String cmember;
        String member;

    //variable CArd String ArrayList
        String rcards;
        String rcardg;
        String name;
    //switch       
        int touch;
        int i = 0;
//Scanner int        
        Scanner touchs = new Scanner(System.in);
//scanner String
        Scanner fulls = new Scanner(System.in);
    
    public int Menu(){ 
        
        do{   
            
        System.out.println("======= The Cenema ======");
        System.out.println(  "[1] Register"
                         + "\n[2] Login"
                         + "\n[0] Exit");
            System.out.print("Input >>> ");
            touch = touchs.nextInt();
               
            if(touch > 2){
                    
                    System.out.print("Try again...\n");
            }       
        }while(touch > 2); 
        
        return touch;
    }
    
    public boolean Register(ArrayList<String> cards , ArrayList<String> cardg , ArrayList<Integer> moneys , ArrayList<Integer> moneyg , ArrayList<String> names , ArrayList<String> nameg){
        
        String student = null;
        boolean list1 = true;
        System.out.println("\n====== Register ======");
       
        do{
            System.out.print("Are you student [Y/N] >> ");
            student = fulls.nextLine().toUpperCase();
        }while(!"Y".equals(student) && !"N".equals(student));
        
        if("Y".equals(student)){
          
    //Let s = syudent card + 5 nenber.
                String cmember = "s";
                
            do{
                System.out.print("Entre your name >> ");
                    this.name = fulls.nextLine().toUpperCase(); 
                System.out.print("Put your five number >> " + cmember);
                    member = fulls.nextLine();
                this.rcards = cmember+member;
                cards.add(this.rcards);
                moneys.add(0);
                names.add(this.name);
            }while(member.length() != 5);  
            
        }else{
            
    //Let g = general card + 5 nember.
                String cmember = "g";
                
            do{
                System.out.print("Entre your name >> ");
                    this.name = fulls.nextLine().toUpperCase(); 
                System.out.print("Put your five munber >> " + cmember);
                    member = fulls.nextLine(); 
                this.rcardg = cmember+member;
                cardg.add(this.rcardg);
                moneyg.add(0);
                nameg.add(this.name);
            }while(member.length() != 5);    
            
        }  
        
        Login(cards , cardg);
        
        return list1;
               
    }
    
    public String Login(ArrayList<String> cards , ArrayList<String> cardg){
        
        boolean list2 = true;
        
        System.out.println("\n====== Login ======");
        System.out.print("Number a member card >> " );
        card = fulls.nextLine();
 
        for(; i<cards.size() || i<cardg.size(); i++){
            //System.out.println(cards.get(i));
            for(; cards.get(i).equals(card) || cardg.get(i).equals(card) ; i++){
                Menus();
            list2=false;
            }
        }
        
        return card;
    }
    
    public int Menus(){
        
        boolean list3 = true;
        
        do{
        System.out.println("======= Menu =======");
        System.out.println("[1] Add money"
                       + "\n[2] Choose Movie");
        System.out.print("Input >>> ");
        touch = touchs.nextInt();
            if(touch < 1 || touch > 2){
                list3 = false;
                System.out.println("Try again...\n");
            }    
        }while(touch < 1 || touch > 2);        
           
        return touch;
    }
}
