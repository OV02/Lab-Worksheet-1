import java.util.Scanner;

public class LW1Q1 {
    public static void main(String[]arg){
        String text;
        do{
            Scanner input=new Scanner(System.in);
            System.out.println("Enter an odd Length word: ");
            text=input.next();



        }while (text.length()%2==0);
        int index = (text.length()+1) /2;

        System.out.println("Middle Charactor " +text.charAt(index-1));


    }
}