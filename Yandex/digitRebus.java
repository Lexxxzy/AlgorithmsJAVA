/*
Алиса изучает английский язык. Ей надоела обычная речь, поэтому она решила говорить числовыми ребусами:
1.	Каждой строчной букве латинского алфавита Алиса сопоставила двоичный разряд, начиная с младшего: a — 0-й разряд, b — 1-й, …, z — 25-й.

2.	Чтобы произнести букву, Алиса инвертирует соответствующий букве бит в специальной переменной W и сообщает новое значение W в десятичной системе.

Определение: инверсия бита j в числе x  — изменение значения j-го разряда числа x в двоичной системе на противоположное (0 становится 1, 1 становится 0).
Пример: число 15 (1111) после инверсии бита 2 становится равным числу 11 (1011).

3.	Также Алиса произносит пробел, используя для этого 26-й разряд.

Значение переменной W перед произнесением Алисой первого символа равно 0.
Напишите программу, которая переведет сказанный Алисой числовой ребус.
Примечание: Алиса использует пробел наравне с буквами латинского алфавита  — для пробела не существует дополнительных ограничений и условий для его произнесения.

Формат ввода

В первой строке содержится единственное целое число n (1≤n≤500)  — количество чисел, сказанных Алисой.
Во второй строке расположено n целых чисел Wi (0≤Wi<227)  — значения переменной W после произнесения Алисой i-го символа.
Формат вывода

В единственной строке выведите n символов  — строчные буквы латинского алфавита или пробел в порядке произнесения их Алисой.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.abs;
import static java.lang.Math.log;

public class Application {
    public static void main(String[] args) throws IOException {
        List<Integer> arr;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine().strip());
            arr = Arrays.asList(reader.readLine().strip().split(" "))
                    .stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        }
        char[] alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ".toLowerCase().toCharArray();
        StringBuilder res = new StringBuilder();
        res.append(alph[(int)((log(abs(arr.get(0)))) / log(2))]);
        for(int i = 1; i<arr.size(); i++)
        {
            int digit = (int) ((int)((log(abs(arr.get(i)-arr.get(i-1)))) / log(2)));
            if(digit>26) digit-=1;
            res.append(alph[digit]);
        }
        System.out.println(res);
    }
}
