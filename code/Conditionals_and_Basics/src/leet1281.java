public class leet1281 {
    public static void main(String[] args) {
        System.out.println("SO this is");
        System.out.println(subtractProductAndSum(234));
    }
    public static int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while(n>0){
            int r = n%10;
            product = product * r;
            sum = sum+r;
            n = n/10;
        }
        int result = (product-sum);
        return result;
    }
}

