package com_test;

public class GoldMine {
    private int[][] goldMine = null;
public GoldMine(int[][] goldMine) {
    this.goldMine = goldMine;
        	    }

        	    public int getMaxGold() {

        	        if (goldMine == null || goldMine.length == 0) {
            	            return 0;
                    }int rowLength = goldMine.length;
        	        int colLength = goldMine[0].length;


               int[][] goldMineTable = new int[rowLength][colLength];
        	        for (int i = 0; i < rowLength; i++) {
            	            for (int j = 0; j < colLength; j++) {
                	                goldMineTable[i][j] = 0;
                	            }}
        	        for (int col = colLength - 1; col >= 0; col--) {
            	            for (int row = 0; row < rowLength; row++) {

                	                int right = col == colLength - 1 ? 0
                	                        : goldMineTable[row][col + 1];

                	                int rightUp = (row == 0 || col == colLength - 1 ? 0
                	                        : goldMineTable[row - 1][col + 1]);

                	                int rightDown = (row == rowLength - 1 || col == colLength - 1 ? 0
                	                        : goldMineTable[row + 1][col + 1]);

                	                goldMineTable[row][col] = goldMine[row][col]
                	                        + Math.max(rightUp, Math.max(right, rightDown));
                	            }
            	        }
        	        int max = 0;

        	        for (int i = 0; i < rowLength; i++) {
            	            max = max < goldMineTable[i][0] ? goldMineTable[i][0] : max;
            	        }
        	        return max;
        	    }

            public static void main(String[] args) {

        	        int[][] mine = { { 1, 3, 1, 5 },
                	                         { 2, 2, 4, 1 },
                                         { 5, 0, 2, 3 },
                { 0, 6, 1, 2 } };

        	        GoldMine goldMine = new GoldMine(mine);
                int maxGold = goldMine.getMaxGold();
                System.out.println(maxGold);
        	    }

        }