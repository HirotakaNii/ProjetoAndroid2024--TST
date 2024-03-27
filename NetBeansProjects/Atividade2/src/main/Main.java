
package main;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner ja = new Scanner (System.in); 
         
        
       int tab,num=1,result;
     
        System.out.println("Qual tabuada você deseja?:");
         tab=ja.nextInt();
         System.out.println("tabuada: " +tab); 
        while (num<=9){
        
            num++;
            result=tab*num;
            
           System.out.println("tabuada:" +result); 
         
          
           }
        
           
           
        }
            
            
            
    }
    
