public class placeTiles {

    public static int putTiles(int n, int m){

        if(n == m){
            return 2;
        }

        if(n<m){
            return 1;
        }

        // place tiles vertically
        int vertically = putTiles(n-m, m);

        // place tiles horizontally
        int horizontally = putTiles(n-1, m);

        return vertically+horizontally;
    }
    public static void main(String[] args) {
        int n = 4, m = 3;
        System.out.println("Total ways to put tiles: "+putTiles(n, m));
    }
}
