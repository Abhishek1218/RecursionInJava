public class peopleToParty {

    public static int callGuests(int n){
        if(n <= 1){
            return 1;
        }

        // single guest
        int way1 = callGuests(n-1);

        // pair
        int way2 = (n-1)*callGuests(n-2);

        return way1+way2;
    }
    public static void main(String[] args) {
        System.out.println(callGuests(5));
    }
}
