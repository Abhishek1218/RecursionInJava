public class firstLastStr {

    public static int first = -1;
    public static int last = -1;
    public static void Occurence(String str, int idx, char element){        
        if(idx == str.length()){
            System.out.println("First occurence is at "+first);
            System.out.println("Last occurence is at "+last);
            return;
        }        
        char currChar = str.charAt(idx);
        if(currChar == element){
        if(first == -1)
            {
            first = idx;
            }
        else {
            last = idx;
        }
     }

     Occurence(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = " abbaacldaaallab";
        Occurence(str, 0, 'a'); 
    }
}
