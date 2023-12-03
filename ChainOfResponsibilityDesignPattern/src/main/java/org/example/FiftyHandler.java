package org.example;

public class FiftyHandler extends HandleRequest {
    FiftyHandler(HandleRequest handleRequest) {
        super(handleRequest);
    }

    public void withdrawRequest(int amount, int count) {
        while (amount >= Constants.FIFTY_HANDLER) {
            amount -= Constants.FIFTY_HANDLER;
            count++;
        }
        log.info("Total No. of " + Constants.FIFTY_HANDLER + ": " + count);
        if (amount > 0) {
            super.withdrawRequest(amount, 0);
        }
    }

}
