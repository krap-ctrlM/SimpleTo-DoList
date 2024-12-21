
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nВыберите операцию (1: Добавить, 2: Удалить, 3: Просмотреть, 4: Выйти): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Введите название задачи: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Задача добавлена.");
                    break;
                case 2:
                    System.out.print("Введите индекс задачи для удаления: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("Задача удалена.");
                    } else {
                        System.out.println("Неверный индекс.");
                    }
                    break;
                case 3:
                    System.out.println("Список задач:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + ": " + tasks.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный выбор.");
            }
        }
    }
}
