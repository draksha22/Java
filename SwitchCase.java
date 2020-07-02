
package apnikaksha;
import java.util.Scanner;
public class SwitchCase {
    
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int dayOfWeek = sc.nextInt();
    
//    if(dayOfWeek == 1){
//        
//}
//    if(dayOfWeek == 2){
//        
//    }
//     if(dayOfWeek == 3){
//        
//    }
//      if(dayOfWeek == 4){
//        
//    }
//       if(dayOfWeek == 5){
//        
//    }
//        if(dayOfWeek == 6){
//        
//    }
//     if(dayOfWeek == 7){
//        
//    }

     switch(dayOfWeek){
         
         case 1:
             System.out.println("I'm on leave");
             break;
             
         case 2:
             System.out.println("I'm in office");
             break;
             
         case 3:
         case 4:
             System.out.println("I'm playing football");
             break;
             
         default:
             System.out.println("I don't know what day it is");
             
         
     }
     

}
    
}
