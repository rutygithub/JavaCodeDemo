public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        //https://leetcode.com/problems/find-peak-element/solution/
        //Time complexity O(logN)
        //Space complexity O(1)
        //具体建leetcode solution,我们每次都把不符合peak的candidate去掉,然后保留可能的candidate,最后跳出loop,只留下l=r的一个元素就是解
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return r;//最终l和r会到达同一个点，然后跳出loop,所以return l 也是可以的
    }
}
