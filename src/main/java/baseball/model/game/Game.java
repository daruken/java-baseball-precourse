package baseball.model.game;

import camp.nextstep.edu.missionutils.Console;

public class Game {
    public boolean isRunning = true;

    public String play() {
        return Console.readLine();
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
