import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/* 10.	Пользователь вводит полный путь и название файла. Пока пользователь не ввел путь к существующему файлу, повторять ввод.
Проверить, что файл существует, можно так: File f = new File(); boolean isExists = f.exists();*/

// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Видеоурок здесь: https://lms.synergy.ru/learning/view/68494

public class Task2_2_10 {
    public static void main(String[] args) throws IOException {
        System.out.println("Задание: \n10.\tПользователь вводит полный путь и название файла. \nПока пользователь не ввел путь " +
                "к существующему файлу, повторять ввод. \n" +
                "Проверить, что файл существует, можно так: File f = new File(); boolean isExists = f.exists();\n");
        System.out.println("Решение: ");
        // Создаем файл для проверки FileForTask10.txt
        System.out.println("Создаем файл: 'FileForTask10.txt'.");
        System.out.println("Путь к файлу следующий: C:\\Users\\PC\\IdeaProjectsDrafts\\Draft230429_Module2_Urok2\\src\\FileForTask10.txt");
        System.out.println(); // Добавляем пустую строку, как разделитель

        File file = new File("src/" + "FileForTask10.txt");
        file.createNewFile();

        String fname = "C:\\Users\\PC\\IdeaProjectsDrafts\\Draft230429_Module2_Urok2\\src\\FileForTask10.txt";
        File f = new File(fname);
        boolean isExists = f.exists();
        if (isExists) {

            String enteredString = "";

            Scanner scanner_enteredString = new Scanner(System.in);

            while (!enteredString.equals(fname)) {  // с int на видео мин 20.47
                System.out.println("Введите полный путь и название файла: ");
                enteredString = scanner_enteredString.nextLine();
                if (!enteredString.equals(fname)) {
                    System.out.println("Не верно.");
                } else {
                    System.out.println("Правильно!");
                }
            }
        } else {
            System.out.println("Файл не существует.");
        }

    }
}
