package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;
import usantatecla.utils.YesNoDialog;

class ResumeView {

    private Game game;

    ResumeView(Game game) {
        this.game = game;
    }

    boolean interact() {
        Message.RESUME.write();
        boolean newGame = new YesNoDialog().read();
        if (newGame) {
            this.game.clear();
        }
        return newGame;
    }
}
