package org.example;

import java.util.logging.Logger;

public abstract class HandleRequest {
    public static final Logger log = Logger.getLogger(String.valueOf(HandleRequest.class));

    HandleRequest nextWithdrawHandler;

    HandleRequest(HandleRequest handleRequest) {
        nextWithdrawHandler = handleRequest;
    }

    public void withdrawRequest(int amount, int count) {
        if (nextWithdrawHandler != null) {
            nextWithdrawHandler.withdrawRequest(amount, count);
        } else {
            if (amount > 0) {
                log.info("Not enough currency...");
            }
        }
    }
}
