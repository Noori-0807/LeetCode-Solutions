class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        boolean palindrome=true;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            char left = Character.toLowerCase(s.charAt(i));
            char right = Character.toLowerCase(s.charAt(j));
            if(left != right){
                palindrome=false;
                break;
            }
            i++;
            j--;
        }
        return palindrome;
        // if(palindrome){
        //     System.out.println("true");
        // }else{
        //     System.out.println("false");
        // }
}
}
    