package com.varkovich.lesson_6.task_2.service;

import com.varkovich.lesson_6.task_2.entity.CreditCard;
import com.varkovich.lesson_6.task_2.utils.TransferOperationResult;

public class TransferService {

    public TransferOperationResult transferMoneyToCard(CreditCard card, double amountOfMoney) {
        if (amountOfMoney < 0) {
            return TransferOperationResult.INVALID_AMOUNT_BELOW_ZERO;
        }
        if (amountOfMoney == 0) {
            return TransferOperationResult.INVALID_AMOUNT_EQUALS_ZERO;
        }

        card.currentAmount = card.currentAmount + amountOfMoney;

        return TransferOperationResult.SUCCESSFUL_TRANSACTION;
    }

    public TransferOperationResult withdrawingMoneyFromACard(CreditCard card, double amountOfMoney) {
        if (amountOfMoney < 0) {
            return TransferOperationResult.INVALID_AMOUNT_BELOW_ZERO;
        }
        if (amountOfMoney == 0) {
            return TransferOperationResult.INVALID_AMOUNT_EQUALS_ZERO;
        }

        if (card.currentAmount < amountOfMoney) {
            return TransferOperationResult.INVALID_AMOUNT_MORE_THEN_ON_ACCOUNT;
        }

        card.currentAmount = card.currentAmount - amountOfMoney;

        return TransferOperationResult.SUCCESSFUL_TRANSACTION;
    }
}
