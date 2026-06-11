import java.util.Scanner;
public class type_casting {
    public static void main(String[] args){

        // type casting
       int num = (int)23.50f;
       System.out.println("the num "+num);

       // automatic type promotion byte can cast up to 256 byte if we add more it ans with the remainder of the number devided by 256

        byte btnum = (byte)298;
        System.out.println("the byte num is "+btnum);

        // the o/p will be 42 as 298 % 256 is 42 




    }
}