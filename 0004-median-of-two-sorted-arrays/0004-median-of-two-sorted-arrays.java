class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int totaln=n1+n2;
        int[] newnum=new int[totaln];
        for(int i=0;i<n1;i++){
            newnum[i]=nums1[i];
        }
        int k=0;
        for(int j=n1;j<totaln;j++){
            newnum[j]=nums2[k];
            k++;
        }

        Arrays.sort(newnum);
        if(totaln%2!=0){
            return newnum[totaln/2];
        }
        else{
            return (double)(newnum[totaln/2]+newnum[totaln/2-1])/2;
        }


    }
}