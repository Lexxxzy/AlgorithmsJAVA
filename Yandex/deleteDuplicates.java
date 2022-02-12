/*
Дан упорядоченный по неубыванию массив целых 32-разрядных чисел.
Требуется удалить из него все повторения.

Желательно получить решение, которое не считывает входной файл целиком в память,
т.е., использует лишь константный объем памяти в процессе работы.
*/
//первое решение - пройдено 192 теста
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class Third {
    static final String input = "input.txt";
    static final String output = "output.txt";
    static BufferedReader br;
    static BufferedWriter bw;
    
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new FileReader(input));
        bw = new BufferedWriter(new FileWriter(output));
        int n = Integer.valueOf(br.readLine());
        String last = "";
        String curr = last;
        for (int i = 0; i < n; i++) {
            curr = br.readLine().intern();
            if (last != curr) {
                last = curr;
                bw.write(curr);
                bw.write('\n');
            }
        }
        br.close();
        bw.close();
    }
}





//второе решение (не проходит тесты) но работает верно :D
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) throws Exception {
      BufferedReader r = new BufferedReader(new FileReader("input.txt"));

        int size = Integer.valueOf(r.readLine());

        int[] sequence = new int[size+1];

        for (int i = 1; i <= size; i++) {
            sequence[i] = Integer.valueOf(r.readLine());
        }

        Arrays.stream(sequence).forEach(value -> System.out.println(value));


        Object[] arr = Arrays.stream(sequence).boxed().collect(Collectors.toSet()).toArray();

        for (int e=1;e<arr.length;e++) {
            System.out.print(arr[e] + " ");
        }

    }

}
