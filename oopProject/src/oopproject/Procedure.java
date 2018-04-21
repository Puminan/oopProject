
package oopproject;

import java.util.*;
import java.time.LocalDate;

public class Procedure extends Movie implements Time, Seat, Cbill{
    
    int moviei;
    int datei ;
    int timei ;
    double gmoney;
    double money  = 0;
    int gmovie = 150;
    int dmovie = 200;
    int vmovie = 450;
    String seati ;
    String cbilli;
    
    Scanner sc = new Scanner(System.in);
    Scanner st = new Scanner(System.in);
    
    LocalDate today = LocalDate.now();
    
    private String movie[] = {"","Monster Family", "Avengers : Infinity War", "Rampage"}; 
    private String gseat[] = {"","D01","D02","D03","D04","D05","D06","D07","D08","D09","D10",
                                 "C01","C02","C03","C04","C05","C06","C07","C08","C09","C10"};
    private String dseat[] = {"","B01","B02","B03","B04","B05","B06","B07","B08","B09","B10",};
    private String vseat[] = {"","A01","A02","A03","A04"};
    private String  date[] = {"","Mon 23","Tue 24","Wed 25","Thu 26", "Fri 27"};
    private String  time[] = {"","11:30-13:00","13:30-15:00","16:30-18:00","18:30-20:00"};
    
    public void movie(){
        
        System.out.println("\n======== MOVIE =========");
        System.out.println("MOVIE [1] >>>  " + movie[1]);
        System.out.println("MOVIE [2] >>>  " + movie[2]);
        System.out.println("MOVIE [3] >>>  " + movie[3]); 
        
    }
    
    public void date(){
        
        System.out.println("\n========= DATE =========");
        System.out.println("[1] Day : " + date[1]);
        System.out.println("[2] Day : " + date[2]);
        System.out.println("[3] Day : " + date[3]);
        System.out.println("[4] Day : " + date[4]);
        System.out.println("[5] Day : " + date[5]);
        
    }
    public void time(){
        
        System.out.println("\n========= TIME =========");
        System.out.println("[1] Time : " + time[1]);
        System.out.println("[2] Time : " + time[2]);
        System.out.println("[3] Time : " + time[3]);
        System.out.println("[4] Time : " + time[4]);
        
    }
    
    public void cbill(){
        
        System.out.println("\n========= BILL =========");
        System.out.println("DATE   : " + today.getDayOfWeek().toString() +" "+ today.getDayOfMonth()+"-"+today.getMonthValue()+"-"+today.getYear());
        System.out.println("MOVIE  : " + movie[moviei]);
        System.out.println("ROUND  : " + date[datei] + " " + time[timei]);

    }
    
    public void seat(){
        int  i=1 ;
        int  j=1 ;
        int  k=1 ;
        System.out.println("\n========= SEAT =========");
        
        for(; i<= 20; i++){
            System.out.print("["+gseat[i]+"]"+" ");
            if(i==10){
                System.out.println();
            }
        }
            System.out.println();
        for(; j<=10; j++){
            System.out.print("["+dseat[j]+"]"+" ");
        }
            System.out.println();
        for(; k<=4 ; k++){
            System.out.print("     "+"["+vseat[k]+"]"+"     ");
        }
    }
    
    public void Procedure(){
        
        System.out.println("\n========= W E L C O M E ==========");
        System.out.println("====== T H E    C E N E M A ======");
        
        do{
        this.movie();
        System.out.print("Input >>> ");
        moviei = sc.nextInt();
        }while(this.moviei!=1 && this.moviei!=2 && this.moviei !=3 );
        
        do{
        this.date();
        System.out.print("Input >>> ");
        datei = sc.nextInt();
        }while(this.datei!=1 && this.datei!=2 && this.datei!=3 && this.datei!=4 && this.datei!=5);
        
        do{
        this.time();
        System.out.print("Input >>> ");
        timei = sc.nextInt();
        }while(this.timei!=1 && this.timei!=2 && this.timei!=3 && this.timei!=4);   
        
        this.seat();
        System.out.println();
        System.out.print("Index >>> ");
        seati = st.nextLine().toUpperCase();
        for(int ii = 1 ; ii <= 20 ; ii++){
            if(gseat[ii].equals(seati)){
                money = gmovie;
           }
        }
        
        for(int jj = 1 ; jj <= 10 ; jj++){
            if(dseat[jj].equals(seati)){
                money = dmovie;    
            }
        }
        
        for(int kk = 1 ; kk <= 4 ; kk++){
            if(vseat[kk].equals(seati)){
                money = vmovie;
            }
        }
        
        this.cbill();
        System.out.println("Price  : " + money + " THB");
        do{
        System.out.print("Put Money >>> ");
        gmoney = sc.nextInt();
        }while(money>gmoney);
        System.out.println("Change : " +(gmoney-money)+ " THB" );
                
    }
    
   
    
}
