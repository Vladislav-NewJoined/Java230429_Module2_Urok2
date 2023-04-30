import java.io.File;
import java.io.IOException;

// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// 5.	Создайте 10 тысяч файлов
public class Task2_2_5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Задание: \n5.\tСоздайте 10 тысяч файлов\n");
        System.out.println("Решение: ");

// Создаём директорию по адресу: "files\\"

        int x = 1;
        while (x <= 10000) {
            File file = new File("files\\" + "File" + x);
            file.createNewFile();
            x = x + 1;
        }
        System.out.println("10 тысяч файлов созданы");
    }
}

