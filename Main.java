import java.util.*;
public class Main {
    public static void revers_string(String input)
    {
        System.out.println("Your Original word ----" +input);
        String rverse="";
        for(int i=input.length()-1;i>=0;i--)
        {
            rverse=rverse+input.charAt(i);
        }
        System.out.println("your reverse word -----"+rverse);
    }
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter your word\n");
       String input =sc.nextLine();
       revers_string(input);
    }
}