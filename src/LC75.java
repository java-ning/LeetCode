import java.util.Arrays;

/**
 * @author Nwy-java
 */
public class LC75 {
    public static void sortColors(int[] nums) {
        int low = 0;
        int i = 0;
        int high = nums.length - 1;
        while(i<=high){
            if(nums[i] == 0){
                swap(nums,i,low);
                low++;
                i++;
            }
            else if(nums[i] == 1){
                i++;
            }
            else if(high >= i && nums[i] == 2){
                swap(nums,i,high);
                high--;
                i++;
            }
        }
    }
    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
        char a = '我';
        System.out.println(a);

    }
}
