import java.util.Scanner;

public class Reverse {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you wanna reverse");
        int number = sc.nextInt();
        int answer = 0;
        while(number>0){
            int rem = number % 10;
            number=number/10;
            answer = answer * 10 + rem;
        }
        System.out.println("The reverse will be "+ answer);

    }
}
