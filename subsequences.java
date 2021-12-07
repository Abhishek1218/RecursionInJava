import java.util.HashSet;

public class subsequences {

    // public static void printSubsequences(String str, int idx, String newString){

    //     if(idx == str.length()){
    //         System.out.println(newString);
    //         return;
    //     }

    //     char currChar = str.charAt(idx);
    //     // to be
    //     printSubsequences(str, idx+1, newString+currChar);

    //     // not to be
    //     printSubsequences(str, idx+1, newString);
    // }
    // public static void main(String[] args) {
    //     String str = "abc";
    //     printSubsequences(str, 0, "");
    // }


    // for unique subsequences
    public static void printSubsequences(String str, int idx, String newString, HashSet<String> set){

        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
            System.out.println(newString);
            set.add(newString);
            return;
            }
        }

        char currChar = str.charAt(idx);
        // to be
        printSubsequences(str, idx+1, newString+currChar,set);

        // not to be
        printSubsequences(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "aaa";
        printSubsequences(str, 0, "", set);
    }


}
