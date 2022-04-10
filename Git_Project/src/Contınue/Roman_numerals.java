package Contınue;
import java.util.*;
public class Roman_numerals {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        Roman_numerals s=new Roman_numerals();
     String x=sc.nextLine();
     int result=0;
     for(int i=0;i<x.length();i++)
     {
             result+=s.converter(x.substring(x.length()-i-1,x.length()-i).charAt(0));
             if(i!=0)
             {
                 if(s.converter(x.substring(x.length()-i-1,x.length()-i).charAt(0))<s.converter(x.substring(x.length()-i,x.length()).charAt(0)))
                 {
                     result-=s.converter(x.substring(x.length()-i-1,x.length()-i).charAt(0))*2;
                 }
             }
             
     }
           System.out.println("Roman Number: "+x);
           System.out.println("Equivalent Integer: "+result+"\n");
    }
int converter(char c)
{
     Map<Integer,String> l=new HashMap<>();
     l.put(1, "I");
     l.put(5, "V");
     l.put(10, "X");
     l.put(50, "L");
     l.put(100, "C");
     l.put(500, "D");
     l.put(1000, "M");
     if(l.get(1).charAt(0)==c)
     {
         return 1;
     }
     else if(l.get(5).charAt(0)==c)
             {
                 return 5;
             }
     else if(l.get(10).charAt(0)==c)
             {
                 return 10;
             }
     else if(l.get(50).charAt(0)==c)
             {
                 return 50;
             }
     else if(l.get(100).charAt(0)==c)
             {
                 return 100;
             }
     else if(l.get(500).charAt(0)==c)
             {
                 return 500;
             }
     else if(l.get(1000).charAt(0)==c)
             {
                 return 1000;
             }
     else
     {
         System.out.println("Incorrect input...");
         System.exit(0);
         return 0;
     }
}
}

