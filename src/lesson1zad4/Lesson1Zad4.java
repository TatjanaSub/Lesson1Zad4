/*
Создайте программу-тест для проверки знаний таблицы
умножения. С помощью случайных чисел создайте 5 примеров.
При правильном ответе — на экране пишется Правильно зеленым
цветом, при неправильном — Ошибка красным цветом. Также
программа в зависимости от результата прохождения тест должна
выставить оценку прохождения теста: если количество
правильных ответов=5, то Молодец, 3 или 4, то Надо бы еще
поучить, меньше 2 — Срочно нужно учить таблицу умножения.
*/

package lesson1zad4;

import java.util.Random;
import java.util.Scanner;

public class Lesson1Zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num1, num2, kol, mult1, mult2;
        kol = 0;
        System.out.println("Таблица умножения ( 5 вопросов )");
        for (int i = 1; i < 6; i++){
            num1 = random.nextInt(12)+1;
            num2 = random.nextInt(12)+1;
            mult1 = num1 * num2;
            System.out.printf("%d. Вычислите: %2d x%3d = ",i,num1,num2);
            mult2 = scanner.nextInt();
            if (mult1 == mult2){
                System.out.println("\u001B[32m Правильно \u001B[30m");
                kol++;
            }else{
                System.out.println("\u001B[31m Ошибка \u001B[30m");
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("Количество правильных ответов: " + kol);
        if (kol == 5){
            System.out.println("Молодец!");
        }else{
            if (kol > 2) {
                System.out.println("Надо бы еще поучить!");
            }else{
                System.out.println("Срочно нужно учить таблицу умножения!");
            }
        }
        System.out.println("-----------------------------------");
    }
    
}
