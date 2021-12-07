public class totalPaths {

    public static int countPaths(int i, int j, int n , int m){
        if(i == n|| j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        // for downwards
        int downPaths = countPaths(i+1, j, n, m);

        // for right
        int rightPaths = countPaths(i, j+1, n, m);

        return (downPaths+rightPaths);
    }
    public static void main(String[] args) {
        int n =3, m=3;
        System.out.print("Total paths: "+countPaths(0, 0, n, m));
    }
}
