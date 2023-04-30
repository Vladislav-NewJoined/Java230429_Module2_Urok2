// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// 2.	Выведите числа от 1.5 до 101.5: 1.5,2,2.5,3,3.5...101.5
public class Task2_2_2 {
    public static void main(String[] args) {
        System.out.println("Задание: \nВыведите числа от 1.5 до 101.5: 1.5,2,2.5,3,3.5...101.5" + "\n");
        System.out.println("Решение: ");

        double x = 1.5;
        while (x <= 101.5) {
            System.out.print("  " + x);
            x = x + 0.5;
        }
    }
}
