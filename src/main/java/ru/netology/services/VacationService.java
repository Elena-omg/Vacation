package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - income) / 3;
            } else {
                money = (money + income) - expenses;
            }
        }
        return count;
    }
}
