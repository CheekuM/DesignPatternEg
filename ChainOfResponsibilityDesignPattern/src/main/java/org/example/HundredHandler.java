package org.example;

public class HundredHandler extends HandleRequest {
    HundredHandler(HandleRequest handleRequest) {
        super(handleRequest);
    }

    public void withdrawRequest(int amount, int count) {
        while (amount >= Constants.H_HANDLER) {
            amount -= Constants.H_HANDLER;
            count++;
        }
        log.info("Total No. of " + Constants.H_HANDLER + ": " + count);
        if (amount > 0) {
            super.withdrawRequest(amount, 0);
        }
    }

}
