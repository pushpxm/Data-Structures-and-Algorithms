import java.util.Scanner;

public class Counting_Occurences {
    public static void main (String[] args){
        // starting with while
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the number");
        int number = scanner.nextInt();
        //int search = 3;
        System.out.println("Enter the search digit");
        int search = scanner.nextInt();
        int count = 0;
        while(number>0){
            int rem = number%10;
            if(rem==search){
            count++;}
            number=number/10;
        }
        System.out.println("The total occurences of the number is " + count);
    }
}
