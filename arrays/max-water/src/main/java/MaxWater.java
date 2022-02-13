public class MaxWater {
    public static void main(String[] args) {
        //int [] arr= {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int [] arr= {1, 1};
        System.out.println(maxArea(arr));
    }

    /*
    Time complexity for this approach is O(N2)
     */
    public static int maxArea(int[] height) {
        int maxWater= 0;

        for(int i=0; i<height.length; i++){
            for(int j=i+1; j< height.length; j++){
                if((min(height[i], height[j])*(j-i))> maxWater){
                    maxWater= min(height[i], height[j])*(j-i);
                }
            }
        }

        return maxWater;

    }

    public static int maxWater()

    private static int min(int num1, int num2){
        if(num1<= num2){
            return num1;
        }else{
            return num2;
        }
    }
}
