class Solution {
    public String defangIPaddr(String address) {
        String ans="";
        for(int i=0;i < address.length();i++){
        char temp=address.charAt(i);
        if(temp=='.'){
            ans=ans+"[.]";
        }
        else{
            ans=ans+temp;
        }

    }
    return ans;
}
}