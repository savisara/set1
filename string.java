import java.util.*;
public class smallsub
{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         String s1=Integer.ParseInt(s);
         int l=s.length();
         for(int i=0;i<5;i++)
         {
             if(i==l)
             System.out.print(l);
         else
         System.out.print("not a given length");
     }
}
}