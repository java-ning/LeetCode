/**
 * @author Nwy-java
 */
public class LC1608 {
        public static int specialArray(int[] nums) {
            int len = nums.length;
            int temp = len;
            int temp1 = temp;
            for(int i = 0;i<len;i++){
                temp = temp1;
                for(int j = 0;j<len;j++){
                    if(nums[j]>=temp1){
                        temp --;
                    }
                }
                if(temp == 0) {
                    return temp1;
                }
                temp1 --;
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] test = new int[]{3,9,7,8,3,8,6,6};
        int i = specialArray(test);
        System.out.println(i);
    }
}
