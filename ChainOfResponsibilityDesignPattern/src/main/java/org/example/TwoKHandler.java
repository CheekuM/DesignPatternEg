package org.example;

public class TwoKHandler extends HandleRequest {
    TwoKHandler(HandleRequest handleRequest) {
        super(handleRequest);
    }

    public void withdrawRequest(int amount, int count) {
        while (amount >= Constants.TWO_K_HANDLER) {
            amount -= Constants.TWO_K_HANDLER;
            count++;
        }
        log.info("Total No. of " + Constants.TWO_K_HANDLER + ": " + count);
        if (amount > 0) {
            super.withdrawRequest(amount, 0);
        }
    }

}
