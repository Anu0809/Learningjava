import java.util.Scanner;
public class a1_q6 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        while( n>0){
           int x=n%10;
            System.out.println(x);
            n=n/10;
            
        }
      } 
   }
