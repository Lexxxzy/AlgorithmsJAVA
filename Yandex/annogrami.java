/*
Даны две строки, состоящие из строчных латинских букв. Требуется определить,
являются ли эти строки анаграммами, т. е. отличаются ли они только порядком 
следования символов.
*/

import java.io.*;

public class Application {
    private static final String FILE_INPUT = "input.txt";
    private static final String FILE_OUTPUT = "output.txt";
    private static BufferedReader bufferedReader = null;
    private static BufferedWriter bufferedWriter = null;

    public static void main(String[] args) throws Exception {
        init();
        run();
        close();

    }
    private static void init() throws IOException {
        bufferedReader = new BufferedReader(new FileReader(FILE_INPUT));
        bufferedWriter = new BufferedWriter(new FileWriter(FILE_OUTPUT));
    }

    private static void close() throws IOException {
        bufferedWriter.close();
        bufferedReader.close();
    }

    private static String readLine() throws IOException {
        return bufferedReader.readLine();
    }

    private static void writeLine(char IntToFile) throws IOException {
        bufferedWriter.write(IntToFile);
        bufferedWriter.newLine();
    }

    private static void run() throws IOException {
        String s = readLine();
        String s1 = readLine();
        //если две одинаковые строки
        if (s1.equals(s)) {
            writeLine('1');
            return;
        }
        //если длина двух не совпадает
        if (s1.length() != s.length()) {
            writeLine('0');
            return;
        }

        int[] alf = new int[26];
        for (int i = 0; i <s.length(); i++) {
            alf[s.charAt(i)-'a']++;
            alf[s1.charAt(i)-'a']--;
        }
        for (int i = 0; i <26; i++) {
		//если где-то в массиве будет единица или больше единицы, 
		//значит эта буква повторяется в одной строке больше чем в другой
            if (alf[i] != 0) {
                writeLine('0');
                return;
            }
        }
        writeLine('1');
    }

}
