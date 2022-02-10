/*
There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains at least 3 numbers.

The tests contain some very huge arrays, so think about performance.
*/
import java.util.HashMap;
import java.util.Map;

 public class Kata {
    public static double findUniq(double arr[]) {
      // Do the magic
      
      HashMap<Double,Integer> map = new HashMap<>(arr.length);

      for(double num : arr)
      {
          Integer amount= map.get(num);
          
        //Проверяем есть ли уже такое число в нашей структуре и если есть прибавляем к Value +1
          map.put(num, amount==null ? 1 : amount+1);
      }

      for(Map.Entry<Double, Integer> e : map.entrySet())
      {
          if(e.getValue() == 1)
          {
              return e.getKey();
          }
      }

      return -1;
  }
}

//работет за O(N)
