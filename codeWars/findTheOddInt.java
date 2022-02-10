/*
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples
[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
*/

//Если число встретилось нечетное количество раз - операция xor над ним вернет это же число,
//если все остальные числа встречаются четное количство раз, а
public class FindOdd {
  public static int findIt(int[] arr) {
    int xor = 0;
    for (int i = 0; i < arr.length; i++) {
      xor ^= arr[i];
    }
    return xor;
  }
}
