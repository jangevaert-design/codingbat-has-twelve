package edu.cnm.deepdive;

/* Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
 */

public class CodingBatHasTwelve {

  private static int[] one = {1, 3, 2};
  private static int[] two = {3, 1, 2};
  private static int[] three = {3, 1, 4, 5, 2};

  public static void main(String[] args) {
    System.out.println("for the array [1, 3, 2], the outcome is " + has12(one) + ".");
    System.out.println("for the array [3, 1, 2], the outcome is " + has12(one) + ".");
    System.out.println("for the array [3, 1, 4, 5, 2], the outcome is " + has12(one) + ".");
  }

  public static boolean has12(int[] nums) {

    boolean foundOne = false;
    boolean foundOneAndTwo = false;

    for (int num : nums) {
      if (num == 1) {
        foundOne = true;
      }
      if (num == 2 && foundOne) {
        foundOneAndTwo = true;
      }
    }
    return foundOneAndTwo;
  }
}
