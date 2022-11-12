package frajamomo.mastermind.views.console;

import frajamomo.mastermind.models.Game;
import frajamomo.utils.YesNoDialog;

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
