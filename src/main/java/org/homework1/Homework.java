package org.homework1;

public class Homework {
    public static void main(String[] args) {
        /*
        2. Создайте все известные примитивы по 1 экземпляру(кроме int и double) и строку двумя разными способами.
         Создайте 3 переменные int в одну строку и 3 переменные double в одну строку.
         */
        byte byteValue = 10;
        short shortValue = 32767;
        long longValue = 2L;
        float floatValue = 2.5F;
        boolean booleanValue = true;
        char symbol = 'a';

        int intFirstValue = 1147483648, intSecondValue = 20, intThirdValue = 4;
        double doubleFirstValue = 11.3D, doubleSecondValue = 2.3D, doubleThirdValue = 1.5D;

        String firstWay = "First way to create a string";
        char[] chars = {'S', 'e', 'c', 'o', 'n', 'd', ' ', 'w', 'a', 'y'};
        String secondWay = new String(chars);
        /*
        3. С созданными переменными напишите 10 примеров с двумя любыми арифметическими операциями в каждом
         (5 дробных результата и 5 целочисленных) и выведите результаты.
         */
        System.out.println("Addition examples");
        System.out.println(intSecondValue + intThirdValue);
        System.out.println(intFirstValue + intThirdValue);
        System.out.println(byteValue + intThirdValue);
        System.out.println(shortValue + byteValue);
        System.out.println(byteValue + longValue);
        System.out.println(" ");
        System.out.println(doubleFirstValue + doubleSecondValue);
        System.out.println(floatValue + doubleThirdValue);
        System.out.println(floatValue + intThirdValue);
        System.out.println(byteValue + floatValue);
        System.out.println(intThirdValue + doubleSecondValue);

        System.out.println("Subtraction examples");
        System.out.println(intFirstValue - intSecondValue);
        System.out.println(intThirdValue - intSecondValue);
        System.out.println(byteValue - intThirdValue);
        System.out.println(shortValue - byteValue);
        System.out.println(byteValue - longValue);
        System.out.println(" ");
        System.out.println(shortValue - floatValue);
        System.out.println(doubleFirstValue - intThirdValue);
        System.out.println(byteValue - floatValue);
        System.out.println(intThirdValue - doubleSecondValue);
        System.out.println(shortValue - floatValue);
        /*
        4. Напишите 10 примеров с арифметическими операциями с присвоением и выведите результат.
         */
        int number = 10;
        System.out.println(number += 4);
        System.out.println(number /= 2);
        System.out.println(number *= 12);
        System.out.println(number -= 51);
        System.out.println(number += 223);
        System.out.println(number /= 3);
        System.out.println(number *= 5);
        System.out.println(number -= 123);
        System.out.println(number *= 3);
        System.out.println(number /= 10);
        /*
        5. Напишите не менее 5 разных примеров используя логические операции с выводом результатов
         (несколько значений "true" & несколько значений "false").
         */
        System.out.println(byteValue > intThirdValue);
        System.out.println(doubleThirdValue < doubleSecondValue);
        System.out.println(!booleanValue);
        System.out.println(doubleFirstValue < doubleSecondValue && intFirstValue > intSecondValue);
        System.out.println(doubleFirstValue > doubleSecondValue || intFirstValue < intSecondValue);
        /*
        6. Создать переменную = 1 и используя инкремент и декремент напечатать: 1 0 1 1 1 2 1 1
         */
        int value = 1;
        System.out.println(value--);
        System.out.println(value++);
        System.out.println(value++);
        System.out.println(--value);
        System.out.println(value++);
        System.out.println(value--);
        System.out.println(value++);
        System.out.println(--value);
        /*
        7. Создать одномерный массив любого размера. Записать в него 10 примитивов
         */
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 100};
    }
}

