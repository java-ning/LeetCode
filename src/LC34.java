import java.util.Arrays;

/**
 * @author Nwy-java
 */
public class LC34 {

    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if(len == 0) return new int[]{-1,-1};

        int firstNum = firstNum(nums, target);
        if(firstNum == -1) return new int[]{-1,-1};

        int lastNum = lastNum(nums, target);
        return new int[]{firstNum,lastNum};
    }


    int firstNum(int[] nums,int target){
        int left = 0,right = nums.length - 1;
        while(left<right){
            int mid = left + (right - left)/2;
            if(nums[mid] > target){
                //[left , mid-1]
                right = mid - 1;
            }
            else if(nums[mid] == target){
                //[left,mid]
                right = mid;
            }
            else{
                //[mid+1,right]
                left = mid + 1;
            }
        }

        if(nums[left] == target){
            return left;
        }
        return -1;
    }


    int lastNum(int[] nums,int target){
        int left = 0,right = nums.length - 1;
        while(left<right){
            int mid = left + (right - left + 1)/2;
            if(nums[mid] > target){
                //[left , mid-1]
                right = mid - 1;
            }
            else if(nums[mid] == target){
                //[mid,right]
                left = mid;
            }
            else{
                //[mid+1,right]
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int  target = 8;
        LC34 lc34 = new LC34();
        int[] ints = lc34.searchRange(nums, target);
        System.out.println(Arrays.toString(ints));
    }
}
