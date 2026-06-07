import java.util.Scanner;

public class inp{
    public static void main(String[] args){
        System.out.println("what is your name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("what is your last name ");
        Scanner sd = new Scanner(System.in);
        String lastname = sc.nextLine();

        System.out.println(name+ "" +lastname);
    }
}