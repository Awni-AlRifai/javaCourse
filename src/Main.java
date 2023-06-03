import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
         int[] nums =  {1,2,3,4,5,6,7};
         int length = 3;
         // reverse the array
        reverse(nums,0, nums.length - 1);
        reverse(nums,length%nums.length, nums.length -1);
        reverse(nums,0, length%nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }

    public static int[] reverse(int[] nums,int begin, int end){

        while(end > begin){
            int temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;
            begin++;
            end--;
        }
        return nums;
    }

}