import java.util.Scanner;
import java.util.StringTokenizer;

public class LW1Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter full name ");
        String name = input.nextLine();
        String names[] = new String[3];
        int i=0;
        StringTokenizer st =new StringTokenizer(name," ");
        while(st.hasMoreTokens())

        {

            names[i]= st.nextToken();
            i++;



        }

        System.out.println(names[1]+ " "+ names[0].charAt(0)+".");

    }

}