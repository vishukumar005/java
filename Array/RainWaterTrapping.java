public class RainWaterTrapping {
  public static int trappedRainWater(int height[]) {
    int n = height.length;
    //calualate left max boundary - array
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for(int i = 1; i<n; i++) {
      leftMax[i] = Math.max(height[i], leftMax[i-1]);
    }
    //calculate right max boundary
    int rightMax[] = new int[n];
    rightMax[n - 1] = height[n- 1];
    for(int i = n-2; i >= 0; i--) {
      rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }
    //loop
    int trappedWater = 0;
    for(int i = 0; i<n; i++) {
      int waterlevel = Math.min(leftMax[i], rightMax[i]);
      trappedWater += waterlevel - height[i];
    }
    return trappedWater;
  }
public static void main(String[] args) {
  int height[] = {4, 2, 0, 6, 3, 2, 5};
  System.out.println("Water level trapped: "+trappedRainWater(height));
}
}
