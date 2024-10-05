import java.util.Scanner;

public class LW1Q3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System .in);

        System.out.println("enter a leath in centimeter ");
        int centimeter= input.nextInt();
        int inch=(int) (centimeter/2.54);
        int feet = inch/12;
        System.out.println("centimeter "+centimeter + "are equale to the "+ feet+ " feet and "+(inch-(feet*12))+" inches");
    }
}
