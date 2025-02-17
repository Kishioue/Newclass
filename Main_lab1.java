// import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Neo Sahye
 */

 public class Main {
  public static void main(String[] args) {
      System.out.println("hello, world!");

      Lab1 lab = new Lab1();
      
      // Create an array with values
      int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};

      // Output the array in order using a while loop
      System.out.println("Array in order:");
      int i = 0;
      while (i < nums.length) {
          System.out.print(nums[i] + " ");
          i++;
      }
      System.out.println();

      // Output the array in reverse using a for loop
      System.out.println("Array in reverse:");
      for (int j = nums.length - 1; j >= 0; j--) {
          System.out.print(nums[j] + " ");
      }
      System.out.println();

      // Output the first and last values of the array
      System.out.println("First value: " + nums[0]);
      System.out.println("Last value: " + nums[nums.length - 1]);

      // Call the methods created in Lab1
      System.out.println("Max of 5 and 9: " + lab.max(5, 9));
      System.out.println("Min of 5 and 9: " + lab.min(5, 9));
      System.out.println("Sum of array: " + lab.sum(nums));
      System.out.println("Average of array: " + lab.average(nums));
      System.out.println("Max of array: " + lab.max(nums));
      System.out.println("Min of array: " + lab.min(nums));
  }
}

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
      return ++num;
  }

  public int max(int a, int b) {
      return (a > b) ? a : b;
  }

  public int min(int a, int b) {
      return (a < b) ? a : b;
  }

  public int sum(int[] nums) {
      int total = 0;
      for (int num : nums) {
          total += num;
      }
      return total;
  }

  public double average(int[] nums) {
      double total = 0;
      for (int num : nums) {
          total += num;
      }
      return total / nums.length;
    }
  public int max(int[] nums) {
      int maxValue = nums[0];
      for (int i = 1; i < nums.length; i++) {
          if (nums[i] > maxValue) {
              maxValue = nums[i];
          }
      }
      return maxValue;
  }

  public int min(int[] nums) {
      int minValue = nums[0];
      for (int i = 1; i < nums.length; i++) {
          if (nums[i] < minValue) {
              minValue = nums[i];
          }
      }
      return minValue;
  }
}