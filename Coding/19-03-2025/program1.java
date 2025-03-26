public class Program1{
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4,5,0,0,53,234,0,233};
        int l=nums.length;
        int left=0;
        for(int right=0;right<l;right+=1){
            if (nums[right]!=0){
                nums[left]=nums[right];
                nums[right]=0;
                left+=1;
            }
        }
        for(int i:nums){
            System.out.print(i+ " ");
        }
    }
}