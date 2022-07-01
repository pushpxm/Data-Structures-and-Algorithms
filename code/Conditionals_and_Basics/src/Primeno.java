import java.util.Scanner;

public class Primeno {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number you want to know prime or not ");
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){

        if(n<=1){
            return false;
        }

        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

}
