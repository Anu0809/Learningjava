import java.util.Scanner;
public class a1_q9 {
    public static void main(String[] args) {
        // write your code here 
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        for (int i=2;i<n;i++){
            while(n%i==0){
                n=n/i;
                System.out.print(i+" ");
            }
        }
      }
    }
