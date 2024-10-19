package com.varkovich.lesson_6.task_2.utils;

public enum TransferOperationResult {
    SUCCESSFUL_TRANSACTION("The operation was completed successfully"),
    INVALID_AMOUNT_BELOW_ZERO("Amount was entered incorrectly, must be above 0"),
    INVALID_AMOUNT_EQUALS_ZERO("Amount was entered incorrectly, must not be equal to 0"),
    INVALID_AMOUNT_MORE_THEN_ON_ACCOUNT("Amount was entered incorrectly, you are trying to withdraw an amount" +
            "greater than what is in your account");

    private final String resultOfTransaction;

    TransferOperationResult(String resultOfTransaction) {
        this.resultOfTransaction = resultOfTransaction;
    }

    public String getResultOfTransaction() {
        return resultOfTransaction;
    }
}
