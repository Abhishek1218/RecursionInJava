public class fibonacci {

    // First Way
    // static int fibo(int n){
    //     if(n <= 1){
    //         return n;
    //     }
    //     return (fibo(n -1)+fibo(n-2));
    // }
    // public static void main(String[] args) {
    //     System.out.println(fibo(8));
    // }   

    // Second Way
    static void fibo(int a, int b, int n){
        if (n ==0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        fibo(b, c , n-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n = 7;
        fibo(a,b,n-2);
    }
}
