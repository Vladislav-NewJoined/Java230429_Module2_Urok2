import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
//package com.company;

// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// 6.	В файле две строки: секретное слово и подсказка.
// Вывести подсказку. Считывать строку за строкой, пока игрок
// не отгадает секретное слово (не введёт его)
public class Task2_2_6 {
// Как создать файл .txt и как сделать запись в него, инфо здесь: https://yandex.ru/video/preview/9761637152705084468
        public static void main(String[] args) throws IOException {
        System.out.println("Задание: \n6.\tВ файле две строки: секретное слово и подсказка. \nВывести подсказку. Считывать строку за строкой, пока игрок \nне отгадает секретное слово(не введёт его)\n");
        System.out.println("Решение: ");

//        File myFile = new File("src\\");
//        myFile.createNewFile();
//        String str = "";
//        Scanner scanner = new Scanner(System.in);
//        while (!str.equals("Хватит")) {
//            System.out.println("Еще не хватит");
//            System.out.println("Введите строку: ");
//            str = scanner.nextLine();
//        }
//        System.out.println("Ладно, достаточно");

//            try {
//                Printwriter writer =
//                        new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
//                writer.println("Каракас");
//                writer.flush();
//                writer.close();
//            }catch (IOException ex){
//                ex.printStackTrace();
//            }

            try {
//            File textForTask = new File("src\\" + "text.txt"); // todo восстановить
//            textForTask.createNewFile(); // todo восстановить
                FileWriter writer = new FileWriter("src\\" + "text2.txt");
                writer.write("Hello world! Again...");
                writer.close();

            }catch (IOException ex) {
                ex.printStackTrace();
            }




    }
}

