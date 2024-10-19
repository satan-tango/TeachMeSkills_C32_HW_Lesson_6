package com.varkovich.lesson_6.task_2;

import com.varkovich.lesson_6.task_2.entity.CreditCard;
import com.varkovich.lesson_6.task_2.service.TransferService;
import com.varkovich.lesson_6.task_2.utils.TransferOperationResult;

/**
 * Создать класс CreditCard c полями номер счета, текущая сумма на счету.
 * Создайте один конструктор с двумя параметрами.
 * Создайте класс TransferService - сервис переводов.
 * Добавьте метод, который позволяет начислять сумму на кредитную карточку.
 * Метод принимает на вход сумму и карту. Внутри метода создайте код,
 * который добавляет переданную в метод сумму к текущей сумме на переданной в метод карте.
 * Добавьте метод, который позволяет снимать с карточки некоторую сумму.
 * Метод принимает на вход сумму и карту. Внутри метода напишиет код,
 * который отнимает переданную сумму от текущей суммы на переданной карте.
 * Добавьте метод, который выводит на консоль текущую информацию о карточке.
 * Продумайте и реализуйте различные проверки внтури методов по снятию/добавленрю:
 * например, передана отрицательное число, передан 0, запрос на снятие суммы большей,
 * чем сейчас на карте и другие возможные проверки.
 * Напишите программу, которая создает три объекта класса CreditCard у которых
 * заданы номер счета и начальная сумма.
 * Тестовый сценарий для проверки:
 * Положите деньги на первые две карточки и снимите с третьей.
 * Выведите на экран текущее состояние всех трех карточек.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        CreditCard firstCard = new CreditCard("4324-3434", 543.3);
        CreditCard secondCard = new CreditCard("9999-3553", 0.121);
        CreditCard thirdCard = new CreditCard("2523-4543", 100000.1);
        TransferService transferService = new TransferService();
        TransferOperationResult transferOperationResult;


        transferOperationResult = transferService.transferMoneyToCard(firstCard, 6.7);
        System.out.println(transferOperationResult.getResultOfTransaction());

        transferOperationResult = transferService.transferMoneyToCard(secondCard, 50);
        System.out.println(transferOperationResult.getResultOfTransaction());

        transferOperationResult = transferService.withdrawingMoneyFromACard(thirdCard, 100000.2);
        System.out.println(transferOperationResult.getResultOfTransaction());


        firstCard.showInformationAboutCard();
        secondCard.showInformationAboutCard();
        thirdCard.showInformationAboutCard();

    }
}
