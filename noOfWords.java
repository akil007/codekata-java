package sieves;
import java.util.*;
/**
 *
 * @author akil
 */
public class Sieves {

    
   
    public static void main(String a[]){
       Scanner scan= new Scanner(System.in);
       String str= scan.nextLine();
       str=str.trim();
       int n= str.length();
       int count=0;
       char[] ch = str.toCharArray();
       for(int i=0;i<n;i++)
       {
           
           
           if(ch[i]==' ')
           {
               if(ch[i+1]!=' ')
               {
                   count++;
               }
               
           }
       }
       System.out.println(1+count);
        
        
 
    }
}
