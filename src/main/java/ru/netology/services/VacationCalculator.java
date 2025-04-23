package ru.netology.services;

public class VacationCalculator {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // Начальное состояние счета
        int count = 0; // Счетчик месяцев отдыха

        for (int month = 1; month < 13; month++) {
            if (money >= threshold) { // Проверяем количество денег для отдыха
                count++; // Увеличиваем счетчик месяцев отдыха
                money = money - expenses; // Траты на отдых
                money = money / 3; // Оставляем на отдых 1/3 оставшихся денег
            } else {
                money = money + income; // Заработок
                money = money - expenses; // Траты
            }
        }
        return count;
    }
}