package com.java.dsa.recursion;

import java.util.*;

public class IntegerPermutation {
    public static void main(String[] args) {
      int[] arr = new int[5];
      for (int i=0; i<5; i++) arr[i] = i;
      permutation(arr, 0, 5);
    }
    private static void permutation(int[] arr, int i, int length) {
      if (length == i) {
        printArray(arr, length);
        return;
      }
      int j=i;
      for(j=i; j<length; j++) {
        swap(arr, i, j);
        permutation(arr, i+1, length);
        swap(arr, i, j);
      }
      return;
    }
    private static void printArray(int[] arr, int length) {
      System.out.print("\n Values stored in array are : ");
      for (int i = 0; i < length; i++)
        System.out.print(" " + arr[i]);
    }
    private static void swap(int[] arr, int x, int y) {
      int temp = arr[x];
      arr[x] = arr[y];
      arr[y] = temp;
    }
}