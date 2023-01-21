import java.util.Scanner;

public class a1_q5 {
    
  
        public static void main(String[] args) {
          // write your code here
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          
          int count=0;
          int i=n;
          while(i>0){
              count++;
              i=i/10;
          }    
          System.out.println("The number of digits are "+count);    
      
        }
        
    
}
