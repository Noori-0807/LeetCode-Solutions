class Solution {
    public int[] replaceElements(int[] arr) {
       int last=(-1);
       int n=arr.length;
       for(int i=n-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=last;
            last=Math.max(last,temp);
        }
       return arr;
    }
}
