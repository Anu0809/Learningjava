import java.util.Scanner;
public class a1_q7 {
    public static void main(String[] args) {
        // write your code here  
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        
        int inv=0;
        int c=1;
        while(n>0){
            int x=n%10;
            
            inv=inv+ c*(int)Math.pow(10,x-1);
            c++;
            n=n/10;
        }
        System.out.println(inv);
       }
      }
