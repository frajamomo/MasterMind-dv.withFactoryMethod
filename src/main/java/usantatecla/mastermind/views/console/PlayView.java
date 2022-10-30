package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.utils.WithConsoleView;

class PlayView extends WithConsoleView {

    private Game game;
    
    private SecretCombinationView secretCombinationView;

    PlayView(Game game) {
        this.game = game;
        this.secretCombinationView = new SecretCombinationView();
    }

    boolean interact() {
        
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        
        this.game.addProposedCombination(proposedCombination);
        
        this.console.writeln();		
        Message.ATTEMPTS.writeln(this.game.getAttempts());		
        for (int i = 0; i < this.game.getAttempts(); i++) {
            new ProposedCombinationView(this.game.getProposedCombination(i)).write();
            new ResultView(this.game.getResult(i)).writeln();
        }
        this.secretCombinationView.writeln();
        
        if (this.game.isWinner()) {
            Message.WINNER.writeln();
            return true;
        } else if (this.game.isLooser()) {
            Message.LOOSER.writeln();
            return true;
        }
        return false;
    }

}
