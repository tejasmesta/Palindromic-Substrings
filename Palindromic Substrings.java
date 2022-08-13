class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        
        int ans = 0;
        
        for(int i=0;i<n-1;i++)
        {            
            for(int j=i+1;j<n;j++)
            {
                if(isPalin(s.substring(i,j+1)))
                {
                    ans++;
                }
            }
        }
        
        return (ans+n);
    }
    
    boolean isPalin(String s)
    {
        int l =0;
        int h = s.length()-1;
        
        while(l<h)
        {
            if(s.charAt(l)!=s.charAt(h))
            {
                return false;
            }
            l++;
            h--;
        }
        
        return true;
    }
}
