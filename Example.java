
package apnikaksha;
import java.util.Scanner;
public class Example {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ratings");
        int Ratings = sc.nextInt();
        
        switch(Ratings){
            
            case 1:
            case 2:
                System.out.println("Bad");
                break;
                
            case 3:
                
                System.out.println("Average");
                break;
            
            case 4:
            case 5:
                System.out.println("Good");
                break;
                
            default:
                System.out.println("Invalid option");
        }
        
    }
    
}
