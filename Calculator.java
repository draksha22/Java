
package apnikaksha;
import java.util.Scanner;
public class Calculator {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first no");
        int a = sc.nextInt();
        System.out.println("Enter second no");
        int b = sc.nextInt();
        
        System.out.println("Enter the operation");
        sc.nextLine();
        char Operation = sc.nextLine().charAt(0);
        int result = 0;
        
        switch(Operation){
            
            case '+':
                result = a + b;
                break;
                
            case '-':
                result = a - b;
                break;
                
            case '*':
                result = a * b;
                break;
                
            case '/':
                result = a / b;
                break;
                
            default:
                System.out.println("operation is invalid!");
        }
             
        System.out.println("result is " +result);
    }
    
}
