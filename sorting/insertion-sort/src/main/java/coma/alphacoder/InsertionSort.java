package coma.alphacoder;

public class InsertionSort {

    public int[] insertionSort(int [] nums){

        for(int i=1; i< nums.length; i++){
            for(int j=i; j>0; j--){
                if(nums[j]> nums[j-1]){
                    break;
                }
                if(nums[j-1]> nums[j]){
                    int temp= nums[j];
                    nums[j]= nums[j-1];
                    nums[j-1]= temp;
                }
            }
        }

        return nums;
    }
}
