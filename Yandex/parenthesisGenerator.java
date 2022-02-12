/*
Дано целое число n. Требуется вывести все правильные скобочные последовательности 
длины 2 ^ n, упорядоченные лексикографически

В задаче используются только круглые скобки.

Желательно получить решение, которое работает за время, 
пропорциональное общему количеству правильных скобочных последовательностей в ответе, 
и при этом использует объём памяти, пропорциональный n.
*/

package Tasks;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Считали первое число.
        int n = scanner.nextInt();
        bracket(n, "", 0, 0);
    }
    public static void bracket(int count, String s, int left, int right){
        if (left == count && right == count) System.out.println(s);
        else{
            if (left<count) bracket(count, s + '(', left + 1, right);
            if (right<left) bracket(count, s + ')', left, right + 1);
        }
    }

}
