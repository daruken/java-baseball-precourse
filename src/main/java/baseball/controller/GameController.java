package baseball.controller;

import baseball.contract.Message;
import baseball.model.game.Game;

public class GameController {
    private final Game game = new Game();

    public void play() {
        do {
            this.playGame();
        } while (game.isRunning);
    }

    public void playGame() {
        System.out.println(Message.PLAY);
        String input = game.play();
        System.out.println("input is : " + input);
        
    }

    public void endGame() {
        game.setRunning(false);
        System.out.println(Message.END);
        System.out.println(Message.REPLAY);
    }

    public void terminateGame() {
        System.exit(0);
    }
}
