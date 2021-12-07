public class power {

    // complexity( O(n) )
    // static int calcPower(int x, int n){

    //     if(n == 0){
    //         return 1;
    //     }
    //     if (x==0 ){
    //         return 0;
    //     } 
    //     return (x *calcPower(x, n-1));
    // }
    // public static void main(String[] args) {

    //     System.out.println(calcPower(2, 5));
    // }

    //for logN complexity x^n
    static int calcPower(int x , int n){
        if(n == 0){
            return 1;
        }
        if (x == 0){
            return 0;
        }

        if (n % 2 == 0) // n is even
        {
            return (calcPower(x, n/2) * calcPower(x, n/2));
        }
        else // n is odd
        {
            return (calcPower(x, n/2) * calcPower(x, n/2) *x);
        }
    }
    public static void main(String[] args) {
        System.out.println(calcPower(2, 5));
    }
}
