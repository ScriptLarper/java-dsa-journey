import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        System.out.println("Enter temp in C*");
        Scanner inp = new Scanner(System.in);
        float tem = inp.nextFloat();
        float temchnage = (tem * 1.8f) + 32f;
        System.out.println("The temp in Fahrenheit is " + temchnage);
    }
    
}
