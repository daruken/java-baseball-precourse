package baseball.model.player;

import baseball.contract.Config;
import camp.nextstep.edu.missionutils.Console;

public class Player {
    public String inputNumber() {
        String input = Console.readLine();
        if (!isAllowNumber(input) || input.length() != Config.NUMBER_LENGTH) {
            throw new IllegalArgumentException();
        }

        return input;
    }

    private boolean isAllowNumber(String input) {
        try {
            Double.parseDouble(input);
        } catch (NumberFormatException nfe) {
            return false;
        }

        return true;
    }
}
