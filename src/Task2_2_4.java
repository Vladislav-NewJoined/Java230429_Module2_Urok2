// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// 4.	Выведите русский алфавит от а до я
public class Task2_2_4 {
    public static void main(String[] args) {
        System.out.println("Задание: \n4.\tВыведите русский алфавит от а до я\n");
        System.out.println("Решение: ");

        char i = 'а';
        while (i <= 'я') {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}
