import java.io.*;
import java.util.Scanner;


/* 8.	Первый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй.
Игра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово противника.*/

// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Видеоурок здесь: https://lms.synergy.ru/learning/view/68494

public class Task2_2_8 {

    //        Пример 10 ППППППППППППППППППППППППППППП УДАЛСЯ!!!!!!!!!!!!!!!!!! ( Доработанный Пример 3 )
    public static void main(String[] args) {
        System.out.println("Задание: \n8.\tПервый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй. \nИгра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово \nпротивника.\n");
        System.out.println("Решение: ");

        // Первый игрок создает файл и пишет подсказку
        System.out.println("Первый игрок создает файл 'textForTask_8_First_Player.txt'. В нем две строки: " +
                "секретное слово и подсказка: \nПариж\nФранция\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
        System.out.println("Подсказка: \nФранция\n");
        String secrWord_Of_First_Player = "Париж";
        File myFile_First_Player = new File("src\\" + "textForTask_8_First_Player.txt");

        try {
            PrintWriter writer_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, false)));
            writer_First_Player.println("Париж");
            writer_First_Player.flush();
            writer_First_Player.close();
            PrintWriter writer2_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, true)));
            writer2_First_Player.println("Франция");
//            writer2_First_Player.flush();
            writer2_First_Player.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Второй игрок создает файл и пишет подсказку
        System.out.println("Второй игрок создает файл 'textForTask_8_Second_Player.txt'. В нем две строки: " +
                "секретное слово и подсказка: \nМадрид\nИспания\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
        System.out.println("Подсказка: \nИспания\n");
        String secrWord_Of_Second_Player = "Мадрид";
        File myFile_Second_Player = new File("src\\" + "textForTask_8_Second_Player.txt");

        try {
            PrintWriter writer_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, false)));
            writer_Second_Player.println("Мадрид");
            writer_Second_Player.flush();
            writer_Second_Player.close();
            PrintWriter writer2_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, true)));
            writer2_Second_Player.println("Испания");
//            writer2_Second_Player.flush();
            writer2_Second_Player.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Теперь поочерёдно вводят слова
        String str_FromFirstPl = "";
        String str_FromSecondPl = "";

        Scanner scanner_FromFirst_Player = new Scanner(System.in); // видео мин 23.05
        Scanner scanner_FromSecond_Player = new Scanner(System.in);

        while (true) {
            System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");
            str_FromFirstPl = scanner_FromFirst_Player.nextLine();
            if ((secrWord_Of_Second_Player.contains(str_FromFirstPl)) && (!str_FromFirstPl.equals(secrWord_Of_Second_Player)) && (!str_FromFirstPl.equals(""))) {
                System.out.println("Горячо.");
            } else if
            ((!secrWord_Of_Second_Player.contains(str_FromFirstPl)) || (!str_FromFirstPl.equals(secrWord_Of_Second_Player)) || (str_FromFirstPl.equals(""))) {
                System.out.println("Не верно.");
            } else {
                System.out.println("Правильно!");
                System.out.println("Победил первый игрок.");
                break;
            }

            System.out.println("Второй игрок: введите строку (т.е. предполагаемое секретное слово): ");
            str_FromSecondPl = scanner_FromSecond_Player.nextLine();
            if ((secrWord_Of_First_Player.contains(str_FromSecondPl)) && (!str_FromSecondPl.equals(secrWord_Of_First_Player)) && (!str_FromSecondPl.equals(""))) {
                System.out.println("Горячо.");
            } else if
            ((!secrWord_Of_First_Player.contains(str_FromSecondPl)) || (!str_FromSecondPl.equals(secrWord_Of_First_Player)) || (str_FromSecondPl.equals(""))) {
                System.out.println("Не верно.");
            } else {
                System.out.println("Правильно!");
                System.out.println("Победил второй игрок.");
                break;
            }
        }
    } //        Конец Примера 10 ККККККККККККККК  ( Доработанный Пример 3 )
}
