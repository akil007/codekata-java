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
       str=str.replaceAll("[!,@,#,$,.,:,;]", ".");
       int n= str.length();
       int count=0;
       char ch[]=str.toCharArray();
       for(int i=0;i<n;i++)
       {
           if(ch[i]=='.')
           {
               count++;
           }
       }
       System.out.println(count);
       
    }
}


