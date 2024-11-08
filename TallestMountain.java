// 2 Given a list of N integeres, representing height of mountains. Find the height of the tallest mountain.

public class TallestMountain {

    public static void main(String[] args) {
        int[] heights = {1200, 750, 550, 1100, 1350}; 

        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }

        System.out.println("The height of the tallest mountain is: " + tallest);
    }
}