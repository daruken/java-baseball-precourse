package baseball.model.player;

import camp.nextstep.edu.missionutils.Console;

import static baseball.contract.Config.BALL_NUMBER_LENGTH;

public class Player {
    public String inputNum() {
        String input = Console.readLine();
        isValidateNumber(input);
        isValidateSizeNumber(input);
        return input;
    }

    public void isValidateNumber(String input) {
        try {
            Double.parseDouble(input);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException();
        }
    }

    public void isValidateSizeNumber(String input) {
        if (input.length() > BALL_NUMBER_LENGTH) {
            throw new IllegalArgumentException();
        }
    }
}
