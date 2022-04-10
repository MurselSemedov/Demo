package Contınue;
import java.util.*;
public class HashSet_Example {
    public static void main(String[] args) {
       Set  <? super String>  color=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        boolean t=true;
        int c=Color_Enum.size();
        while(t)
        {
             String x=sc.nextLine();
             try
             {
             if(x.equals(Color_Enum.valueOf(x).toString()))
             {
                 boolean z=color.add(x);
                 if(!z)
                 {
                     System.out.println("Duplicate value, enter a different color.");
                 }
                 else
                 {
                     c--;
                 }
             }
             }
             catch(IllegalArgumentException iae)
             {
                 System.out.println("There is no such color");
             }
             if(c==0)
             {
                 System.out.println("All colors found...");
                 color.forEach((a)->System.out.println(a));
                 t=false;
             }
        }
    }
}
