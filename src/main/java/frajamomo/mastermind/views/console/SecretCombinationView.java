package frajamomo.mastermind.views.console;

import frajamomo.mastermind.models.SecretCombination;
import frajamomo.utils.WithConsoleView;

public class SecretCombinationView extends WithConsoleView {

    SecretCombinationView() {
        super();
    }

    void writeln() {
        for (int i = 0; i < SecretCombination.getWidth(); i++) {
            Message.SECRET.write();
        }
        this.console.writeln();
    }
}