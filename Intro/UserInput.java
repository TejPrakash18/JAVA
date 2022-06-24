import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter User Name...!");
       
        Scanner sc = new Scanner(System.in);
        String UserName = sc.nextLine();
        String Lastname = sc.nextLine();
        System.out.println("UserName is "+ UserName +" "+ Lastname);

        System.out.println("Enetr your Age...! ");
        int age = sc.nextInt();
        System.out.println("Age "+ age);
        
    }
    
}
