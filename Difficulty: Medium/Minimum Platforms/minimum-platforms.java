class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n=arr.length;
        int min=1;
        int i=1;
        int j=0;
        int plat=1;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                plat++;
                i++;
            }
            else{
                plat--;
                j++;
            }
            min=Math.max(min,plat);
        }
        return min;
    }
}
