package org.example.PS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> solution(int[] nums){
        // sorting the array
        // [-1,0,1,2,-1,-4]
        //[-4,-1,-1,0,1,2]
        //     a  l r
        // since we have sorted array we will keep skipping the elements in in l and a
        List<List<Integer>> res = new ArrayList<>();
        for (int a = 0; a < nums.length - 2; a++){
            if(a > 0 && nums[a] == nums[a - 1])continue;
            int l = a + 1;
            int r =  nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r] + nums[a];
                if(sum > 0)r--;
                if(sum < 0)l++;
                if(sum == 0){
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[a],nums[l],nums[r]));
                    res.add(temp);
                    l++;
                    while (nums[l] == nums[l -1] && l < r )l++;
                }
            }
        }
        return res;
    }


}
