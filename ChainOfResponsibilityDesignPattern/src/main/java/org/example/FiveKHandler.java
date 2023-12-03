package org.example;

public class FiveKHandler extends HandleRequest {
    FiveKHandler(HandleRequest handleRequest) {
        super(handleRequest);
    }

    public void withdrawRequest(int amount, int count) {
        while (amount >= Constants.FIVE_H_HANDLER) {
            amount -= Constants.FIVE_H_HANDLER;
            count++;
        }
        log.info("Total No. of " + Constants.FIVE_H_HANDLER + ": " + count);
        if (amount > 0) {
            super.withdrawRequest(amount, 0);
        }
    }

}
