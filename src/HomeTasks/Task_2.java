package HomeTasks;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        task2_1();
        task2_2();
        task2_3();
        task2_4();
        task2_6();
    }

    private static void task2_1() {
        // Найти самое короткое и самое длинное число. Вывести найденные числа и их длину
        String[] array = new String[]{"12", "234", "8495849"};
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        int min = 10;
        int max = 0;
        String minStr = "", maxStr = "";
        for (String number : array) {
            if (number.length() < min) {
                min = number.length();
                minStr = number;
            }
            if (number.length() > max) {
                max = number.length();
                maxStr = number;
            }
        }
        System.out.println("Минимальное число " + minStr + " состоит из " + min
                + " цифр\nМаксимальное число " + maxStr + " состоит из " + max
                + " цифр");
    }


    private static void task2_2() {
        // Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины
        String[] array = new String[]{"1234", "3746321", "376514", "24275"};
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("В порядке возрастания");
        for (String arg : array) {
            String[] splittedArray = arg.split("");
            Arrays.sort(splittedArray);
            System.out.println("В порядке возрастания" + Arrays.toString(splittedArray));
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].length() < array[j + 1].length()) {
                    String tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("В порядке убывания");
        for (String arg : array) {
            String[] splittedArray = arg.split("");
            Arrays.sort(splittedArray);
            System.out.println("В порядке возрастания" + Arrays.toString(splittedArray));
        }
    }

    private static void task2_3() {
        // Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину
        String[] array = new String[]{"1231", "948261", "123", "9843"};
        float average = 0f;
        for (String item : array) {
            average += (float) item.length();
        }
        average /= array.length;
        System.out.println("Средняя длина числа " + average);
        for (String s : array) {
            if (s.length() < average) {
                System.out.println("Длина числа среднего " + s + " меньше среднего." + " Его длина " + s.length());
            }
            if (s.length() > average) {
                System.out.println("Длина числа среднего " + s + " больше среднего." + " Его длина " + s.length());
            }
        }
    }

    private static void task2_4() {
        // Найти число, в котором число различных цифр минимально.
        String[] args = new String[]{"2334", "1123", "6789", "3456"};
        for (String arg : args) {
            String[] splittedArray = arg.split("");
            if (!splittedArray[0].equals(splittedArray[1])
                    && (!splittedArray[1].equals(splittedArray[2]))
                    && (!splittedArray[2].equals(splittedArray[3]))) {
                System.out.println("The first number, where all numbers are different is " + splittedArray[0] + "" + splittedArray[1]
                        + "" + splittedArray[2] + "" + splittedArray[3]);

                // Если таких чисел несколько, найти первое из них
                break;
            }
        }
    }

    private static void task2_5() {
        // 5. Найти количество чисел, содержащих только четные цифры,
        // а среди них количество чисел с равным числом четных и нечетных цифр.
    }

    private static void task2_6() {
        // Найти число, цифры в котором идут в строгом порядке возрастания.
        String[] array = new String[]{"1234", "3746321", "376514", "24275", "234567"};
        for (String i : array) {
            byte[] a = i.getBytes();
            byte[] b = i.getBytes();
            Arrays.sort(b);
            if (Arrays.equals(a, b)) {
                System.out.println("Число, цифры в котором идут в строгом порядке " + i);
                // Если таких чисел несколько, найти первое из них
                break;
            }
        }
    }
}
