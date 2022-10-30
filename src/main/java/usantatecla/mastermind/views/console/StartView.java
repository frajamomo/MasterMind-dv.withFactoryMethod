package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;

public class StartView extends SubView {

    StartView(Game game){
        super(game);
    }

    void interact() {
        Message.TITLE.writeln();
        new SecretCombinationView().writeln();
    }
}

