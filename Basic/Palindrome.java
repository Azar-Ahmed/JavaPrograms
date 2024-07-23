public class Palindrome {
    public static void main(String[] args) {
        String  str = "madam";
        String rev = "";

        for(int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(rev.toLowerCase().equals(str.toLowerCase())){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not an Palindrome String");
        }
    }
}
