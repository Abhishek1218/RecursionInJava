public class revString {

    public static void printString(String str,int idx ){

        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.println(str.charAt(idx));
        printString(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        printString(str, str.length()-1);
    }
}
