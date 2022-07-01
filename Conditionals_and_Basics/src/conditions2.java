import java.util.Scanner;

public class conditions2 {
    public static void main(String[] args) {
        //factorisation problem

        System.out.println("ENter the number");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int fact=1;
        for(int i=1;i<=input;i++){
            fact = fact*i;
        }
        System.out.println(fact);


    }
}
