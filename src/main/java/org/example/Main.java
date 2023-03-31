package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //1-Вывод на консоль товаров, начинающихся на букву "к":
        System.out.println("1) Список товаров, начинающихся на букву \"к\":");
        List<String> officeSupplies = Arrays.asList("карандаш", "маркер", "клей", "замазка", "краски", "книга", "папка");
        officeSupplies.stream()
                .filter(o -> o.startsWith("к")).forEach(System.out::println);

        System.out.println("-------------------------------------------------\n" +
                "2) Список книг по алфавитном порядке: ");

        List<String> books = Arrays.asList("Алгоритмы.Построение и анализ", "Совершенный код",
                "Полное руководство Java", "Чистый код", "Код.Тайный язык информатики",
                "Совершенный код", "Полное руководство Java");
        books.stream().
                sorted().
                forEach(s -> System.out.println(s));

        System.out.println("-------------------------------------------------\n" +
                "3) Получение списка объектов со статусом \"NEW\":");

        List<User> users = new ArrayList<>();
        User john = new User(1, "john@gmail.com", "NEW");
        User jane = new User(2, "jane.@gmail.com", "SEND");
        User peter = new User(3, "peter.@gmail.com", "NEW");
        User susan = new User(4, "susan.@gmail.com", "SEND");
        User david = new User(5, "david.@gmail.com", "NEW");

        users.add(john);
        users.add(jane);
        users.add(peter);
        users.add(susan);
        users.add(david);

        List<User> userList = users.stream()
                .filter(u -> u.getSendStatus().equals("NEW"))
                .collect(Collectors.toList());

        userList.forEach(user -> System.out.println(user.getEmail()));

        System.out.println("-------------------------------------------------\n"
                + "4) Удаление дубликатов книг из списка:");

        List<String> booksWithoutDuplicates = books.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(booksWithoutDuplicates);

        System.out.println("-------------------------------------------------\n"
                + "5) Проверка наличия сотрудника с именем \"Бакыт\" в списке:");

        List<String> employees = Arrays.asList("Умар", "Бакыт", "Айпери", "Руслан", "Аман");
        boolean bakytContains = employees.stream()
                .anyMatch(employee -> employee.equals("Бакыт"));
        System.out.println(bakytContains);

        System.out.println("-------------------------------------------------\n"
                + "6) Склеивание строк из списка в одну строку,разделяя их точкой заяпятой: ");

        List<String> strings = Arrays.asList("корень", "ветка", "листья", "дерево");
        String joinedString = String.join("; ", strings);
        System.out.println(joinedString);

        System.out.println("-------------------------------------------------\n"
                + "7) Вывод на экран чисел списка, значения которых больше 100:");

        List<Integer> numbers = Arrays.asList(74, 100, 132, 220, 178, 264, 300);
        numbers.stream()
                .filter(number -> number > 100)
                .forEach(System.out::println);

        System.out.println("-------------------------------------------------\n"
                + "8) Вывод на экран среднего значения списка вещественных значений:");
        List<Double> doubles = Arrays.asList(25.5, 18.5, 11.5, 2.3, 7.5);
        OptionalDouble average = doubles.stream()
                .mapToDouble(Double::doubleValue)
                .average();
        System.out.println(average.getAsDouble());

        System.out.println("-------------------------------------------------\n");


    }

}
