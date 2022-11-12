package frajamomo.mastermind.views.console;

import frajamomo.mastermind.models.Result;
import frajamomo.utils.WithConsoleView;

class ResultView extends WithConsoleView {
    
    private Result result;

    ResultView(Result result) {
        this.result = result;
    }

    void writeln() {
        Message.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
    }

}
