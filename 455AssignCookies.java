class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gl = g.length-1;
        int sl = s.length-1;
        int i=0,j=0,ans=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<=gl && j<=sl){
            if(g[i]>s[j]){
                j++;
            }
            else{
                ans++;
            i++;
            j++;
            }
        }
        return ans;
    }
}