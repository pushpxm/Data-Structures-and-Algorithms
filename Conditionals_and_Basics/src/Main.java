import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // subtract the product and sum of digits from an integer
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter intger A ");
    int a = sc.nextInt();
        System.out.println("Enter integer B ");
    int b = sc.nextInt();

    int product = a*b;
        System.out.println("THe prodcut is "+ product);
    int sum=0;
    int rem =0;
    int temp = product;
    //sum of digits program->
        while (temp>0){
            rem= temp%10;
            sum = sum + rem;
            temp = temp / 10;
        }
        System.out.println("THe sum of the product is "+ sum);
        int ans = product-sum;
        System.out.println(" and the final result is = "+ ans);

    }
}