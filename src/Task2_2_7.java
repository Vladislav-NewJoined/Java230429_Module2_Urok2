import java.io.*;
import java.util.Scanner;


/* 7.	Предыдущее задание, но если пользователь ввел хотя бы часть слова верно, то писать: горячо.
(Проверять с помощью str.contains).*/

// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Видеоурок здесь: https://lms.synergy.ru/learning/view/68494


public class Task2_2_7 {
    public static void main(String[] args) throws IOException {
        System.out.println("Задание: \n7.\tПредыдущее задание, но если пользователь ввел хотя бы часть слова верно, \nто писать: горячо. (Проверять с помощью str.contains).\n");
        System.out.println("Решение: ");


        System.out.println("Создаем файл 'textForTask_7.txt'. В нем две строки: секретное слово и подсказка: \nКаракас\nВенесуэлла\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
        System.out.println("Подсказка: \nВенесуэлла\n");
        String secrWord = "Каракас";
        File myFile = new File("src\\" + "textForTask_7.txt");

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, false)));
            writer.println("Каракас");
            writer.flush();
            writer.close();
            PrintWriter writer2 = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer2.println("Венесуэлла");
            writer2.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in); // видео мин 23.05
        System.out.println("Введите строку (т.е. предполагаемое секретное слово): ");
        String str = scanner.nextLine();

        while (!str.equals("Каракас")) {
            if ((secrWord.contains(str)) && (!str.equals(""))) {
                System.out.println("Горячо.");
                System.out.println("Введите другую строку (т.е. предполагаемое секретное слово): ");
                str = scanner.nextLine();
            } else {
                System.out.println("Не верно.");
                System.out.println("Введите другую строку (т.е. предполагаемое секретное слово): ");
                str = scanner.nextLine();
            }
        }
        System.out.println("Правильно!");
    }
}