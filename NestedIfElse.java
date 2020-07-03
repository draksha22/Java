
package apnikaksha;

public class NestedIfElse {
    
    public static void main(String[] args){
    
    int a = 30;
    int b = 23;
    int c = 45;
    int result = 0;
    
    if(a > b){
    
    if(a > c){
        
        result = a;
        
    }else{
        result = c;
    }
    
    }else{
    if(b > c){
        
        result = b;
        
    }else{
        
        result = c;
        
    }
}
    System.out.println("largest of three no is " +result);
    
    }
}
