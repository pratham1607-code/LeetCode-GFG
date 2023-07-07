class Solution {
    public String mergeAlternately(String S1, String S2) {
          StringBuilder sb = new StringBuilder();
        int i=0;
        int n1=S1.length();
        int n2=S2.length();
        while(i<n1 || i<n2){
            if(i<n1){
                sb.append(S1.charAt(i));
            }
            if(i<n2){
                sb.append(S2.charAt(i));
            }
            i++;
        }
        return sb.toString();
        
    }
}