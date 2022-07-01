import java.util.Scanner;

public class armstrong_number {
    public static void main (String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = scanner.nextInt();
        //System.out.println(isArmstrong(n));

        for(int i=100; i<=999; i++){
            if (isArmstrong(i)){
                System.out.println(i +" ");
            }
        }

    }

        static boolean isArmstrong(int n){
            int sum=0;
            int orignal = n;
        while(n>0){
            int rem = n%10;
            sum = sum + (rem * rem * rem);
            n = n/ 10;
        }
        return orignal==sum;
        }
}
