class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        int minimum = 0;
        int[] diffArray = new int[costs.length];
        for(int i=0;i<costs.length;i++){
            minimum+=costs[i][0];
            diffArray[i] = costs[i][1] - costs[i][0];
        }
        Arrays.sort(diffArray);

        for(int i=0;i<diffArray.length/2;i++){
            minimum += diffArray[i];
        }
        //System.out.println(minimum);
        return minimum;
    }
}