import java.util.Scanner;
public class a1_q8 {
       public static void main(String[] args) {
     // write your code here
     Scanner scn=new Scanner(System.in);
     int n=scn.nextInt();
     int k=scn.nextInt();
     
     String n1 = String.valueOf(n);
     int l=n1.length()-k;
     
     int x=(n)%((int)Math.pow(10,k));
     
     n=n/(int)Math.pow(10,k);

     int a=(x)*(int)Math.pow(10,l);
     
     int r=a+n;
     System.out.println(r);
    }
   }
