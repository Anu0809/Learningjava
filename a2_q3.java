import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=5;
        for (int j=1 ; j<=n ; j++){
            for (int x=0;x<=(n-j);x++){
                System.out.print("\t");
            }
            for (int y=0;y<j;y++){
                System.out.print("*\t");
            }    
            System.out.println();
        }

    }
}
