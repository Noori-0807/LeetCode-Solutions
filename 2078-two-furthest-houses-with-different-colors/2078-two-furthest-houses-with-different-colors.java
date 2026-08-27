class Solution {
 public int maxDistance(int[] colors) {
int dis=0;
 int n=colors.length;
for(int i=0;i<n;i++){

if(colors[i] != colors[0]){
dis=Math.max(dis,Math.abs(i));

}
if(colors[i] != colors[n-1]){
    dis=Math.max(dis,n-1-i);
}
} 
return dis;                           
}
}
