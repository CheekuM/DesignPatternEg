package org.example;

public class MyRemoteControl {
    ICommand iCommand;

    MyRemoteControl() {

    }

    public void setiCommand(ICommand command) {
        this.iCommand = command;

    }

    public void pressButton(){
        iCommand.execute();
    }
}
