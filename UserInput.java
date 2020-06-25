
package apnikaksha;
import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
//        int x = sc.nextInt();
//        
//        double y = sc.nextDouble();
//        
//        System.out.println(x);
//        
//         System.out.println(y);


//          String hello = sc.nextLine();
//          
//          System.out.println(hello);
          
          int p = sc.nextInt();
          float r = sc.nextFloat();
          int t = sc.nextInt();
          float simpleInterest = p*r*t/100;
          
          System.out.println("simple interest is " + simpleInterest);
        
    }
}
