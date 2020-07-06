
package apnikaksha;
import java.util.Scanner;
public class AverageMarks {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of students ");
    int n = sc.nextInt();
    int[] marks = new int[n]; 
    
    for(int i = 0; i < n; i++){
        
        System.out.println("Enter marks now");
         marks[i] = sc.nextInt();
        
    }
    int average = 0;
    for(int i = 0; i < n; i++){
        
        average += marks[i];
        
    }
    average /= n;
        System.out.println("the average marks of students are " +average);
    
}
}
