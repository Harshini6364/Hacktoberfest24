class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            if(i%k==0)
                set.add(i/k);
        }
        int c=1;;
        while(set.contains(c)){
            c++;
        }
        return c*k;
    }
}
