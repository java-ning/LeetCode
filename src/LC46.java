import java.util.*;

/**
 * @author Nwy-java
 */
public class LC46 {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len == 0){
            return res;
        }
        //用栈来保存当前已经选中的元素
        Deque<Integer> path = new ArrayDeque<>();
        //用布尔类型记录值有没有被选中，默认值是false;
        boolean[] used = new boolean[len];
        dfs(nums,len,0,path,used,res);
        return res;
    }

    //depth代表当前递归到了第几层
    private void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {
        //当前递归的层数等于数组的长度的时候，我们所有的长度都考虑完了。
        if(depth == len){
            res.add(new ArrayList<>(path));
            //return;的作用就是跳出当前的递归，执行递归下面的操作，在本题中，我们把1都
            return;
        }
        for (int i = 0; i < len; i++) {
            if(used[i]){
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums,len,depth+1,path,used,res);
            //之前做了什么相应的就要做逆操作，这一步叫做回溯。
            path.removeLast();
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int []nums = {1,2,3};
        LC46 lc46 = new LC46();
        List<List<Integer>> permute = lc46.permute(nums);
        for (List<Integer> list : permute) {
            System.out.println(list);
        }
    }
}
