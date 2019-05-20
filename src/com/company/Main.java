package com.company;

import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    private static final String PLACE = "-";
    private static final String STARS = "*";
    private static Integer HELPING_VALUE = -2;
    private static Integer HELPING_VALUE2 = 0;
    private static Integer HELPING_VALUE3 = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        RockieToRockstarts(n);

    }
    public static void RockieToRockstarts(int n){
        for (int i = 0; i <= n; i++) {
            HELPING_VALUE += 2;
            if (i > n / 2 + 1) {
                HELPING_VALUE2 += 1;
                HELPING_VALUE3 += 2;
            }
            System.out.println();
            for (int j = 1; j < 4; j++) {

                if (i == 0) {
                    Stream.generate(() -> PLACE).limit(n).forEach(System.out::print);
                    if (j < 3) {
                        Stream.generate(() -> STARS).limit(n).forEach(System.out::print);
                    }
                }

                if (i <= n / 2 && i > 0) {

                    if (j == 1 || j == 3) {
                        Stream.generate(() -> PLACE).limit(n - i).forEach(System.out::print);
                    } else
                        Stream.generate(() -> PLACE).limit(n - HELPING_VALUE).forEach(System.out::print);

                    if (j < 3) {
                        Stream.generate(() -> STARS).limit(n + HELPING_VALUE).forEach(System.out::print);
                    }
                }

                if (i > n / 2 && j < 3) {
                    Stream.generate(() -> PLACE).limit(n / 2 - HELPING_VALUE2).forEach(System.out::print);
                    Stream.generate(() -> STARS).limit(n).forEach(System.out::print);
                    Stream.generate(() -> PLACE).limit(1 + HELPING_VALUE3).forEach(System.out::print);
                    Stream.generate(() -> STARS).limit((2 * n - 1) - HELPING_VALUE3).forEach(System.out::print);
                    Stream.generate(() -> PLACE).limit(1 + HELPING_VALUE3).forEach(System.out::print);
                    Stream.generate(() -> STARS).limit(n).forEach(System.out::print);
                    Stream.generate(() -> PLACE).limit(n / 2 - HELPING_VALUE2).forEach(System.out::print);
                }


            }
            for (int j = 1; j < 4; j++) {

                if (i == 0) {
                    Stream.generate(() -> PLACE).limit(n - HELPING_VALUE).forEach(System.out::print);
                    if (j < 3) {
                        Stream.generate(() -> STARS).limit(n).forEach(System.out::print);
                    }

                }

                if (i <= n / 2 && i > 0) {

                    if (j == 1 || j == 3) {
                        Stream.generate(() -> PLACE).limit(n - i).forEach(System.out::print);

                    } else
                        Stream.generate(() -> PLACE).limit(n - HELPING_VALUE).forEach(System.out::print);

                    if (j < 3) {
                        Stream.generate(() -> STARS).limit(n + HELPING_VALUE).forEach(System.out::print);
                    }

                }
            }
        }
    }

}


