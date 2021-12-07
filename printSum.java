public class printSum{

    static void sumOfNos(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.print("Sum of Ist "+n+" numbers is: "+sum);
            return;
        }
        sum = sum + i;
        sumOfNos(i+1, n, sum);
    }
    public static void main(String[] args) {
        sumOfNos(1, 10, 0);
    }
}