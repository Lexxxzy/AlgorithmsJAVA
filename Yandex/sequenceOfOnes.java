/*

Ограничение времени	1 секунда
Ограничение памяти	64Mb
Ввод	стандартный ввод или input.txt
Вывод	стандартный вывод или output.txt

Требуется найти в бинарном векторе самую длинную последовательность
единиц и вывести её длину.

Желательно получить решение, работающее за линейное время и при этом проходящее по входному 
массиву только один раз.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {

        int nOnes = 0;
        ArrayList<Integer> arrOnes = new ArrayList<>();
        arrOnes.add(0);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(reader.readLine());
            ArrayList<Integer> arr = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }
            System.out.println(arr);

            for (Integer integer : arr) {
                if (integer == 1) nOnes++;
                else if (nOnes != 0 && integer != 1) {
                    if (nOnes > arrOnes.get(0)) arrOnes.add(0, nOnes);

                    nOnes = 0;
                }
            }
            if(nOnes>arrOnes.get(0))
            {
                arrOnes.add(0,nOnes);
            }
        }


        System.out.println(arrOnes.get(0));
    }

}
