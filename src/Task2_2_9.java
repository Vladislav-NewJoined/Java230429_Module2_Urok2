import java.util.Scanner;


/* 9.	Пока пользователь не введёт строку, содержащую пробел, считывайте строки и выводите их первые буквы*/

// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Видеоурок здесь: https://lms.synergy.ru/learning/view/68494


public class Task2_2_9 {
    public static void main(String[] args) {
        System.out.println("Задание: \n9.\tПока пользователь не введёт строку, " +
                "содержащую пробел, считывайте строки и выводите их первые буквы\n");
        System.out.println("Решение: ");

        String strEntered;

        Scanner scanner = new Scanner(System.in); // видео мин 23.05
        System.out.print("Введите строку: ");

        // Задаем действия для первого счетчика
        while (true) {
            strEntered = scanner.nextLine();
            if (!strEntered.contains(" ")) {
                System.out.println("Строка не содержит пробела.");
                System.out.println("Первая буква строки: " + strEntered.charAt(0));
                System.out.print("\nВведите другую строку: ");
            } else {
                System.out.println("Строка содержит пробел!" + "\nПервая буква строки: " + strEntered.charAt(0) + "\nКонец программы!");
                break;
            }
        }
    }
}