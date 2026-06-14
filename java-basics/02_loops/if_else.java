import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        System.out.println("Enter your Salary -");
    Scanner inp = new Scanner(System.in);
    int Salary = inp.nextInt();
if (Salary > 15000){
    Salary = Salary + 2000;
}
else {
    Salary = Salary + 1000;
}

System.out.println("Your new salary is "+Salary);
    }

}
