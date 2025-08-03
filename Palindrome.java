class Palindrome {
    public boolean palindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String args[]){
        Palindrome p=new Palindrome();
        if(p.palindrome("madam")){
            System.out.println("The given sequence is Palindrome");
        }
        else{
            System.out.println("The given sequence is not Palindrome");
        }
    }
}