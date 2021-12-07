public class towersOfHanoi {

    public static void ToHanoi(int n, String src, String help, String dest){

        if(n ==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }

        ToHanoi(n-1, src, dest, help);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        ToHanoi(n-1, help, src , dest);

    }
    public static void main(String[] args) {
        int n = 5;
        ToHanoi(n, "S", "H", "D");
    }
}
