package Day3;

public class nestedif {
 public static void main(String [] args){
    int age = 20;
    boolean hasID = true;
    if (age >= 18){
        if (hasID){
            System.out.println("Enter allowed");
        }else{
            System.out.println("You cannot enter");
        }
    }
    else{
        System.out.println("Too young");

    }
 }
    
}
