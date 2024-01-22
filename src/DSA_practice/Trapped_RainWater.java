package DSA_practice;

public class Trapped_RainWater {
    public static int Trapped_Water(int[] height){

        int n = height.length;

        //calculate left max Boundary - array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i=1; i< n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }


        //calculate right max Boundary - array
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1]; //from right side we have to start
        for (int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);


        }


        //loop
        int TrappedWater = 0;
        for (int i=0; i<n; i++){

            //waterlevel = min(Left Max Bound, right max Bound)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);


            //Trapped water = waterLevel - height[i]
            TrappedWater += waterLevel - height[i];

        }

        return  TrappedWater;
    }

    public static void main(String[] args) {
        int[] height = {4,2,5};

        //functionCall
        int TrappedWater = Trapped_Water(height);
        System.out.println("The Amount Of Water Trapped is  : "+TrappedWater+"  Volume Of Water");
    }
}
