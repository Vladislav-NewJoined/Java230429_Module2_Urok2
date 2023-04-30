// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// 3.	Выведите латинский алфавит от a до z
public class Task2_2_3 {
    public static void main(String[] args) {
        System.out.println("Задание: \n3.\tВыведите латинский алфавит от a до z\n");
        System.out.println("Решение: ");

        char i = 'a';
        while (i <= 'z') {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}
