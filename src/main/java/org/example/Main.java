package org.example;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Создание объекта класса Scanner
        Scanner sc = new Scanner(System.in);

        // Запрос у пользователя трёх сторон
        System.out.println("Введите сторону a:");
        int a = sc.nextInt();
        System.out.println("Введите сторону b:");
        int b = sc.nextInt();
        System.out.println("Введите сторону c:");
        int c = sc.nextInt();

        // Проверка условий
        // Первый if проверяет подходят ли стороны и если нет,
        // то переходит в блок else и говорит, что это не треугольник
        // If внутри if'а проверяет на прямоугольный треугольник
        // Первый else if внутри if'а проверяет на равнообедренный, если прошлое условие не выполнилось
        // Второй else if внутри if'а проверяет на равносторонний, если прошлое условие не выполнилось
        // else внутри if'а выдаст в том случае, если ни одно из предыдущих условий не выполнится
        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            if ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b)) {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами прямоугольного треугольника");
            }
            else if ((a == b && a != c) || (b == c && b != a) || (c == a && c != b)) {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами равнобедренного треугольника");
            }
            else if (a == b && a == c && b == c) {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами равностороннего треугольника");
            }
            else {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами обычного треугольника");
            }
        }
        else {
            System.out.println(a + ", " + b + " и " + c + " не являются сторонами треугольника");
        }

    }
}