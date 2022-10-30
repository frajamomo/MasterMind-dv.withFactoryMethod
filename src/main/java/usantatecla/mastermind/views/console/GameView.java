package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;

class GameView {
    private Game game;

    GameView(Game game) {
        this.game = game;
    }

    void write() {
        Message.TITLE.writeln();
        for (int i = 0; i < this.game.getAttempts(); i++) {
            new ProposedCombinationView(this.game.getProposedCombination(i)).write();
        }
    }
}
