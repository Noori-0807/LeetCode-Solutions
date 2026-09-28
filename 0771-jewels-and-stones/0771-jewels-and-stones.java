class Solution {
    public int numJewelsInStones(String jewels, String stones) {
         HashMap <Character,Integer> hm=new HashMap<>();
      for(int i=0;i<stones.length();i++){
          char ch=stones.charAt(i);
             hm.put(ch,hm.getOrDefault(ch,0)+1);
             
          }
          int count=0;
          for(int i=0;i<jewels.length();i++){
              char ch=jewels.charAt(i);
             if(hm.containsKey(ch)){
                 count+=hm.get(ch);
             }
          }
          return count;
      }
    }

        // int count=0;
        // for(int i=0;i<stones.length();i++){
        //    char temp=stones.charAt(i);
        //     if(jewels.indexOf(temp) != -1){
        //      count++;
        //     }
        // }
        // return count;
//     }
// }