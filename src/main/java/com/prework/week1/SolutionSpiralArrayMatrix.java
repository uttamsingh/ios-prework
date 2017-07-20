package com.prework.week1;

import java.util.ArrayList;

/**
 * Created by usingh on 7/20/17.
 */
public class SolutionSpiralArrayMatrix {

  public ArrayList<ArrayList<Integer>> generateMatrix(int n) {
    int[][] ret = new int[n][n];
    int left = 0,top = 0;
    int right = n -1,down = n - 1;
    int count = 1;
    while (left <= right) {
      for (int j = left; j <= right; j ++) {
        ret[top][j] = count++;
      }
      top ++;
      for (int i = top; i <= down; i ++) {
        ret[i][right] = count ++;
      }
      right --;
      for (int j = right; j >= left; j --) {
        ret[down][j] = count ++;
      }
      down --;
      for (int i = down; i >= top; i --) {
        ret[i][left] = count ++;
      }
      left ++;
    }
    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    for(int i=0; i < ret.length; i++){
      ArrayList<Integer> row = new ArrayList<Integer>();
      for(int j=0; j < ret.length; j++){
        row.add(ret[i][j]);
      }
      list.add(row);
    }
    return list;
  }
}
