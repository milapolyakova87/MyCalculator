import java.util.Scanner;

    public class MyCalculator {
        public static void main(String[] args) {
            // Создаем объект Scanner для ввода данных
            Scanner scanner = new Scanner(System.in);

            // Запрашиваем у пользователя первое число
            System.out.print("Введи первое число: ");
            double num1 = scanner.nextDouble();

            // Запрашиваем у пользователя оператор
            System.out.print("Введи оператор (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Запрашиваем у пользователя второе число
            System.out.print("Введи второе число: ");
            double num2 = scanner.nextDouble();

            // Переменная для хранения результата
            double result = 0;

            // Выполняем операцию в зависимости от введенного оператора
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Ошибка: делить на ноль нельзя!");
                        return; // Завершаем программу
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Ошибка: неверный оператор.");
                    return; // Завершаем программу
            }

            // Выводим результат
            System.out.println("Результат: " + num1 + " " + operator + " " + num2 + " = " + result);

            // Закрываем Scanner
            scanner.close();
        }
    }
